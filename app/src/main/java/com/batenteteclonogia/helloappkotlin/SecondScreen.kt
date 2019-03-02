package com.batenteteclonogia.helloappkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*


class SecondScreen : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        showRandom()
    }

    fun showRandom() {

        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        var randomInt = 0
        if (count > 0) {
            val random = Random()
            randomInt = random.nextInt(count + 1)
        }

        findViewById<TextView>(R.id.heading_label).text =
                getString(R.string.random_reading, count)

        findViewById<TextView>(R.id.radom_number).text =
                Integer.toString(randomInt)
    }
}
