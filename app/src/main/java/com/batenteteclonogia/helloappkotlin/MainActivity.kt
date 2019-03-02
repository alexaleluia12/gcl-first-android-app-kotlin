package com.batenteteclonogia.helloappkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Kotlin!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view: View) {
        val showCountNumber = findViewById<TextView>(R.id.count_number)

        val stringNumber = showCountNumber.text.toString()
        var count: Int = Integer.parseInt(stringNumber)

        count++
        showCountNumber.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this,  SecondScreen::class.java)

        val countString = findViewById<TextView>(R.id.count_number).text.toString()
        val count = Integer.parseInt(countString)


        randomIntent.putExtra(SecondScreen.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }
}
