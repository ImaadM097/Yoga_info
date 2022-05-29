package com.example.issue_hunter_imaad

import android.content.Intent


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Yoga Asanas")
        setContentView(R.layout.activity_main)
    }
    fun newActivity(view: View) {


        val intent = Intent(this, DisplaySirasana::class.java).apply {

        }
        startActivity(intent)
    }
    fun newActivity2(view: View) {
        val intent = Intent(this, DisplayHalasana::class.java).apply {

        }
        startActivity(intent)
    }
    fun newActivity3(view: View) {
        val intent = Intent(this, DisplayWindrelease::class.java).apply {

        }
        startActivity(intent)
    }
    fun newActivity4(view: View) {
        val intent = Intent(this, DisplayBoat::class.java).apply {

        }
        startActivity(intent)
    }
}