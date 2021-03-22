package com.example.norsetriviagame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_score_board.*

class ScoreBoard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score_board)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val topObject = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.top_object)
        val scale_to_big = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.scale_to_big)



        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        //declare animation
        val godsCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_GODS_CORRECT_ANSWER, 0)
        val placesCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_PLACES_CORRECT_ANSWER, 0)
        val weaponsCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_WEAPONS_CORRECT_ANSWER, 0)

        val places_highest = findViewById<TextView>(R.id.places_num)
        val gods_highest = findViewById<TextView>(R.id.gods_num)
        val weapons_highest = findViewById<TextView>(R.id.weapons_num)
        val categories_title = findViewById<ImageView>(R.id.categories_high)


        places_highest.text = "$placesCorrectAnswer"
        gods_highest.text = "$godsCorrectAnswer"
        weapons_highest.text = "$weaponsCorrectAnswer"

        places_category.startAnimation(topObject)
        weaponry_category.startAnimation(topObject)
        gods_category.startAnimation(topObject)
        places_highest.startAnimation(scale_to_big)
        gods_highest.startAnimation(scale_to_big)
        weapons_highest.startAnimation(scale_to_big)



        back_to_cat.setOnClickListener{
            intent = Intent (this, CategoriesPage::class.java)

            startActivity(intent)
        }


    }
}