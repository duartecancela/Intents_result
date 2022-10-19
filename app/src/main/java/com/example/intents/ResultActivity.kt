package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val number = intent.getIntExtra("number", 0)
        val name = intent.getStringExtra("name")
        val textViewCountResult = findViewById<TextView>(R.id.textViewCountResult)
        val textViewPersonNameResult = findViewById<TextView>(R.id.textViewPersonNameResult)

        textViewCountResult.text = number.toString()
        textViewPersonNameResult.text = name


    }
}