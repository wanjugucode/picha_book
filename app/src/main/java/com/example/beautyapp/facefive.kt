package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facefive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facefive)

        var btnPrevious4=findViewById<Button>(R.id.btnPrevious5)
        btnPrevious4.setOnClickListener{
            var intent= Intent(baseContext,facefour::class.java)
            startActivity(intent)

        }
    }
}