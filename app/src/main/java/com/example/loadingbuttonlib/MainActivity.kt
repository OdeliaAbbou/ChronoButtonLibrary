package com.example.loadingbuttonlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.mylibrary.LoadingButton

class MainActivity : AppCompatActivity() {

    private lateinit var loadingButton: LoadingButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupère le bouton depuis le layout
        loadingButton = findViewById(R.id.loadingButton)

        // Gère le clic
        loadingButton.setOnClickListener {
            loadingButton.showLoading()

            // Simule une tâche de 3 secondes
            Handler(Looper.getMainLooper()).postDelayed({
                loadingButton.hideLoading()
            }, 3000)
        }
    }
}