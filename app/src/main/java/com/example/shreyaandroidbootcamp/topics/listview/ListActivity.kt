package com.example.shreyaandroidbootcamp.topics.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.example.shreyaandroidbootcamp.R

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val action=supportActionBar
        action!!.title="ListView"

        val flowers=arrayOf("rose","lily","jasmine","marigold","lotus","rose","lily","jasmine","marigold","lotus")
        val listview=findViewById<ListView>(R.id.listview)
        val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,flowers)

        listview.adapter=adapter
        listview.onItemClickListener=object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"clicked item=" +flowers[position],Toast.LENGTH_SHORT).show()
            }
        }
    }
}