package br.com.cotemig.aulaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            loginClick()
        }

        var btnForgot = findViewById<Button>(R.id.btnEsqueci)
        btnForgot.setOnClickListener {
            forgotClick()
        }

        var btnRegistro = findViewById<Button>(R.id.btnRegistro)
        btnRegistro.setOnClickListener {
            registroClick()
        }
    }

    fun loginClick(){
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)

        if (email.text.toString() == "cris@cotemig.com.br" && password.text.toString() == "123"){

            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()
        }
    }

    fun forgotClick(){
        var email = findViewById<TextView>(R.id.email)
        var intent = Intent (this, ForgotActivity::class.java)

        intent.putExtra("email", email.text.toString())
        startActivity(intent)
        finish()
    }

    fun registroClick(){
        var intent = Intent(this, RegistroActivity::class.java)
        startActivity(intent)
        finish()
    }
}