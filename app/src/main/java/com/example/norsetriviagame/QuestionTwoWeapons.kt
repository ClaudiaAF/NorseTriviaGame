package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_two_gods.*
import kotlinx.android.synthetic.main.activity_question_two_weapons.*

class QuestionTwoWeapons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two_weapons)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get previous answer
        var weaponsCorrectAnswers = intent.getIntExtra(Constants.WEAPONS_CORRECT_ANSWER, 0)

        //get questions list from constants
        val questionsList = Constants.getWeaponryQuestions()

        //set question number and array
        val questionNumber: Int = 2
        val question: Questions = questionsList[1]

        //set UI elements to question 1
        tv_question_weapons2.text = question.question
        rb_answer_one_weapons2.text = question.optionOne
        rb_answer_two_weapons2.text = question.optionTwo
        rb_answer_three_weapons2.text = question.optionThree

        pb_progressBar_weapons2.progress = questionNumber
        tv_progress_weapons2.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton

        btn_next_weapons2.setOnClickListener{
            var id: Int = rg_options_weapons2.checkedRadioButtonId
            if(id != 0){
                //capture answer
                answers = findViewById(id)

                if (answers.text === question.optionTwo){
                    weaponsCorrectAnswers++
                }


                intent = Intent(this, QuestionThreeWeapons::class.java)
                intent.putExtra(Constants.WEAPONS_CORRECT_ANSWER, weaponsCorrectAnswers)
                startActivity(intent)
                finish()
            } else {
                // if no button checked
                Toast.makeText(this,"Please select your answer", Toast.LENGTH_SHORT).show()
            }


        }
    }
}