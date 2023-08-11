package com.sujalpatel.mad_pr_4_21012021087

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var loginBtn :Button= findViewById(R.id.login_btn)
        loginBtn.setOnClickListener {
            Intent(this@MainActivity, LoginActivity::class.java)
                .also { startActivity(it) }
        }
        var signUpbtn=findViewById<Button>(R.id.signUp_btn)
        signUpbtn.setOnClickListener{
            Intent(this@MainActivity,RegistrationActivity::class.java)
                .also {
                    startActivity(it) }
        }
    }
}