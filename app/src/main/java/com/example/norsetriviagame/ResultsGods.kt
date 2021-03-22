package com.example.norsetriviagame

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_results_gods2.*
import kotlinx.android.synthetic.main.activity_results_gods.*

class ResultsGods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get values
        val correctAnswers = intent.getIntExtra(Constants.GODS_CORRECT_ANSWER, 0)

        //set views based on score
       if (correctAnswers >= 2){
           setContentView(R.layout.activity_results_gods2)
           result_score2.text = "$correctAnswers/3"
       } else {
            setContentView(R.layout.activity_results_gods)
           result_score.text = "$correctAnswers/3"
       }

        //get shared preferences
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)

        //store highest score in sharedPrefs
        var currentGodsHighestScore = sharedPref.getInt(Constants.HIGHEST_GODS_CORRECT_ANSWER, 0)
        if (correctAnswers > currentGodsHighestScore) {

            val editor = sharedPref.edit()

            editor.apply {
                putInt(Constants.HIGHEST_GODS_CORRECT_ANSWER, correctAnswers)
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