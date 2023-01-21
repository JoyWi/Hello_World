package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.Hellobutton)
        button.setOnClickListener {
            Log.v("Hello World", "Button clicked!")
            Toast.makeText(this,"Tis' an honor to meet you!", Toast.LENGTH_SHORT).show()
        }
    }
}