package com.example.shreyaandroidbootcamp.topics.startActivityForResult

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.shreyaandroidbootcamp.R

class StartActivity : AppCompatActivity() {
    lateinit var reDirect : Button
    lateinit var act1:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        reDirect=findViewById(R.id.btn_redirect)
        act1=findViewById(R.id.txt_Activity1)

        reDirect.setOnClickListener{
            val intent= Intent(this,SecondActivity::class.java)
            intent.putExtra("Request_Key","Random string")
            startActivityForResult(intent,111)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode===111)
        {
           act1.text=data!!.getStringExtra("Result_Key")
        }

    }
}