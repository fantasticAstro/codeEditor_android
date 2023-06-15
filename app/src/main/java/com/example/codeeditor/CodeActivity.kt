package com.example.codeeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CodeActivity : AppCompatActivity() {

    lateinit var my_browser:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        my_browser = findViewById(R.id.my_browser)
        my_browser.loadData(intent.getStringExtra("code"),"text/html; charset=utf-8", null)
        my_browser.settings.javaScriptEnabled

    }



}