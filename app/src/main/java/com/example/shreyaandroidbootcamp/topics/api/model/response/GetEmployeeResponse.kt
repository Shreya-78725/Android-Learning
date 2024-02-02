package com.example.shreyaandroidbootcamp.topics.api.model.response

import com.example.shreyaandroidbootcamp.topics.api.model.Employee

data class GetEmployeeResponse(
    val data: List<Employee>,
    val message: String,
    val status: String
)
