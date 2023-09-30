package com.dusskdus.study

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.dusskdus.study.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() {

    lateinit var binding: ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) { //액티비티 생성시 처음으로 실행되는 함수
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root) //song.xml 파일의 뷰들을 사용할것이라고 선언
        binding.songDownIb.setOnClickListener{
         finish() //finish라는 메소드가 실행되며 song.xml이 사라짐
        }

        //이미지뷰 사라지고 숨어있는 이미지 뷰 나오게 하는 코드
        binding.songMiniplayerIv.setOnClickListener {
            setPlayerStatus(false)
        }
        binding.songPauseIv.setOnClickListener {
            setPlayerStatus(true)
        }
    }

    fun setPlayerStatus(isPlaying : Boolean){ //현재 플레이어의 상태 확인
        if(isPlaying){ //노래 나오는중이면
            binding.songMiniplayerIv.visibility = View.VISIBLE //공간차지 하고 보이게
            binding.songPauseIv.visibility = View.GONE //공간차지 안하고 안보이게
        }
        else{
            binding.songMiniplayerIv.visibility = View.GONE
            binding.songPauseIv.visibility = View.VISIBLE
        }
    }
}