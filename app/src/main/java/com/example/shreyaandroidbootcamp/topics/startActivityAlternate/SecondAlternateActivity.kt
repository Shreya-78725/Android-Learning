package com.example.shreyaandroidbootcamp.topics.startActivityAlternate

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.shreyaandroidbootcamp.R

class SecondAlternateActivity : AppCompatActivity() {
    lateinit var alt2 :TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_alternate)

        alt2=findViewById(R.id.txt_AltAct2)

        val resultData = "some data"
        val resultIntent = Intent().apply {
            putExtra("keyName", resultData)
        }
        setResult(Activity.RESULT_OK, resultIntent)
        finish()
    }
}