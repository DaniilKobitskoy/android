package com.example.myapplication321

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication321.adapter.MyCustomAdapter
import com.example.myapplication321.common.Common1
import com.example.myapplication321.model.Custom

import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var mService: RetrofitServices1
    lateinit var layoutManager: LinearLayoutManager
    lateinit var adapter: MyCustomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        mService = Common1.retrofitService
        recyclerMovieList.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(this)
        recyclerMovieList.layoutManager = layoutManager
        getAllMovieList()
    }


    private fun getAllMovieList() {
        mService.getCustomList()?.enqueue(object : Callback<List<Custom.Data>> {

            override fun onFailure(call: Call<List<Custom.Data>>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<List<Custom.Data>>,

                response: Response<List<Custom.Data>>
            ) {


                adapter = MyCustomAdapter(baseContext, response.body() as List<Custom.Data>)
                adapter.notifyDataSetChanged()
                recyclerMovieList.adapter = adapter
            }
        })
    }
}
