package com.example.shreyaandroidbootcamp.topics.api.screens.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shreyaandroidbootcamp.R
import com.example.shreyaandroidbootcamp.topics.api.model.Employee
import com.example.shreyaandroidbootcamp.topics.api.screens.listener.AdapterListener

class GetApiAdapter(private val items:MutableList<Employee>,private var  listener: AdapterListener) :
RecyclerView.Adapter<GetApiAdapter.viewHolder>()
{
    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
      val tvName:TextView =itemView.findViewById(R.id.tvName)
      val tvAge:TextView =itemView.findViewById(R.id.tvAge)
      val tvSalary:TextView =itemView.findViewById(R.id.tvSalary)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rvadaptor,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item =items[position]
        holder.tvName.text= item.employee_name
        holder.tvSalary.text= item.employee_salary.toString()
        holder.tvAge.text= item.employee_age.toString()
        holder.itemView.setOnClickListener {
            listener.onItemClick(item)
        }

    }

}