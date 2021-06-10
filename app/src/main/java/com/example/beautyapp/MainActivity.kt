package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      var  btnNext=findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener{
            var intent=Intent(baseContext,facetwo::class.java)
            startActivity(intent)
        }
    }
}

//package com.example.beautyapp

//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//
//class Facefive : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_facefive)
//        setContentView(R.layout.activity_facethree)
//        var btnPrevious4=findViewById<Button>(R.id.btnPrevious4)
//        btnPrevious4.setOnClickListener{
//            var intent= Intent(baseContext,MainActivity::class.java)
//            startActivity(intent)
//
//        }
//
//    }
//}