package com.example.birthday_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)



        val theName = intent.getStringExtra("inputName")

        //get and display name here
        greetingsPanel.text = "Happy Birthday $theName!!"

    }
}
