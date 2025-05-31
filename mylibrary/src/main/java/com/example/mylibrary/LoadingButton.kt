package com.example.mylibrary

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.FrameLayout
import com.example.mylibrary.R

class LoadingButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private lateinit var button: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.loading_button, this, true)
        button = findViewById(R.id.button)
    }

    fun showCountdown(duration: Int = 3) {
        button.isEnabled = false

        val colors = arrayOf(
            Color.parseColor("#FF6B6B"), // rouge
            Color.parseColor("#FFD93D"), // jaune
            Color.parseColor("#6BCB77"), // vert
            Color.parseColor("#4D96FF")  // bleu
        )

        var timeLeft = duration
        val handler = Handler(Looper.getMainLooper())

        val runnable = object : Runnable {
            override fun run() {
                if (timeLeft > 0) {
                    button.text = "$timeLeft"
                    val color = colors[timeLeft % colors.size]
                    val bg = GradientDrawable()
                    bg.setColor(color)
                    bg.cornerRadius = 1000f // garde le bouton bien rond
                    button.background = bg
                    timeLeft--
                    handler.postDelayed(this, 1000)
                } else {
                    button.text = "✅"
                    button.animate()
                        .scaleX(1.2f)
                        .scaleY(1.2f)
                        .setDuration(200)
                        .withEndAction {
                            button.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setDuration(200)
                                .start()
                        }.start()

                    val finalBg = GradientDrawable()
                    finalBg.setColor(Color.parseColor("#6BCB77")) // vert final
                    finalBg.cornerRadius = 1000f // toujours rond
                    button.background = finalBg
                    button.isEnabled = true
                }
            }
        }

        handler.post(runnable)
    }

    override fun setOnClickListener(listener: OnClickListener?) {
        button.setOnClickListener(listener)
    }
}
