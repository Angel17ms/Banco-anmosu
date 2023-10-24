package com.example.banco_anmosu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.banco_anmosu.databinding.ActivityChangePasswordBinding
import com.example.banco_anmosu.databinding.ActivityLoginBinding

class Change_Password : AppCompatActivity() {

    private lateinit var binding: ActivityChangePasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChangePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.enviar.setOnClickListener {
            val contNueva = binding.txtContNueva.text.toString()
            val contNuevaRepe = binding.txtpass.text.toString()
            if (contNueva.isEmpty()) {
                binding.contNueva.error = "Tienes que poner la contraseña nueva"
            }
            if (contNuevaRepe.isEmpty()) {
                binding.contNuevaRepe.error = "Tienes que volver a poner la contraseña"
            }else {
                if (!(contNueva.equals(contNuevaRepe))) {
                    binding.contNueva.error = "Las contraseñas deben ser iguales"
                    binding.contNuevaRepe.error = "Las contraseñas deben ser iguales"
                }
            }
            if (contNueva.equals(contNuevaRepe) && contNueva.isNotEmpty() && contNuevaRepe.isNotEmpty()) {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}