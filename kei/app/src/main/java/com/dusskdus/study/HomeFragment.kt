package com.dusskdus.study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dusskdus.study.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.todayReleaseAlbum1ImgIv.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm,AlbumFragment()).commitAllowingStateLoss() //main activity의 레이아웃을 어디서 변경하는지 기록

        }
        return binding.root
    }
}