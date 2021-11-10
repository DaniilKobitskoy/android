package com.example.myapplication321.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication321.R
import com.example.myapplication321.model.Custom
import kotlinx.android.synthetic.main.item_layout.view.*

class MyCustomAdapter(private val context: Context, private val movieList: List<Custom.Data>):RecyclerView.Adapter<MyCustomAdapter.MyViewHolder>() {

        class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

            val txt_name: TextView = itemView.txt_name
            val txt_team: TextView = itemView.txt_team
            val txt_createdby: TextView = itemView.txt_createdby

            fun bind(listItem: Custom.Data) {
                itemView.setOnClickListener {
                    Toast.makeText(it.context, "нажал на ${itemView.txt_team}", Toast.LENGTH_SHORT)
                        .show()
                }
                itemView.setOnClickListener {
                    Toast.makeText(it.context, "нажал на ${itemView.txt_name.text}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
            return MyViewHolder(itemView)
        }

       override fun getItemCount() = movieList.size

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val listItem = movieList[position]
            holder.bind(listItem)

            holder.txt_name.text = movieList[position].id.toString()
            holder.txt_team.text = movieList[position].count.toString()
            holder.txt_createdby.text = movieList[position].price.toString()
        }

    }