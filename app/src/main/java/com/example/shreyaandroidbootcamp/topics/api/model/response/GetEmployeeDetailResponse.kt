package com.example.shreyaandroidbootcamp.topics.api.model.response

import com.example.shreyaandroidbootcamp.topics.api.model.Employee

data class GetEmployeeDetailResponse(
    val data: Employee,
    val message: String,
    val status: String
)
