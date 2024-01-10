package com.example.shreyaandroidbootcamp.topics.progressbar

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import com.example.shreyaandroidbootcamp.R

class ProgressBarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)

     val progress=findViewById<ProgressBar>(R.id.progressBar)
        progress.max=1000
        val currentProgress=600


        ObjectAnimator.ofInt(progress,"progress",currentProgress)
            .setDuration(2000)
            .start()
    }
}