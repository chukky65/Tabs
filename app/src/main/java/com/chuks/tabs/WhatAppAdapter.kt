package com.chuks.tabs

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.chuks.tabs.views.CallFragment
import com.chuks.tabs.views.ChatFragment
import com.chuks.tabs.views.StatusFragment

class WhatAppAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
      when(position){
          0 -> return "Chat"
          1 -> return "Status"
          2 -> return "Call"
          else -> return  "Chat"
      }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return ChatFragment()
            1 -> return StatusFragment()
            2 -> return CallFragment()
            else -> return ChatFragment()
        }
    }
}