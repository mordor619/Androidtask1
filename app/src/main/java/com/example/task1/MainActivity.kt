package com.example.task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvRed = findViewById<TextView>(R.id.tvRed)
        val tvGreen = findViewById<TextView>(R.id.tvGreen)
        val tvBlue = findViewById<TextView>(R.id.tvBlue)
        val btn1 = findViewById<TextView>(R.id.btn1)

        tvRed.setOnClickListener {
            btn1.text = "Red was clicked"
        }

        tvGreen.setOnClickListener {
            btn1.text = "Green was clicked"
        }

        tvBlue.setOnClickListener {
            btn1.text = "Blue was clicked"
        }

    }
}