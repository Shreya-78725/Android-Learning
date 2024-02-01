package com.example.shreyaandroidbootcamp.topics.startActivityForResult

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.shreyaandroidbootcamp.R

class SecondActivity : AppCompatActivity() {
    lateinit var act2:TextView
    lateinit var prev : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        act2=findViewById(R.id.txt_Activity2)
        prev=findViewById(R.id.txt_prev)

        prev.text=intent.getStringExtra("Request_Key")
        val intent=Intent()
        intent.putExtra("Result_Key","Got from another")
        setResult(RESULT_OK,intent)
    }
}