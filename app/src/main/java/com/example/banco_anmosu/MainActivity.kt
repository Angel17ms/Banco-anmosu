package com.example.banco_anmosu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.banco_anmosu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dni = intent.getStringExtra("dni")

        binding.dni.text = "$dni"

        binding.boton4.setOnClickListener {
            val intent = Intent(this, Change_Password::class.java)
            startActivity(intent)
        }

    }
}