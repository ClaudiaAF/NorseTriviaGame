package com.example.norsetriviagame

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_results_gods.*
import kotlinx.android.synthetic.main.activity_results_gods2.*

class ResultsWeapons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val weaponsCorrectAnswer = intent.getIntExtra(Constants.WEAPONS_CORRECT_ANSWER, 0)

        if (weaponsCorrectAnswer >= 2){
            setContentView(R.layout.activity_results_gods2)
            result_score2.text = "${weaponsCorrectAnswer}/3"
        } else {
            setContentView(R.layout.activity_results_gods)
            result_score.text = "${weaponsCorrectAnswer}/3"
        }

        //get shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //store highest score in sharedPrefs
        var currentWeaponsHighestScore = sharedPref.getInt(Constants.HIGHEST_WEAPONS_CORRECT_ANSWER, 0)
        if (weaponsCorrectAnswer > currentWeaponsHighestScore) {

            val editor = sharedPref.edit()

            editor.apply {
                putInt(Constants.HIGHEST_WEAPONS_CORRECT_ANSWER, weaponsCorrectAnswer)
                apply()
            }
        }


        val button = findViewById<Button>(R.id.back_to_categories_btn)

        button.setOnClickListener {
            val intent = Intent (this, CategoriesPage::class.java)

            startActivity(intent)
            finish()
        }


    }


}