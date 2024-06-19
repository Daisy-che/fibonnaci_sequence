package com.example.fibonaccisequence

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonaccisequence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        val fibonResult=fibonNumber(100)
        binding.rvNums.layoutManager=GridLayoutManager(this,2)
        val numAdapter=Fibonacci(fibonResult)
        binding.rvNums.adapter=numAdapter


        }
    fun fibonNumber(n:Int):List<Int>{
        val number= mutableListOf(0,1)
        while(number.size<100){
            number.add(number[number.lastIndex]+number[number.lastIndex-1])
        }
        return  number
    }

}