package com.example.jmp_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun navigateToSecondActivity(view: View) {
        val intent = Intent(this, Page2Activity::class.java)
        startActivity(intent)
    }

}