package com.example.kotlin5group49lesson7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var a = 2
    val sdjklf = 3743
    var b = 4
    var resultat = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val e = 343
        setContentView(R.layout.activity_main)
        resultat = a + b
    }
}