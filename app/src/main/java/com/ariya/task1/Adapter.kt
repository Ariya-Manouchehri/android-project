package com.ariya.task1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ariya.task1.databinding.RowBinding

class Adapter(context: Context, val list: List<Flags>) : RecyclerView.Adapter<ViewHolder>() {

    private val infator:LayoutInflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RowBinding.inflate(infator,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.fill(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

class ViewHolder(val binding: RowBinding) : RecyclerView.ViewHolder(binding.root) {
    fun fill(item : Flags){
        binding.img.setImageResource(item.img)
        binding.textview.setText(item.name)
    }
}