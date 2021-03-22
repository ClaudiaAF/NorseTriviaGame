package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_three_gods.*

class QuestionThreeGods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three_gods)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val fade_in = android.view.animation.AnimationUtils.loadAnimation(this, R.anim.fade_in)

        val rg_options = findViewById<RadioGroup>(R.id.rg3_options)
        val tv_question = findViewById<TextView>(R.id.tv_question3)

        rg_options.startAnimation(fade_in)
        tv_question.startAnimation(fade_in)
        //get previous answer
        var godsCorrectAnswers = intent.getIntExtra(Constants.GODS_CORRECT_ANSWER, 0)

        val questionsList = Constants.getGodsQuestions()

        //set question number and array
        val questionNumber: Int = 3
        val question = questionsList[2]

        //set UI elements to question 1
        tv_question3.text = question.question
        rb3_answer_one.text = question.optionOne
        rb3_answer_two.text = question.optionTwo
        rb3_answer_three.text = question.optionThree

        pb_progressBar3.progress = questionNumber
        tv_progress3.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton


        btn_next3.setOnClickListener{
            var id: Int = rg3_options.checkedRadioButtonId
            if(id != -1){
                //capture answer
                answers = findViewById(id)
                if (answers.text === question.optionThree){
                    godsCorrectAnswers++
                }

                intent = Intent(this, ResultsGods::class.java)
                intent.putExtra(Constants.GODS_CORRECT_ANSWER, godsCorrectAnswers)
                startActivity(intent)
                finish()
            } else {
                // if no button checked
                Toast.makeText(this,"Please select your answer", Toast.LENGTH_SHORT).show()
            }
        }
    }
}