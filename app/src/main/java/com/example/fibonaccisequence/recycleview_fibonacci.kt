package com.example.fibonaccisequence

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Fibonacci(var number:List<Int>): RecyclerView.Adapter<NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val numberView =LayoutInflater.from(parent.context)
            .inflate(R.layout.fibonacci_list,parent,false)
        return NumberViewHolder(numberView)
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNums.text=number[position].toString()

    }

    override fun getItemCount(): Int {
       return  number.size
    }
}
class NumberViewHolder(numberView:View):RecyclerView.ViewHolder(numberView){
    val tvNums=numberView.findViewById<TextView>(R.id.tvNums)
}