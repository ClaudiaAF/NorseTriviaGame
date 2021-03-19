package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_one_places.*
import kotlinx.android.synthetic.main.activity_question_two_places.*

class QuestionTwoPlaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two_places)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        //get previous answer
        var placesCorrectAnswers = intent.getIntExtra(Constants.PLACES_CORRECT_ANSWER,0)

        //get questions list from constants
        val questionsList = Constants.getPlacesQuestions()

        //set question number and array
        val questionNumber: Int = 2
        val question: Questions = questionsList[1]

        //set UI elements to question 1
        tv_question_places2.text = question.question
        rb_answer_one_places2.text = question.optionOne
        rb_answer_two_places2.text = question.optionTwo
        rb_answer_three_places2.text = question.optionThree

        //set progress bar
        pb_progressBar_places2.progress = questionNumber
        tv_progress_places2.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton

        btn_next_places2.setOnClickListener{
            var id: Int = rg_options_places2.checkedRadioButtonId

            if(id != -1){
                //capture answer
                answers = findViewById(id)

                if (answers.text === question.optionThree){
                    placesCorrectAnswers++
                }
//
                intent = Intent(this, QuestionThreePlaces::class.java)
                intent.putExtra(Constants.PLACES_CORRECT_ANSWER, placesCorrectAnswers)
                startActivity(intent)
                finish()
            } else {
                // if no button checked
                Toast.makeText(this,"Please select your answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}