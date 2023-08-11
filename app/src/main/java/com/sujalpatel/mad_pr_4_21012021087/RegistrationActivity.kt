package com.sujalpatel.mad_pr_4_21012021087

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        var loginBtn=findViewById<Button>(R.id.login_btn)
        loginBtn.setOnClickListener{
            Intent(this@RegistrationActivity,LoginActivity::class.java)
                .also {
                    startActivity(it) }
        }
    }
}