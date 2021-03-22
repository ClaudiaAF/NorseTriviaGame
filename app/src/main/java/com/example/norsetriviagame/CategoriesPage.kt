package com.example.norsetriviagame

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_categories_page2.*

class CategoriesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_page2)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //animation vals
        val topObject = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.top_object)
        val scale_to_big = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.scale_to_big)

        val categories_hi = findViewById<TextView>(R.id.categories_hi)
        val select_category = findViewById<TextView>(R.id.select_category)

        val places_card = findViewById<Button>(R.id.places_category)
        val gods_card = findViewById<Button>(R.id.gods_category)
        val weapons_card = findViewById<Button>(R.id.weapons_category)

        // set the animation
        categories_hi.startAnimation(topObject)
        select_category.startAnimation(topObject)

        places_card.startAnimation(scale_to_big)
        gods_card.startAnimation(scale_to_big)
        weapons_card.startAnimation(scale_to_big)
        fab_btn.startAnimation(scale_to_big)
        fab_btn_reset.startAnimation(scale_to_big)


        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val userName = sharedPref.getString(Constants.USER_NAME, "No User")

        val categorieshi = findViewById<TextView>(R.id.categories_hi)

        categorieshi.text = "Greetings $userName"

        val button = findViewById<Button>(R.id.gods_category)
        val button_places = findViewById<Button>(R.id.places_category)
        val button_weapons = findViewById<Button>(R.id.weapons_category)

        button.setOnClickListener {
            intent = Intent (this, QuestionOneGods::class.java)

            startActivity(intent)
        }

        button_places.setOnClickListener{
            intent = Intent (this, QuestionOnePlaces::class.java)

            startActivity(intent)
        }

        button_weapons.setOnClickListener{
            intent = Intent (this, QuestionOneWeapons::class.java)

            startActivity(intent)
        }


        fab_btn.setOnClickListener {

            intent = Intent (this, ScoreBoard::class.java)

            startActivity(intent)

//            val godsCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_GODS_CORRECT_ANSWER, 0)
//            val placesCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_PLACES_CORRECT_ANSWER, 0)
//            val weaponsCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_WEAPONS_CORRECT_ANSWER, 0)
//
//            var message: String = "The highest score for the Gods is currently $godsCorrectAnswer " +
//                    "The highest score for Places is currently $placesCorrectAnswer" +
//                    "The highest score for Weapons is currently $weaponsCorrectAnswer"
//
//            val builder = AlertDialog.Builder(this)
//            builder.setTitle("Best Category Victories")
//            builder.setMessage(message)
//            builder.setNegativeButton("Challenged Accepted", DialogInterface.OnClickListener{ dialog, _ ->
//                dialog.dismiss()
//            })
//
//            builder.show()

        }

        fab_btn_reset.setOnClickListener {
            val editor = sharedPref.edit()
            editor.clear()
            editor.commit()
        }


    }
}