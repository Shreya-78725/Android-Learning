package com.example.shreyaandroidbootcamp.topics.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.example.shreyaandroidbootcamp.R

class ToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val cb1=findViewById(R.id.checkBox1) as CheckBox
        val cb2=findViewById(R.id.checkBox2) as CheckBox

        val click=findViewById <Button>(R.id.clickbtn)
        click.setOnClickListener(){
            if(cb1.isChecked && cb2.isChecked)
            {
                Toast.makeText(this,"BOTH SELECTED", Toast.LENGTH_LONG).show()
            }
            else if(cb1.isChecked){
                Toast.makeText(this,"Male", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this,"Female", Toast.LENGTH_LONG).show()
            }
        }
    }
}