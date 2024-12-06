package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_nine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nine)

        val simple_next = findViewById<Button>(R.id.simple_next)

        simple_next.setOnClickListener {
            val intent = Intent(this, activity_ten::class.java)
            startActivity(intent)
        }
        }
    }
