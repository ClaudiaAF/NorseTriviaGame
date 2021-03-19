package com.example.norsetriviagame

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.norsetriviagame.Constants.USER_NAME
import kotlinx.android.synthetic.main.activity_categories_page2.*

class CategoriesPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_page2)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val userName = sharedPref.getString(Constants.USER_NAME, "No User")

        val categorieshi = findViewById<TextView>(R.id.categories_hi)

        categorieshi.text = "Greetings $userName"

        val button = findViewById<Button>(R.id.gods_category)
        val button_places = findViewById<Button>(R.id.places_category)
        val button_weapons = findViewById<Button>(R.id.weapons_category)

        button.setOnClickListener {
            intent = Intent (this, QuestionOneGods::class.java)

            startActivity(intent)
        }

        button_places.setOnClickListener{
            intent = Intent (this, QuestionOnePlaces::class.java)

            startActivity(intent)
        }

        button_weapons.setOnClickListener{
            intent = Intent (this, QuestionOneWeapons::class.java)

            startActivity(intent)
        }


        fab_btn.setOnClickListener {

            val godsCorrectAnswer = sharedPref.getInt(Constants.HIGHEST_GODS_CORRECT_ANSWER, 0)

            var message: String = "The highest score for the Gods is currently $godsCorrectAnswer "

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Previous Warrior")
            builder.setMessage(message)
            builder.setNegativeButton("Alright then", DialogInterface.OnClickListener{ dialog, _ ->
                dialog.dismiss()
            })

            builder.show()

        }
    }
}