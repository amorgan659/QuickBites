package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_four : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_four)

        val true_btn = findViewById<Button>(R.id.true_btn)

        true_btn.setOnClickListener {
            val intent = Intent(this, activity_five::class.java)
            startActivity(intent)
        }

        val false_btn = findViewById<Button>(R.id.false_btn)

        false_btn.setOnClickListener {
            val intent = Intent(this, activity_five::class.java)
            startActivity(intent)
        }

        val next_btn = findViewById<Button>(R.id.next_btn)

        next_btn.setOnClickListener {
            val intent = Intent(this, activity_five::class.java)
            startActivity(intent)
        }

        val back_btn = findViewById<Button>(R.id.back_btn)

        back_btn.setOnClickListener {
            val intent = Intent(this, third_activity::class.java)
            startActivity(intent)
        }

        }
    }
