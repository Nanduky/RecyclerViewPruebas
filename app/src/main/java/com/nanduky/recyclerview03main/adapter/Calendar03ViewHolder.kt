package com.nanduky.recyclerview03main.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.nanduky.recyclerview03main.clases.Calendar03DC
import com.nanduky.recyclerview03main.databinding.ItemCalendar03Binding

class Calendar03ViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemCalendar03Binding.bind(view)
    fun render(calendar03DC: Calendar03DC){
        binding.tvData.text = calendar03DC.data
        binding.tvPlace.text = calendar03DC.place
        binding.tvDoctor.text = calendar03DC.doctor
    }
}