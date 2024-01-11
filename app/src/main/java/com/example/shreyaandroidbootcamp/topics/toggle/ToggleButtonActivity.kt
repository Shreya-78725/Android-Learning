package com.example.shreyaandroidbootcamp.topics.toggle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.shreyaandroidbootcamp.R
import com.google.android.material.button.MaterialButtonToggleGroup


class ToggleButtonActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

       var toggle=findViewById<MaterialButtonToggleGroup>(R.id.ToggleGroup)
        toggle.addOnButtonCheckedListener { toggle, checkedId, isChecked ->
            if(isChecked){
                when(checkedId){
                    R.id.btncenter -> showToast("Aligned Center")
                    R.id.btnleft -> showToast("Aligned Left")
                    R.id.btnright-> showToast("Aligned Right")
                    R.id.btnVcenter ->showToast("Aligned Vertically Center")
                }
            }
        }
    }
    private fun showToast(str:String){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }
}