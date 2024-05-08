package com.example.databinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)



   val fastdata  =DataClass("Sowrov","  Islam  ")

        val data2=DataClass("liton "  ,"  islam  ")

        val data3=DataClass("ami tomkae valo basi  ","islam")

 binding.apply {


     name1=fastdata
     name2=data2

     name3=data3




 }
























    }
}