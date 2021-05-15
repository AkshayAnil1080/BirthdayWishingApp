package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greet.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetActivity : AppCompatActivity() {

    companion object  // making a static variable can be used at different locations
    {
        const val NAME_EXTRA = "name_extra"  // const => cannot be changed now
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name =  intent.getStringExtra(NAME_EXTRA) //
        birthdayGreeting.text = "Happy birthday\n$name!"  // .made a text view in design and use its id to display the text.
    }
}