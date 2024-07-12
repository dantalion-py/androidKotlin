package com.dantalion.first_project.firstApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dantalion.first_project.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_first_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val start = findViewById<AppCompatButton>(R.id.start)
        val editText = findViewById<AppCompatEditText>(R.id.editText)

        start.setOnClickListener {
                val messageT:String = editText.text.toString()
                if (messageT.isNotEmpty()){
                    Log.i("dantalion","message: $messageT")
                    val intent = Intent(this,ResultActivity::class.java)
                    intent.putExtra("EXTRA NAME",messageT)
                    startActivity(intent)
                }else{
                    Log.i("datalion","is empty")
            }
        }

    }
}
