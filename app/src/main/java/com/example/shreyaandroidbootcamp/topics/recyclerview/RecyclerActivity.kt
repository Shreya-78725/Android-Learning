package com.example.shreyaandroidbootcamp.topics.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shreyaandroidbootcamp.R

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        var action=supportActionBar
        action!!.title="Recycler View"


        val recycler : RecyclerView =findViewById(R.id.recyclerView)
        recycler.layoutManager=LinearLayoutManager(this)

        val items= fetchData()
        val adaptor=RVAdaptor(items)
        recycler.adapter=adaptor
    }
    private fun fetchData(): ArrayList<String>{
        val list=ArrayList<String>()
        for(i in 0 until 20){
            list.add("item $i")
        }
        return list
    }




}