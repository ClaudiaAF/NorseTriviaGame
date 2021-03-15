package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_three_gods.*

class QuestionThreeGods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three_gods)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)

        val questionsList = Constants.getGodsQuestions()

        //set question number and array
        val questionNumber: Int = 3
        val question: Questions = questionsList[questionNumber-1]

        //set UI elements to question 1
        tv_question3.text = question.question
        rb3_answer_one.text = question.optionOne
        rb3_answer_two.text = question.optionTwo
        rb3_answer_three.text = question.optionThree

        pb_progressBar3.progress = questionNumber
        tv_progress3.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton
        var correctAnswer: Int = 0

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        tv_correctAnswer3.text = correctAnswers.toString()


        btn_next3.setOnClickListener{
            var id: Int = rg3_options.checkedRadioButtonId
            if(id != -1){
                //capture answer
                answers = findViewById(id)


                 Toast.makeText(this,"Checked Answer: ${answers.text}", Toast.LENGTH_SHORT).show()



                if (answers.text == question.optionTwo){
                    correctAnswer++
                }

                val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
                tv_correctAnswer3.text = correctAnswer.toString()

                val intent = Intent(this, ResultsGods::class.java)
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