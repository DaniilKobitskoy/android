package com.example.myapplication321

import com.example.myapplication321.model.Custom
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices1 {

    @GET("/api/v1/mobile/orders")
    fun getCustomList(): Call<List<Custom.Data>>

}