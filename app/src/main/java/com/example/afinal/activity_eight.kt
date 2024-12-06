package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_eight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_eight)

        findViewById<CheckBox>(R.id.beginner_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Beginner is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.intermediate_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Intermediate is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.expert_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Expert is checked: $isChecked")
            }

        val submit_btn = findViewById<Button>(R.id.submit_btn)

        submit_btn.setOnClickListener {
            val intent = Intent(this, activity_nine::class.java)
            startActivity(intent)
        }

        val next_btn = findViewById<Button>(R.id.next_btn)

        next_btn.setOnClickListener {
            val intent = Intent(this, activity_nine::class.java)
            startActivity(intent)
        }

        val back_btn = findViewById<Button>(R.id.back_btn)

        back_btn.setOnClickListener {
            val intent = Intent(this, activity_sev::class.java)
            startActivity(intent)
        }
        }
    }
