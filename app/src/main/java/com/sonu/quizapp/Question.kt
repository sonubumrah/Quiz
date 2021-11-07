package com.sonu.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.core.content.ContextCompat
import java.util.*

class Question : AppCompatActivity() {
    lateinit var txtqn:TextView
    lateinit var imgFlag:ImageView
    lateinit var txtop1:TextView
    lateinit var progressB:ProgressBar
    lateinit var txtPro:TextView

    lateinit var txtOp2:TextView
    lateinit var txtOp3:TextView
    lateinit var txtOp4:TextView
    lateinit var btnSubmit:Button
    var marks=0
    var current=0
    var optionNo=1
    var k=0
    var t=0
     lateinit var btnList: ArrayList<TextView>
    @SuppressLint("ResourceAsColor", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        txtqn=findViewById(R.id.txtQuestion)
        imgFlag=findViewById(R.id.imgFlag)
        progressB=findViewById(R.id.ProgressBar)
        txtPro=findViewById(R.id.txtProgress)
        txtop1=findViewById(R.id.txtOptionOne)
        txtOp2=findViewById(R.id.txtOptionTwo)
        txtOp3=findViewById(R.id.txtOptionThree)
        txtOp4=findViewById(R.id.txtOptionFour)
        btnSubmit=findViewById(R.id.btnSubmit)
        var n=intent.getStringExtra("Name")
        var qnList=constant.getAllQn()
        Log.i("Number Of Question","${qnList.size}")
        btnList=ArrayList()
        btnList.add(txtop1)
        btnList.add(txtOp2)
        btnList.add(txtOp3)
        btnList.add(txtOp4)
        //var current=1
        progressB.progress=current
        txtPro.text="${current+1}"+"/"+"${progressB.max}"
        NextQn(current)
        current++
        btnSubmit.setOnClickListener {
            (it as Button).text="Next"
            btnList[qnList[current-1].correctAns-1].background=ContextCompat.getDrawable(this,R.drawable.correct_answer)
            if( qnList[current-1].correctAns==optionNo && t==0){
                marks++
            }
            if(t==1) {
                if (k > 0 ) {
                    btnList[k - 1].background =
                        ContextCompat.getDrawable(this, R.drawable.default_background)

                    btnList[optionNo - 1].background =
                        ContextCompat.getDrawable(this, R.drawable.default_background)
                    btnList[qnList[current-1].correctAns-1].background=ContextCompat.getDrawable(this,R.drawable.default_background)
                } else {
                    btnList[qnList[current-1].correctAns-1].background=ContextCompat.getDrawable(this,R.drawable.default_background)
                    Toast.makeText(this, "Please select  any option", Toast.LENGTH_SHORT).show()
                }
                k = 0
                optionNo = 1
                t = 0
                (it as Button).text = "Submit"


                if (current < 13) {
                    progressB.progress = current+1
                    txtPro.text = "${current+1}" + "/" + "${progressB.max}"
                    NextQn(current )
                    current++
                } else {
                    val intent=Intent(this,Result::class.java)
                    intent.putExtra("marks",marks)
                    intent.putExtra("Name",n)
                    startActivity(intent)
                    //Toast.makeText(this, "Hi ", Toast.LENGTH_SHORT).show()
                }

            }
            else{
                t++
            }
        }
        txtop1.setOnClickListener {
             k=optionNo
            if(k!=0) {
                btnList[k-1].background=ContextCompat.getDrawable(this,R.drawable.default_background)
            }
            optionNo=1
            defaultColor(optionNo)
        }
        txtOp2.setOnClickListener {
             k=optionNo
            if(k!=0) {
                btnList[k-1].background=ContextCompat.getDrawable(this,R.drawable.default_background)
            }
            optionNo=2
            defaultColor(optionNo)

        }
        txtOp3.setOnClickListener {
             k=optionNo
            if(k!=0) {
                btnList[k-1].background=ContextCompat.getDrawable(this,R.drawable.default_background)
            }
            optionNo=3
            defaultColor(optionNo)

        }
        txtOp4.setOnClickListener {
             k=optionNo
            if(k!=0) {
                btnList[k-1].background=ContextCompat.getDrawable(this,R.drawable.default_background)
            }
            optionNo=4
            defaultColor(optionNo)

        }

    }
    private fun NextQn(id:Int){
        var qnList=constant.getAllQn()
        txtqn.text=qnList[id].qn
        imgFlag.setImageResource(qnList[id].img)
        txtop1.text=qnList[id].option1
        txtOp2.text=qnList[id].option2
        txtOp3.text=qnList[id].option3
        txtOp4.text=qnList[id].option4
    }
    @SuppressLint("ResourceAsColor")
    fun defaultColor(i:Int){
        btnList[i-1].background=ContextCompat.getDrawable(this,R.drawable.after_click)
    }
}