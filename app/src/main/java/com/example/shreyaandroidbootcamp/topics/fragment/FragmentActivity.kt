package com.example.shreyaandroidbootcamp.topics.fragment

import android.os.BatteryManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.shreyaandroidbootcamp.R

class FragmentActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        var action = supportActionBar
        action!!.title = "Fragments"
        gotoFragment(Fragment1())
        btn1 = findViewById<Button?>(R.id.btnF1)
        btn1.setOnClickListener {
            gotoFragment(Fragment1())
        }
        btn2 = findViewById<Button?>(R.id.btnF2)
        btn2.setOnClickListener {
            gotoFragment(Fragment2())
        }
        btn3 = findViewById<Button?>(R.id.btnF3)
        btn3.setOnClickListener {
            gotoFragment(Fragment3())
        }

    }

    private fun gotoFragment(fragment: Fragment) {

        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment).commit()
    }

}