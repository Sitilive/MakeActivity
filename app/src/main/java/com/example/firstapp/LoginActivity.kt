package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val user = intent.getParcelableExtra<User>("user")

        val editTextEmail: EditText = findViewById(R.id.EditTextEmail)
        editTextEmail.setText(user?.email.toString()) //Mengambil data email
        val editTextPassword: EditText = findViewById(R.id.EditTextPassword)
        val buttonLogin = findViewById<Button>(R.id.ButtonLogin)

        buttonLogin.setOnClickListener {
            if (user?.password == editTextPassword.text.toString()) {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("user", user)

                startActivity(intent)
            } else {
                Toast.makeText(this, "Sorry wrong your Password", Toast.LENGTH_LONG).show()
            }
        }
    }
}
