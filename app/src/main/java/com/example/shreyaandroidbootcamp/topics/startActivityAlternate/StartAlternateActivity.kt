package com.example.shreyaandroidbootcamp.topics.startActivityAlternate

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.shreyaandroidbootcamp.R

class StartAlternateActivity : AppCompatActivity() {
    lateinit var btn_alt1 : Button
    lateinit var txt_alt1 :TextView

    private val someActivityResultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                // Handle the result data from the SecondActivity
                val data: Intent? = result.data
                val resultData = data?.getStringExtra("keyName")
                // Do something with the resultData
                txt_alt1.text=resultData
            }
        }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_alternate)

        btn_alt1=findViewById(R.id.btn_AltAct1)
        txt_alt1=findViewById(R.id.txt_AltAct1)

    btn_alt1.setOnClickListener{
    val intent = Intent(this, SecondAlternateActivity::class.java)
    someActivityResultLauncher.launch(intent)
}

    }



}