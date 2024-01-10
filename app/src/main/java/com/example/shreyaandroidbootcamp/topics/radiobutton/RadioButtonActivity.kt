package com.example.shreyaandroidbootcamp.topics.radiobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.shreyaandroidbootcamp.R

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        var action=supportActionBar
        action!!.title="RadioButton"

       val radio=findViewById<RadioGroup>(R.id.rdgrp)
        val back=findViewById<LinearLayout>(R.id.background)

        radio.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.rdbtn1->{
                    back.setBackgroundColor(Color.RED)
                }
                R.id.rdbtn2->{
                    back.setBackgroundColor(Color.YELLOW)
                }
                R.id.rdbtn3->{
                    back.setBackgroundColor(Color.GREEN)
                }
            }
        }

    }
}