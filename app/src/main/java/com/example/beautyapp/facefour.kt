package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facefour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facefour)
        var btnPrevious2=findViewById<Button>(R.id.btnPrevious3)
        var btnNext3=findViewById<Button>(R.id.btnNext4)
        btnPrevious2.setOnClickListener{
            var intent= Intent(baseContext,facethree::class.java)
            startActivity(intent)

        }
        btnNext3.setOnClickListener {
            var intent= Intent(baseContext,facefive::class.java)
            startActivity(intent)

        }
    }
}