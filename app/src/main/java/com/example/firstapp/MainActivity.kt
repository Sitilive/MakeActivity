package com.example.firstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.getParcelableExtra<User>("user")

        val textViewData = findViewById<TextView>(R.id.TextViewData)
        textViewData.text = "Name: ${user?.name},\n Email: ${user?.email}"
    }
}