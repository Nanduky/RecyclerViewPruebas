package com.nanduky.recyclerview03main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nanduky.recyclerview03main.R
import com.nanduky.recyclerview03main.clases.Calendar03DC

class Calendar03Adapter(private val calendar03List:List<Calendar03DC>):RecyclerView.Adapter<Calendar03ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Calendar03ViewHolder {
        val layoutInflate = LayoutInflater.from(parent.context)
        return Calendar03ViewHolder(layoutInflate.inflate(R.layout.item_calendar03,parent,false))
    }

    override fun getItemCount(): Int = calendar03List.size


    override fun onBindViewHolder(holder: Calendar03ViewHolder, position: Int) {
        val item = calendar03List[position]
        holder.render(item)
    }
}