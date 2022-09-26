package com.example.prayerstoallah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tvDayPrayers: TextView
    private lateinit var tvNightPrayers: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDayPrayers = findViewById(R.id.tvDayPrayers)
        tvNightPrayers = findViewById(R.id.tvNightPrayers)

        tvDayPrayers.setOnClickListener{
            val intent = Intent(this, DayPrayersActivity::class.java)
            startActivity(intent)
        }

        tvNightPrayers.setOnClickListener{
            val intent = Intent(this, NightPrayersActivity::class.java)
            startActivity(intent)
        }

    }
}