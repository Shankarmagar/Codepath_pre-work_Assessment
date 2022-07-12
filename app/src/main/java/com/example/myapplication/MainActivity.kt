package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener{
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(4)
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))

        }

        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.yellow))
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            if (findViewById<EditText>(R.id.editText).text.isNotBlank()) {
                findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editText).text)
            }
        }
    }
}