package com.UMC.study

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.UMC.study.databinding.ActivityMainBinding
import com.UMC.study.databinding.ActivitySongBinding
import kotlinx.coroutines.Dispatchers.Main

class SongActivity : AppCompatActivity() {

    lateinit var binding: ActivitySongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val song = Song(binding.songMusicTitleTv.text.toString(), binding.songSingerNameTv.text.toString())

        if (intent.hasExtra("title") && intent.hasExtra("singer")) { // title과 singer라는 키 값을 가진 것이 intent에 있는지 확인
            // 정보가 둘 다 존재한다면
            binding.songMusicTitleTv.text = intent.getStringExtra("title") // title라는 키 값을 통해서 intent로 전달된 데이터로 해당 text 값을 변경
            binding.songSingerNameTv.text = intent.getStringExtra("singer")
        }

        binding.songDownIb.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(MainActivity.STRING_INTENT_KEY, binding.songMusicTitleTv.text.toString())
            }
            setResult(Activity.RESULT_OK, intent)
            if(!isFinishing) finish()
        }

        binding.songMiniplayerIv.setOnClickListener {
            setPlayerStatus(false)
        }

        binding.songPauseIv.setOnClickListener {
            setPlayerStatus(true)
        }
    }

    fun setPlayerStatus(isPlaying : Boolean) {
        if (isPlaying) {
            binding.songMiniplayerIv.visibility = View.VISIBLE
            binding.songPauseIv.visibility = View.GONE
        }
        else {
            binding.songMiniplayerIv.visibility = View.GONE
            binding.songPauseIv.visibility = View.VISIBLE
        }
    }
}