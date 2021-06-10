package com.example.beautyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class facetwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facetwo)
        var btnPrevious=findViewById<Button>(R.id.btnPrevious)
        var btnNext2=findViewById<Button>(R.id.btnNext2)
        btnPrevious.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)

        }
        btnNext2.setOnClickListener {
            var intent=Intent(baseContext,facethree::class.java)
            startActivity(intent)

        }


    }

}