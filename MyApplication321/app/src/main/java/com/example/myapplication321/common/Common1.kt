package com.example.myapplication321.common


import com.example.myapplication321.RetrofitServices1
import com.example.myapplication321.retrofit2.RetrofitClient

object Common1 {

    private val BASE_URL = "http://80.78.246.225:3000"
    val retrofitService: RetrofitServices1
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices1::class.java)

}