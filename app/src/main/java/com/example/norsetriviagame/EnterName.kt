package com.example.norsetriviagame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class EnterName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_name)

        val buttons = findViewById<Button>(R.id.btn_name)
        val etname = findViewById<TextView>(R.id.et_name)

        buttons.setOnClickListener {
            if(etname.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, CategoriesPage::class.java).apply {
                    putExtra(EXTRA_MESSAGE, etname.text.toString())
                }
                startActivity(intent)
                finish()
            }
        }


    }
}