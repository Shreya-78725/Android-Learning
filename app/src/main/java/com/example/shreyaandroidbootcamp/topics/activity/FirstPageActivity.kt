package com.example.shreyaandroidbootcamp.topics.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.shreyaandroidbootcamp.R


class FirstPageActivity : AppCompatActivity() {
    lateinit var btn:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        btn= findViewById<Button?>(R.id.button1)
        btn.setOnClickListener {
            val intent=Intent(this, SecondPageActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}