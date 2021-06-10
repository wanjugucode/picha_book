package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facefive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facefive)
        setContentView(R.layout.activity_facethree)
        var btnPrevious4=findViewById<Button>(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener{
            var intent= Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }

    }
}