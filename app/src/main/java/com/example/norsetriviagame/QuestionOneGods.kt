package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question_one_gods.*

class QuestionOneGods : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_one_gods)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val questionsList = QuestionsGods.getQuestions()
        Log.i("QuestionsList: ", "${questionsList.size}")

        //set question number and array
        val questionNumber: Int = 1
        val question: Questions = questionsList[questionNumber-1]

        //set UI elements to question 1
        tv_question.text = question.question
        rb_answer_one.text = question.optionOne
        rb_answer_two.text = question.optionTwo
        rb_answer_three.text = question.optionThree

        pb_progressBar.progress = questionNumber
        tv_progress.text = questionNumber.toString() + "/" + questionsList.size.toString()

        //set a button on click listener
        var answers: RadioButton
        var correctAnswer: Int = 0

        btn_next.setOnClickListener{
            var id: Int = rg_options.checkedRadioButtonId
            if(id != -1){
                //capture answer
                answers = findViewById(id)


                // Toast.makeText(this,"Checked Answer: ${answers.text}", Toast.LENGTH_SHORT).show()



                if (answers.text == question.optionOne){
                    correctAnswer++
                }

                val intent = Intent(this, QuestionTwoGods::class.java)
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