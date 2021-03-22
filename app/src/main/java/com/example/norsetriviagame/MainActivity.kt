package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val topObject = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.top_object)
        val scale_to_big = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.scale_to_big)

        val logo = findViewById<ImageView>(R.id.logo_splash)
        val button = findViewById<Button>(R.id.btn_start)

        logo.startAnimation(topObject)
        button.startAnimation(scale_to_big)



        button.setOnClickListener {
            val intent = Intent (this, EnterName::class.java)

            startActivity(intent)
        }


    }
}