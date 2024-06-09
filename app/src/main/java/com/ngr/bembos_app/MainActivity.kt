package com.ngr.bembos_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.ngr.bembos_app.menu_bembos.MenuActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<TextInputEditText>(R.id.txtCorreo)
        val password = findViewById<TextInputEditText>(R.id.txtPassword)
        val btnLogin = findViewById<MaterialButton>(R.id.btnIngresar)

        btnLogin.setOnClickListener {
            val emailValue = email.text.toString()
            val passwordValue = password.text.toString()

            if (emailValue.equals("eddie@gmail.com") && passwordValue.equals("123456")) {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this,
                    "Verifique datos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}