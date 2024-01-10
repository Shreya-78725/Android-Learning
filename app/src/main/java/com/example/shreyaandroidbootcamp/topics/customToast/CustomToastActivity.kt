package com.example.shreyaandroidbootcamp.topics.customToast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.shreyaandroidbootcamp.R

class CustomToastActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_toast)

        var action=supportActionBar
        action!!.title="Custom toast"

        lateinit var click: Button

        var wrap = findViewById<LinearLayout>(R.id.wrapper)
        val layout = layoutInflater.inflate(R.layout.custom_toast, wrap)

       click=findViewById(R.id.btnClick)
        click.setOnClickListener{
            Toast(this).apply{
                duration=Toast.LENGTH_SHORT
                setGravity(Gravity.CENTER,0,0)
                view = layout
            }.show()
        }
    }
}