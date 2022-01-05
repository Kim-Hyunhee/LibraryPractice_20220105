package com.nepplus.librarypractice_20220105

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgProfilePhoto.setOnClickListener {

//            사진 크게 보기 화면으로 진입 (화면 이동 => Intent - 추가 액티비티 필요)

            val myIntent = Intent(this, ViewphotoActivity::class.java)
            startActivity(myIntent)

        }


//        Glide 이용 => 웹의 이미지를 -> imgRecent에 반영하기

        Glide.with(this).load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.besthdwallpaper.com%2Feumag%2Fitzy-ryujin-loco-myujigbidio-cwalyeong-hyeonjang-the-album-crazy-in-love-dt_ko-80107.html&psig=AOvVaw0ADN8qIhZ0JFwj_jhjsqbn&ust=1641433781360000&source=images&cd=vfe&ved=0CAgQjRxqFwoTCLCAu7-_mfUCFQAAAAAdAAAAABAD").into(imgRecent)

    }
}