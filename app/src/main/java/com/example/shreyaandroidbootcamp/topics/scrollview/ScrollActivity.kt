package com.example.shreyaandroidbootcamp.topics.scrollview

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.shreyaandroidbootcamp.R


class ScrollActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll)

        val hbtn=findViewById<Button>(R.id.hzlbtn)
        val vbtn=findViewById<Button>(R.id.vtlbtn)


        vbtn.setOnClickListener {
            val intent= Intent(this, VerticleActivity::class.java)
            startActivity(intent)
        }

        hbtn.setOnClickListener {
            val intent= Intent(this, HorizontalActivity::class.java)
            startActivity(intent)
        }
    }
}