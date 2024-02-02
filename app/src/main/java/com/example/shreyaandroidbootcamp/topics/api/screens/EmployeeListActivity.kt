package com.example.shreyaandroidbootcamp.topics.api.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shreyaandroidbootcamp.R
import com.example.shreyaandroidbootcamp.topics.api.ApiClient
import com.example.shreyaandroidbootcamp.topics.api.model.Employee
import com.example.shreyaandroidbootcamp.topics.api.model.response.GetEmployeeResponse
import com.example.shreyaandroidbootcamp.topics.api.screens.adapter.GetApiAdapter
import com.example.shreyaandroidbootcamp.topics.api.screens.listener.AdapterListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmployeeListActivity : AppCompatActivity() {
    lateinit var recycleView : RecyclerView
    var employeeList:MutableList<Employee> = mutableListOf()
    val adaptor= GetApiAdapter(employeeList,object :AdapterListener{
        override fun onItemClick(item: Employee) {
            val intent=Intent(this@EmployeeListActivity,EmployeeDetailActivity::class.java)
            intent.putExtra("id",item.id)
            startActivity(intent)

        }
    })
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_list)

        recycleView=findViewById(R.id.apiRecyclerView)
        recycleView.layoutManager=LinearLayoutManager(this)
        recycleView.adapter=adaptor


        ApiClient()
            .getEmployeeService()
            .employeeList()
            .enqueue(object : Callback<GetEmployeeResponse> {
            override fun onResponse(call: Call<GetEmployeeResponse>, response: Response<GetEmployeeResponse>) {
                if(response.isSuccessful) {
                    /** first it will remove the content which is present previously*/
                    employeeList.clear()
                    employeeList.addAll(response.body()?.data?.toMutableList()!!)
                    /** this used to notify recycler view that data has changed */
                    recycleView.adapter?.notifyDataSetChanged()
                }else{
                    print(response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<GetEmployeeResponse>, t: Throwable) {
                print(t.message.toString())
            }

        })
    }
}