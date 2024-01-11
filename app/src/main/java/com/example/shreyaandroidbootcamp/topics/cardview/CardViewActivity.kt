package com.example.shreyaandroidbootcamp.topics.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shreyaandroidbootcamp.R

class CardViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)

        val action=supportActionBar
        action!!.title="CardView"

    }
}