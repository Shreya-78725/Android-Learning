package com.example.shreyaandroidbootcamp.topics.sharedpreference

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import com.example.shreyaandroidbootcamp.R

class SharedPreference : AppCompatActivity() {

    lateinit var btnVal: Button
    lateinit var et_txt: EditText
    lateinit var tv_txt: TextView
    lateinit var et_Numtxt: EditText
    lateinit var tv_Numtxt: TextView
    lateinit var btn_switch: Switch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        val action=supportActionBar
        action!!.title="Shared Preference"

        btnVal=findViewById(R.id.btnSave)
        et_txt=findViewById(R.id.editName)
        tv_txt=findViewById(R.id.txtShowSaved)
        et_Numtxt=findViewById(R.id.editNum)
        tv_Numtxt=findViewById(R.id.txtNumSaved)
        btn_switch=findViewById(R.id.btnSwitch)
        loadData()

        btnVal.setOnClickListener{
            saveData()
        }
    }
    private fun saveData(){
        val inserted=et_txt.text.toString()
        val insertedNum=et_Numtxt.text.toString()
        tv_txt.text=inserted
        tv_Numtxt.text=insertedNum
        val sharedPref: SharedPreferences =getSharedPreferences("shared", Context.MODE_PRIVATE)
        val editor: SharedPreferences.Editor=sharedPref.edit()
        editor.apply{
            putString("String_Key",inserted)
            putString("String_Keys",insertedNum)
            putBoolean("boolean_key",btn_switch.isChecked)
        }.apply()
    }
    private fun loadData(){
        val sharedPref: SharedPreferences =getSharedPreferences("shared", Context.MODE_PRIVATE)
        val savedString:String?=sharedPref.getString("String_key",null)
        val savedNum:String?=sharedPref.getString("String_keys",null)
        val savedBoolean:Boolean=sharedPref.getBoolean("Boolean_key",false)

        tv_txt.text=savedString
        tv_Numtxt.text=savedNum
        btn_switch.isChecked=savedBoolean
    }
}