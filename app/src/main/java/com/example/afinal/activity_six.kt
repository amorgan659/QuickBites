package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_six : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_six)

        val next_btn = findViewById<Button>(R.id.next_btn)

        next_btn.setOnClickListener {
            val intent = Intent(this, activity_sev::class.java)
            startActivity(intent)
        }

        val back_btn = findViewById<Button>(R.id.back_btn)

        back_btn.setOnClickListener {
            val intent = Intent(this, activity_five::class.java)
            startActivity(intent)
        }

        }
    }
