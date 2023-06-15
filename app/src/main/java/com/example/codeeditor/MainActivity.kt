package com.example.codeeditor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AutoCompleteTextView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var user_code:AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_code = findViewById(R.id.user_code)

    }

    private fun Run() {

        if(user_code.text.toString() == ""){

            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)

        }
        else {
            val intent = Intent(this@MainActivity, CodeActivity::class.java)
            intent.putExtra("code", user_code.text.toString())
            startActivity(intent)
        }
    }

    // to inflate our menu design in MainActivity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val infalter = menuInflater
        infalter.inflate(R.menu.main_menu,menu)
        return true

    }

    // to program menu buttons
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item?.itemId){

            R.id.run_menu -> {
                Run()
                return true
            }

            R.id.add_html -> {
                user_code.setText(" <!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<title>Page Title</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>This is a Heading</h1>\n" +
                        "<p>This is a paragraph.</p>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html> ")

                return true
            }

            R.id.add_javascript -> {
                user_code.setText(" <!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<body>\n" +
                        "\n" +
                        "<h1>My First Web Page</h1>\n" +
                        "<p>My First Paragraph</p>\n" +
                        "\n" +
                        "<p id=\"demo\"></p>\n" +
                        "\n" +
                        "<script>\n" +
                        "document.getElementById(\"demo\").innerHTML = 5 + 6;\n" +
                        "</script>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html> ")

                return true
            }

            R.id.clear -> {
                user_code.setText("")
                return true
            }

            R.id.about_item -> {
                val intent2 = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent2)
            }

            R.id.quit -> {
                finish()
                return true
            }

        }

        return super.onOptionsItemSelected(item)
    }



}