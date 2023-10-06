package com.UMC.study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.UMC.study.databinding.ActivityMainBinding
import com.UMC.study.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() {

    lateinit var binding: ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("title") && intent.hasExtra("singer")) { // title과 singer라는 키 값을 가진 것이 intent에 있는지 확인
            // 둘 다 존재한다면
            binding.songPlayerTitleTv.text = intent.getStringExtra("title") // title 키 값을 가지고 전달된 데이터로 해당 text 값을 바꿔주는 것
            binding.songPlayerSingerTv.text = intent.getStringExtra("singer")
        }
    }
}