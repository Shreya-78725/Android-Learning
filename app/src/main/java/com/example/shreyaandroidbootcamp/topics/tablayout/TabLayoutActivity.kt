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
        val action=supportActionBar
        action!!.title="Tab Layout"

        val viewpager=findViewById<ViewPager>(R.id.pager)
        val tablayout=findViewById<TabLayout>(R.id.tabLayout)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(HomeFragment(),"Home")
        fragmentAdapter.addFragment(ChatFragment(),"Chat")
         viewpager.adapter=fragmentAdapter
        tablayout.setupWithViewPager(viewpager)
    }
}