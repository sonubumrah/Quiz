package com.sonu.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    lateinit var mark:TextView
    lateinit var participent:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        mark=findViewById(R.id.txtMarks)
        participent=findViewById(R.id.txtParticipentName)
        var marks=intent.getIntExtra("marks",0)
        var n=intent.getStringExtra("Name")
        mark.text=marks.toString()
        participent.text=n+" Your Final Score is"
    }
}