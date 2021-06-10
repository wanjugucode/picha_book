package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facefour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facefour)

        setContentView(R.layout.activity_facethree)
        var btnPrevious3=findViewById<Button>(R.id.btnPrevious2)
        var btnNext4=findViewById<Button>(R.id.btnNext3)
        btnPrevious3.setOnClickListener{
            var intent= Intent(baseContext,facethree::class.java)
            startActivity(intent)

        }
        btnNext4.setOnClickListener {
            var intent= Intent(baseContext,facefive::class.java)
            startActivity(intent)

        }
    }
}