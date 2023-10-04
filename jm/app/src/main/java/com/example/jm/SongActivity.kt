package com.example.jm

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jm.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() { // 안드로이드에서 앱을 사용하기 위해 작성하는 클래스

    lateinit var binding : ActivitySongBinding //ActivitySong xml파일을 연결(바인딩), alt enter >> import 생성(빨간 줄 오류일 시 반드시)

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) { // 액티비티 생성 시 처음 실행되는 함수
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivitySongBinding.inflate(layoutInflater) //inflate는 xml에 포함된 레이아웃을 메모리에 객체화 시키는 행동
        setContentView(binding.root) //가져와서 쓸 xml파일의 뷰, root는 최상단
    }
}