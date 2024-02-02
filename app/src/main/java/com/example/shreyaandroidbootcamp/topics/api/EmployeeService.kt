package com.example.shreyaandroidbootcamp.topics.api

import com.example.shreyaandroidbootcamp.topics.api.model.response.GetEmployeeDetailResponse
import com.example.shreyaandroidbootcamp.topics.api.model.response.GetEmployeeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EmployeeService {

    /**
     * this get api for to fetch list of employees
     * */
    @GET("api/v1/employees")
    fun employeeList(): Call<GetEmployeeResponse>

    /***
     * this get api for to fetch single set of data of one employee
     * */
    @GET("api/v1/employee/{id}")
    fun employeeDetail(
        @Path("id")  id:String
    ): Call<GetEmployeeDetailResponse>

}