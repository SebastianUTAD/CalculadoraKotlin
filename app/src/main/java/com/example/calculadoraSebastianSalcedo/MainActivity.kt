package com.example.calculadoraSebastianSalcedo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SalirApp(view: View) {
        System.exit(0);
    }

    fun Acceder(view: View) {
        var editTextUser = findViewById<EditText>(R.id.textViewUser)
        var user: String = editTextUser.text.toString()
        var miIntent:Intent = Intent (this, Calculator::class.java)
        miIntent.putExtra("user", user)
        startActivity(miIntent)
        finish()
    }

}