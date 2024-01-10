package com.example.shreyaandroidbootcamp.topics.tablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.shreyaandroidbootcamp.R
import com.google.android.material.tabs.TabLayout

class TabLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        var action=supportActionBar
        action!!.title="Tab Layout"

        var viewpager=findViewById<ViewPager>(R.id.pager)
        var tablayout=findViewById<TabLayout>(R.id.tabLayout)

        var fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(HomeFragment(),"Home")
        fragmentAdapter.addFragment(ChatFragment(),"Chat")
         viewpager.adapter=fragmentAdapter
        tablayout.setupWithViewPager(viewpager)
    }
}