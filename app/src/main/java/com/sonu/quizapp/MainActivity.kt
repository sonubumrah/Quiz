package com.sonu.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var text:TextView
    lateinit var edtText:EditText
    lateinit var btnText:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        actionBar?.hide()
        text=findViewById(R.id.txtQuiz)
        edtText=findViewById(R.id.edtName)
        btnText=findViewById(R.id.btnSubmit)



        btnText.setOnClickListener {
            if(edtText.text.toString()=="")
            {
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent=Intent(this,Question::class.java)
                intent.putExtra("Name",edtText.text.toString())
                startActivity(intent)
                finish()
            }


        }
    }
}