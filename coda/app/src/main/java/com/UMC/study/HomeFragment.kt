package com.UMC.study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.UMC.study.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.homeTodaySongTitle1Iv.setOnClickListener {
            var AlbumFragment = AlbumFragment()
            val bundle = Bundle()
            bundle.putString("title", binding.homeSongTitle1Tv.text.toString())
            bundle.putString("singer", binding.homeSongSing1Tv.text.toString())

            AlbumFragment.arguments = bundle

            activity?.supportFragmentManager!!.beginTransaction()
                .replace(R.id.main_frm, AlbumFragment)
                .commit()
            // (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm, AlbumFragment()).commitAllowingStateLoss()
        }

        return binding.root
    }
}