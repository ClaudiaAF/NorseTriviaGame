package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_one_gods.*
import kotlinx.android.synthetic.main.activity_question_one_places.*

class QuestionOnePlaces : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one_places)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringArrayExtra(Constants.USER_NAME)

        val questionsList = Constants.getPlacesQuestions()
        Log.i("QuestionsList: ", "${questionsList.size}")

        //set question number and array
        val questionNumber: Int = 1
        val question: Questions = questionsList[questionNumber-1]

        //set UI elements to question 1
        tv_question_places.text = question.question
        rb_answer_one_places.text = question.optionOne
        rb_answer_two_places.text = question.optionTwo
        rb_answer_three_places.text = question.optionThree

        pb_progressBar_places.progress = questionNumber
        tv_progress_places.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton
        var correctAnswer: Int = 0

        btn_next_places.setOnClickListener{
            var id: Int = rg_options_places.checkedRadioButtonId

            if(id != -1){
                //capture answer
                answers = findViewById(id)


                Toast.makeText(this,"Checked Answer: ${answers.text}", Toast.LENGTH_SHORT).show()



                if (answers.text == question.optionTwo){
                    correctAnswer++
                }
//

                val intent = Intent(this, QuestionTwoPlaces::class.java)
                intent.putExtra(Constants.CORRECT_ANSWER, correctAnswer)
                startActivity(intent)
                finish()
            } else {
                // if no button checked
                Toast.makeText(this,"Please select your answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}