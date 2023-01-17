package com.ashwin.android.delegatepattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class NextActivity : AppCompatActivity(), ViewLogger by ActivityLogger() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        registerLifecycleOwner(this)

        val mainButton: Button = findViewById<Button>(R.id.main_button)
        mainButton.setOnClickListener {
            Log.d("delegate-demo", "NextActivity: mainButton onClick")
            startActivity(Intent(this@NextActivity, MainActivity::class.java))
            finish()
        }
    }
}
