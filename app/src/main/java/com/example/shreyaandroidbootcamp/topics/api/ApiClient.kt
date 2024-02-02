package com.example.shreyaandroidbootcamp.topics.api

import com.example.shreyaandroidbootcamp.topics.deleteApi.modal.DelUser
import com.example.shreyaandroidbootcamp.topics.deleteApi.modal.UserDel
import com.example.shreyaandroidbootcamp.topics.postAPI.modal.PostUser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    private var mRetrofit:Retrofit

    init {
         mRetrofit= Retrofit.Builder()
            .baseUrl("https://dummy.restapiexample.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



    fun getEmployeeService():EmployeeService{
        return mRetrofit.create(EmployeeService::class.java)
    }




}