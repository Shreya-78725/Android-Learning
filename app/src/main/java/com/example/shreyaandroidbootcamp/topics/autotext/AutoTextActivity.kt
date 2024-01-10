package com.example.shreyaandroidbootcamp.topics.autotext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.shreyaandroidbootcamp.R

class AutoTextActivity : AppCompatActivity() {

    lateinit var autocomplete: AutoCompleteTextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_text)
        autocomplete = findViewById(R.id.autoComplete)

        val action=supportActionBar
        action!!.title="AutoText"

        val fruits=arrayOf("Apple","Apricot","Banana","Berry","Litchi")
        val arradp = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruits)
        autocomplete.setAdapter(arradp)

    }
}