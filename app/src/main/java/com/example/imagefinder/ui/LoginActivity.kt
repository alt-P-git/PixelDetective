package com.example.imagefinder.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.auth0.android.Auth0
import com.example.imagefinder.R
import com.example.imagefinder.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var account: Auth0
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}