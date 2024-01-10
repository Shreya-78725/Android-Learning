package com.example.shreyaandroidbootcamp.topics.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.shreyaandroidbootcamp.R

class SecondPageActivity : AppCompatActivity() {
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        btn1=findViewById<Button?>(R.id.button2)
        btn1.setOnClickListener {
            val intent= Intent(this, ThirdPageActivity::class.java)
            startActivity(intent)



        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}