package com.example.mylibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.view.View
import com.example.mylibrary.R

class LoadingButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private val button: Button
    private val progressBar: ProgressBar

    init {
        LayoutInflater.from(context).inflate(R.layout.loading_button, this, true)
        button = findViewById(R.id.button)
        progressBar = findViewById(R.id.progressBar)
    }

    fun setText(text: String) {
        button.text = text
    }

    fun showLoading() {
        button.text = "Charging..."
        button.isEnabled = false
        progressBar.visibility = View.VISIBLE
    }

    fun hideLoading() {
        button.text = "Final"
        button.isEnabled = true
        progressBar.visibility = View.GONE
    }

    override fun setOnClickListener(listener: OnClickListener?) {
        button.setOnClickListener(listener)
    }
}
