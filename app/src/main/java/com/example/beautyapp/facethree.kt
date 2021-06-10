package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facethree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facethree)
        var btnPrevious2=findViewById<Button>(R.id.btnPrevious2)
        var btnNext3=findViewById<Button>(R.id.btnNext3)
        btnPrevious2.setOnClickListener{
            var intent= Intent(baseContext,facetwo::class.java)
            startActivity(intent)

        }
        btnNext3.setOnClickListener {
            var intent= Intent(baseContext,facefour::class.java)
            startActivity(intent)

        }
  }
}