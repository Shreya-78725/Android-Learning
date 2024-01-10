package com.example.shreyaandroidbootcamp.topics.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.shreyaandroidbootcamp.HomeActivity
import com.example.shreyaandroidbootcamp.R

class ThirdPageActivity : AppCompatActivity() {
    lateinit var btn2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)
        btn2=findViewById<Button?>(R.id.button3)
        btn2.setOnClickListener {
            val intent= Intent(this, FirstPageActivity::class.java)
            startActivity(intent)

        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent= Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

}