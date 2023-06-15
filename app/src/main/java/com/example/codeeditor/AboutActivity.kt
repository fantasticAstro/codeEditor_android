package com.example.codeeditor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {

    lateinit var home_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        home_btn = findViewById(R.id.home_btn)

        home_btn.setOnClickListener{

            val intent3 = Intent(this@AboutActivity, MainActivity::class.java)
            startActivity(intent3)
        }

    }
}