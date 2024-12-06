package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_ten : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ten)

        val view_gf = findViewById<Button>(R.id.view_gf)

        view_gf.setOnClickListener {
            val intent = Intent(this, activity_el::class.java)
            startActivity(intent)
        }

        val view_asian = findViewById<Button>(R.id.view_asian)

        view_asian.setOnClickListener {
            val intent = Intent(this, activity_el::class.java)
            startActivity(intent)
        }

        val view_keto = findViewById<Button>(R.id.view_keto)

        view_keto.setOnClickListener {
            val intent = Intent(this, activity_el::class.java)
            startActivity(intent)
        }

        val view_sweet = findViewById<Button>(R.id.view_sweet)

        view_sweet.setOnClickListener {
            val intent = Intent(this, activity_el::class.java)
            startActivity(intent)
        }
    }
}
