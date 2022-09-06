package com.example.calculatorintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AnotherActivity:AppCompatActivity() {
    private lateinit var tw: TextView
    private lateinit var tw2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
        tw2 = findViewById(R.id.textView2)
        tw2.text = "Результат"

        val data = intent.getStringExtra("data")

        tw = findViewById(R.id.textView3)
        tw.text = "$data"
    }
}