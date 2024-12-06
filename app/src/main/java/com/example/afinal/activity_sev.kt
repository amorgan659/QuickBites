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

class activity_sev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sev)

        findViewById<CheckBox>(R.id.breakfast_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Breaakfast is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.lunch_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Lunch is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.dinner_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Dinner is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.dessert_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Dessert is checked: $isChecked")
            }

        findViewById<CheckBox>(R.id.snack_str)
            .setOnCheckedChangeListener { buttonView, isChecked ->
                Log.d("CHECKBOXES", "Snack is checked: $isChecked")
            }

        val submit_btn = findViewById<Button>(R.id.submit_btn)

        submit_btn.setOnClickListener {
            val intent = Intent(this, activity_eight::class.java)
            startActivity(intent)
        }

        val next_btn = findViewById<Button>(R.id.next_btn)

        next_btn.setOnClickListener {
            val intent = Intent(this, activity_eight::class.java)
            startActivity(intent)
        }

        val back_btn = findViewById<Button>(R.id.back_btn)

        back_btn.setOnClickListener {
            val intent = Intent(this, activity_six::class.java)
            startActivity(intent)
        }

        }
    }
