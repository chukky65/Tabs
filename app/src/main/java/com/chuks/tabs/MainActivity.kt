package com.chuks.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chuks.tabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var whatAppAdapter: WhatAppAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        whatAppAdapter = WhatAppAdapter(supportFragmentManager)
        binding.pager.adapter =whatAppAdapter
        binding.tabLayout.setupWithViewPager(binding.pager)
    }
}