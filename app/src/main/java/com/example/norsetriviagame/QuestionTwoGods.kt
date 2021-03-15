package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_one_gods.*
import kotlinx.android.synthetic.main.activity_question_three_gods.*
import kotlinx.android.synthetic.main.activity_question_two_gods.*
import kotlinx.android.synthetic.main.activity_question_two_gods.pb_progressBar2

class QuestionTwoGods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two_gods)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(QuestionsGods.USER_NAME)

        val questionsList = QuestionsGods.getQuestions()

        //set question number and array
        val questionNumber: Int = 2
        val question: Questions = questionsList[questionNumber-1]

        //set UI elements to question 1
        tv_question2.text = question.question
        rb2_answer_one.text = question.optionOne
        rb2_answer_two.text = question.optionTwo
        rb2_answer_three.text = question.optionThree

        pb_progressBar2.progress = questionNumber
        tv_progress2.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton
        var correctAnswer: Int = 0

        val correctAnswers = intent.getIntExtra(QuestionsGods.CORRECT_ANSWER, 0)
        tv_correctAnswer2.text = correctAnswers.toString()

        btn_next2.setOnClickListener{
            var id: Int = rg2_options.checkedRadioButtonId
            if(id != -1){
                //capture answer
                answers = findViewById(id)


                 Toast.makeText(this,"Checked Answer: ${answers.text}", Toast.LENGTH_SHORT).show()



                if (answers.text == question.optionThree){
                    correctAnswer++
                }

                val correctAnswer = intent.getIntExtra(QuestionsGods.CORRECT_ANSWER, 0)
                tv_correctAnswer2.text = correctAnswer.toString()

                val intent = Intent(this, QuestionThreeGods::class.java)
                intent.putExtra(QuestionsGods.CORRECT_ANSWER, correctAnswer)
                startActivity(intent)
                finish()
            } else {
                // if no button checked
                Toast.makeText(this,"Please select your answer", Toast.LENGTH_SHORT).show()
            }


        }

    }
}