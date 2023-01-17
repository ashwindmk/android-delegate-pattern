package com.ashwin.android.delegatepattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity(), ViewLogger by ActivityLogger() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerLifecycleOwner(this)

        val nextButton: Button = findViewById<Button>(R.id.next_button)
        nextButton.setOnClickListener {
            Log.d("delegate-demo", "MainActivity: nextButton onClick")
            startActivity(Intent(this@MainActivity, NextActivity::class.java))
        }
    }
}
