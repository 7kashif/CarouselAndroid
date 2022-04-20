package com.kashif.carouselandroid

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel
import coil.load
import com.kashif.carouselandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imagesList = listOf(
            "https://m.media-amazon.com/images/M/MV5BMjA5ODI0NzIzNV5BMl5BanBnXkFtZTcwMzM0NjI2Nw@@._V1_.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/191125_Taylor_Swift_at_the_2019_American_Music_Awards_%28cropped%29.png/220px-191125_Taylor_Swift_at_the_2019_American_Music_Awards_%28cropped%29.png",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b9/Taylor_Swift_-_Red_Tour_18.jpg/1200px-Taylor_Swift_-_Red_Tour_18.jpg",
            "https://media.wired.com/photos/593240204dc9b45ccec5cd5d/master/pass/GettyImages-474928124.jpg",
            "https://media.glamour.com/photos/618e9260d0013b8dece7e9d8/master/pass/GettyImages-1236509084.jpg",
            "https://media.allure.com/photos/618e821f853edeb0672fea05/2:3/w_2100,h_3150,c_limit/taylor%20swift.jpg",
            "https://st1.bollywoodlife.com/wp-content/uploads/2019/05/Johnny-Depp.jpg",
            "https://st.depositphotos.com/1814084/1733/i/600/depositphotos_17334133-stock-photo-johnny-depp.jpg",
            "https://static01.nyt.com/images/2020/11/09/arts/06depp-item/06depp-item-mediumSquareAt3X-v2.jpg",
            "https://media.glamour.com/photos/56967e30eaefd309768e2986/master/w_1600%2Cc_limit/sex-love-life-blogs-smitten-johnny%2520depp.jpg",
            "https://assetblast.b-cdn.net/wp-content/uploads/2022/01/mega797012_016-scaled.jpg",
            "https://imgix.ranker.com/user_node_img/50010/1000189131/original/johnny-depp-in-stripes-waistcoat-with-long-sleeve-all-people-photo-u1?auto=format&q=60&fit=crop&fm=pjpg&dpr=2&w=375"
        )

        binding.carousel.setAdapter(object : Carousel.Adapter{
            override fun count(): Int  = imagesList.size

            override fun populate(view: View?, index: Int) {
                if(view is ImageView)
                    view.load(imagesList[index])
            }

            override fun onNewItem(index: Int) = Unit
        })

    }
}