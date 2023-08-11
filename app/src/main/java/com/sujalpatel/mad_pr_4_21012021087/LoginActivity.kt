package com.sujalpatel.mad_pr_4_21012021087

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var signUpbtn=findViewById<Button>(R.id.signUp_btn)
        signUpbtn.setOnClickListener{
            Intent(this@LoginActivity,RegistrationActivity::class.java)
                .also {
                    startActivity(it) }
        }
    }
}