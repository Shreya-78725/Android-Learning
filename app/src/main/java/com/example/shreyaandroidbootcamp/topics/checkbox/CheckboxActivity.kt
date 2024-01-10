package com.example.shreyaandroidbootcamp.topics.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shreyaandroidbootcamp.R

class CheckboxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)

        var action=supportActionBar
        action!!.title="CheckBox"
    }
}