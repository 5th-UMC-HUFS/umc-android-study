package com.gomsang.blog.study

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gomsang.blog.study.databinding.FragmentLockerBinding

class LockerFragment : Fragment() {

    lateinit var binding: FragmentLockerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerBinding.inflate(inflater, container, false)

        return binding.root
    }
}