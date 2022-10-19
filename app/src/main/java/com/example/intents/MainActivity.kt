package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var number: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewCount = findViewById<TextView>(R.id.textViewCount)
        val buttonPlus = findViewById<Button>(R.id.buttonPlus)
        val buttonMinus = findViewById<Button>(R.id.buttonMinus)
        val editTextPersonName = findViewById<EditText>(R.id.editTextTextPersonName)
        val buttonNext = findViewById<Button>(R.id.buttonNext)

        buttonPlus.setOnClickListener {
            number++
            textViewCount.text = number.toString()
        }

        buttonMinus.setOnClickListener {
            number--
            textViewCount.text = number.toString()
        }

        buttonNext.setOnClickListener {
            val personName = editTextPersonName.text.toString()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("name", personName)
            intent.putExtra("number", number)
            startActivity(intent)
        }

    }
}