package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.norsetriviagame.Constants.USER_NAME

class CategoriesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_page2)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val categorieshi = findViewById<TextView>(R.id.categories_hi)

        val userName = intent.getStringExtra(USER_NAME)

        categorieshi.text = "Greetings " + userName

        val button = findViewById<Button>(R.id.gods_category)
        val button_places = findViewById<Button>(R.id.places_category)

        button.setOnClickListener {
            val intent = Intent (this, QuestionOneGods::class.java)

            startActivity(intent)
        }

        button_places.setOnClickListener{
            val intent = Intent (this, QuestionOnePlaces::class.java)

            startActivity(intent)
        }
    }
}