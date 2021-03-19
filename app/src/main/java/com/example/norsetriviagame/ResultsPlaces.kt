package com.example.norsetriviagame

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_results_gods.*
import kotlinx.android.synthetic.main.activity_results_gods2.*
import kotlinx.android.synthetic.main.activity_results_places.*
import kotlinx.android.synthetic.main.activity_results_places.result_score2
import kotlinx.android.synthetic.main.activity_results_places2.*
import kotlinx.android.synthetic.main.activity_results_places2.result_score

class ResultsPlaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get values
        val placesCorrectAnswer = intent.getIntExtra(Constants.PLACES_CORRECT_ANSWER, 0)

        //set views based on score
        if (placesCorrectAnswer >= 2){
            setContentView(R.layout.activity_results_gods2)
            result_score2.text = "$placesCorrectAnswer"
        } else {
            setContentView(R.layout.activity_results_gods)
            result_score.text = "$placesCorrectAnswer"
        }

        //get shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //store highest score in sharedPrefs
        var currentPlacesHighestScore = sharedPref.getInt(Constants.HIGHEST_PLACES_CORRECT_ANSWER, 0)
        if (placesCorrectAnswer > currentPlacesHighestScore) {

            val editor = sharedPref.edit()

            editor.apply {
                putInt(Constants.HIGHEST_PLACES_CORRECT_ANSWER, placesCorrectAnswer)
                apply()
            }
        }

        //go back to categories
        val button = findViewById<Button>(R.id.back_to_categories_btn)

        button.setOnClickListener {
            val intent = Intent (this, CategoriesPage::class.java)

            startActivity(intent)
            finish()
        }


    }


}