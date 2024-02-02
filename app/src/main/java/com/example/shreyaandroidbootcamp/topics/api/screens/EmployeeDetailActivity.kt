package com.example.shreyaandroidbootcamp.topics.api.screens

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.shreyaandroidbootcamp.R
import com.example.shreyaandroidbootcamp.topics.api.ApiClient
import com.example.shreyaandroidbootcamp.topics.api.model.Employee
import com.example.shreyaandroidbootcamp.topics.api.model.response.GetEmployeeDetailResponse
import com.example.shreyaandroidbootcamp.topics.postAPI.modal.PostUser
import com.example.shreyaandroidbootcamp.topics.postAPI.modal.UserPost
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class EmployeeDetailActivity : AppCompatActivity() {
    lateinit var textName:TextView
    lateinit var textSalary:TextView
    lateinit var textage:TextView
    lateinit var btnUpdate : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_detail)
        textName=findViewById(R.id.tvName)
        textSalary=findViewById(R.id.txtSalary)
        textage=findViewById(R.id.txtAge)
        btnUpdate=findViewById(R.id.btnUpdate)

        btnUpdate.setOnClickListener{
            val intent=Intent(this,PostApiActivity::class.java)
            startActivity(intent)
        }

//        val matchId=intent.getIntExtra("id",0)
        val i=Intent()

        ApiClient()
            .getEmployeeService()
            .employeeDetail("1")
            .enqueue(object : Callback<GetEmployeeDetailResponse>{
                override fun onResponse(
                    call: Call<GetEmployeeDetailResponse>,
                    response: Response<GetEmployeeDetailResponse>
                ) {
                    if (response.isSuccessful) {
                        val data = response.body()?.data
                        if (data != null) {
                            textName.text = data.employee_name
                            textSalary.text = data.employee_salary.toString()
                            textage.text = data.employee_age.toString()
                        }
                    }
                }

                override fun onFailure(call: Call<GetEmployeeDetailResponse>, t: Throwable) {
                    Toast.makeText(this@EmployeeDetailActivity, t.message, Toast.LENGTH_SHORT).show()
                }

            })
    }
}