package br.com.cotemig.aulaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        var email = findViewById<EditText>(R.id.email)
        email.setText(intent.getStringExtra("email"))


       var btnForgot = findViewById<Button>(R.id.btnForgot)
        btnForgot.setOnClickListener {
            forgotClick()
        }
    }

    fun forgotClick(){

        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()

    }
}