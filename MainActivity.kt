package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test: Int = 4

        if (test % 2 == 0)
            Log.d("MainActivity", "$test is Even number")
        else
            Log.d("MainActivity", "$test is Odd number")

        Sum(2, 5)

    }

    public fun Sum(num1: Int, num2: Int) {
        val s=num1 + num2
        Log.d("MainActivity","$num1 + $num2 = $s")
    }
}