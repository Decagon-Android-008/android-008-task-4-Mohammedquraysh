package com.mohammed.week4task

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class AdapterRecycler(private val birthdayList: ArrayList<BirthdayDate>): RecyclerView.Adapter<AdapterRecycler.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.adapter_layout, parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = birthdayList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.names.text = currentItem.celebrant
        holder.day.text = currentItem.day
        holder.date.text = currentItem.date
    }


    override fun getItemCount(): Int {
        return birthdayList.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var titleImage : ImageView = itemView.findViewById(R.id.title_image)
        var names : TextView = itemView.findViewById(R.id.textName)
        var date: TextView = itemView.findViewById(R.id.textView5)
        var day: TextView = itemView.findViewById(R.id.textView5)

    }
}