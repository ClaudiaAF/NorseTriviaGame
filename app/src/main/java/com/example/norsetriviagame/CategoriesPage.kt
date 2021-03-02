package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class CategoriesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_page2)

        val categorieshi = findViewById<TextView>(R.id.categories_hi)

        val userName = intent.getStringExtra(EXTRA_MESSAGE)

        categorieshi.text = "Hello " + userName
    }
}