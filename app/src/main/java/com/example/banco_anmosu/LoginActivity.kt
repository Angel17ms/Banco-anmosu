package com.example.banco_anmosu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.example.banco_anmosu.databinding.ActivityLoginBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.txtpass.onFocusChangeListener = View.OnFocusChangeListener { view, hasfocus ->
            if (!hasfocus) {
                if (binding.txtpass.text.toString().isEmpty()) {
                    binding.Password.error = "Tienes que rellenar la contraseña"
                }
            }
        }

        binding.txtUsuario.onFocusChangeListener = View.OnFocusChangeListener { view, hasfocus ->
            if (!hasfocus) {
                if (binding.txtUsuario.text.toString().isEmpty()) {
                    binding.usuario.error = "Tienes que rellenar el usuario"
                }
            }
        }




        binding.enviar.setOnClickListener {
            val dni = binding.usuario.editText?.text.toString()

            if (binding.txtUsuario.text.toString().isNotEmpty() && binding.txtpass.text.toString().isNotEmpty()){

                    val intent = Intent(this, MainActivity::class.java)
                    intent.putExtra("dni", dni)
                    startActivity(intent)
            }
        }

        binding.salir.setOnClickListener {
            finish()
        }




    }
}