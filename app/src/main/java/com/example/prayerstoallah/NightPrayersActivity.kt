package com.example.prayerstoallah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class NightPrayersActivity : AppCompatActivity() {
    private lateinit var llKorsi: LinearLayout
    private lateinit var tvKorsiCounter: TextView
    private lateinit var llKorsiCounter: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_night_prayers)

        llKorsi = findViewById(R.id.llAyetElKorsi)
        tvKorsiCounter = findViewById(R.id.tvCounter1)
        llKorsiCounter = findViewById(R.id.llCounter1)
        llKorsi.setOnClickListener {
            var counter: Int = tvKorsiCounter.text.toString().toInt()
            counter--
            tvKorsiCounter.text = counter.toString()
            if (counter == 0) {
                llKorsiCounter.visibility=View.GONE
            }

        }
    }
}