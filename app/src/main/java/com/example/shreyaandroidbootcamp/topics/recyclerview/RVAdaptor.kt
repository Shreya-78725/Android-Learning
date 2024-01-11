package com.example.shreyaandroidbootcamp.topics.recyclerview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shreyaandroidbootcamp.R

class RVAdaptor(private val items:ArrayList<String>): RecyclerView.Adapter<RVAdaptor.viewHolder111>() {


    class viewHolder111(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.text)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder111 {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rvadaptor,parent,false)
        return viewHolder111(view)
    }

    override fun onBindViewHolder(holder: viewHolder111, position: Int) {
                val item = items[position]
        holder.textView.text = item
    }
    override fun getItemCount(): Int {
        val size = items.size
        println("Dataset size: $size")
        return size
    }


}