package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val editTextName: EditText = findViewById(R.id.EditTextName)
        val editTextEmail: EditText = findViewById(R.id.EditTextEmail)
        val editTextPassword: EditText = findViewById(R.id.EditTextPassword)

        val buttonRegister: Button = findViewById(R.id.ButtonRegister)


        buttonRegister.setOnClickListener{
                val user = User(editTextName.text.toString(), editTextEmail.text.toString(), editTextPassword.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtra("user", user)

                startActivity(intent)
            }
        }
    }