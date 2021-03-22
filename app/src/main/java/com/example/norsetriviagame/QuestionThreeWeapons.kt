package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_three_weapons.*
import kotlinx.android.synthetic.main.activity_question_two_gods.*
import kotlinx.android.synthetic.main.activity_question_two_weapons.*

class QuestionThreeWeapons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three_weapons)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //get previous answer
        var weaponsCorrectAnswers = intent.getIntExtra(Constants.WEAPONS_CORRECT_ANSWER, 0)
        val fade_in = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.fade_in)

        val rg_options = findViewById<RadioGroup>(R.id.rg_options_weapons3)
        val tv_question = findViewById<TextView>(R.id.tv_question_weapons3)

        rg_options.startAnimation(fade_in)
        tv_question.startAnimation(fade_in)

        val questionsList = Constants.getWeaponryQuestions()

        //set question number and array
        val questionNumber: Int = 3
        val question: Questions = questionsList[2]

        //set UI elements to question 1
        tv_question_weapons3.text = question.question
        rb_answer_one_weapons3.text = question.optionOne
        rb_answer_two_weapons3.text = question.optionTwo
        rb_answer_three_weapons3.text = question.optionThree

        pb_progressBar_weapons3.progress = questionNumber
        tv_progress_weapons3.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton


        btn_next_weapons3.setOnClickListener{
            var id: Int = rg_options_weapons3.checkedRadioButtonId
            if(id != -1){
                //capture answer
                answers = findViewById(id)
                if (answers.text === question.optionThree){
                    weaponsCorrectAnswers++
                }


                intent = Intent(this, ResultsWeapons::class.java)
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