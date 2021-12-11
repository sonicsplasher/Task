package com.devjam.task

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val helloWorld = findViewById<TextView>(R.id.HelloWorld)
            println(helloWorld.text)
        }}