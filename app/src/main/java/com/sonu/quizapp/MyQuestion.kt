package com.sonu.quizapp

data class MyQuestion (
    val id:Int,
    val img:Int,
    val qn:String,
    val option1:String,
    val option2:String,
    val option3:String,
    val option4:String,
    val correctAns:Int
    )