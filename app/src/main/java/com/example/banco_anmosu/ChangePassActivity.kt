package com.example.banco_anmosu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.example.banco_anmosu.databinding.ActivityChangePassBinding
import com.example.banco_anmosu.databinding.ActivityLoginBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class ChangePassActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChangePassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChangePassBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.salir.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }




    }
}