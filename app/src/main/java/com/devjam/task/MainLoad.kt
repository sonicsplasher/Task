package com.devjam.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.os.CountDownTimer




class MainLoad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_load)


        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                //set the new Content of your
                val context =this.onFinish()
                val intent = Intent(context, Login::class.java)

            }

    }.start()
}}

