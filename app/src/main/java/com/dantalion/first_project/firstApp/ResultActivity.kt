package com.dantalion.first_project.firstApp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dantalion.first_project.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val txvResult = findViewById<TextView>(R.id.txvResult)
        val name:String = intent.extras?.getString("EXTRA NAME").orEmpty()
        txvResult.text = "hello $name"
    }

}