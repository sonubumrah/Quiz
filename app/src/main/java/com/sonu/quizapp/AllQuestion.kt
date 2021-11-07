package com.sonu.quizapp

import java.util.*

object constant {
    fun getAllQn(): ArrayList<MyQuestion> {
        var list = ArrayList<MyQuestion>()
        val qn1 = MyQuestion(
            1,
            R.drawable.america,
            "From Which Country this Flag Belong ?",
            "India",
            "USA",
            "Armenia",
            "Russia",
            2
        )
        val qn2 = MyQuestion(
            2,
            R.drawable.argentina,
            "From Which Country this Flag Belong ?",
            "Japan",
            "India",
            "Argentina",
            "Nepal",
            3
        )
        val qn3 = MyQuestion(
            3,
            R.drawable.armeniaflag,
            "From Which Country this Flag Belong ?",
            "Armenia",
            "Austria",
            "France",
            "Norway",
            1
        )
        val qn4 = MyQuestion(
            4,
            R.drawable.bhutan,
            "From Which Country this Flag Belong ?",
            "Nepal",
            "Malaysia",
            "Georgia",
            "Bhutan",
            4
        )
        val qn5 = MyQuestion(
            5,
            R.drawable.indianflag,
            "From Which Country this Flag Belong ?",
            "Bhutan",
            "Maldives",
            "India",
            "SriLanka",
            3
        )
        val qn6 = MyQuestion(
            6,
            R.drawable.russianflag,
            "From Which Country this Flag Belong ?",
            "Russia",
            "Armenia",
            "Austria",
            "Malaysia",
            1
        )
        val qn7 = MyQuestion(
            7,
            R.drawable.germanyflag,
            "From Which Country this Flag Belong ?",
            "France",
            "Germany",
            "UK",
            "USA",
            2
        )
        val qn8 = MyQuestion(
            8,
            R.drawable.srilanka,
            "From Which Country this Flag Belong ?",
            "Sri Lanka",
            "Bhutan",
            "Nepal",
            "USA",
            1
        )
        val qn9 = MyQuestion(
            9,
            R.drawable.brazilflag,
            "From Which Country this Flag Belong ?",
            "Bhutan",
            "Nepal",
            "Brazil",
            "USA",
            3
        )
        val qn10 = MyQuestion(
            10,
            R.drawable.kuwait,
            "From Which Country this Flag Belong ?",
            "Kuwait",
            "Oman",
            "Turkey",
            "Japan",
            1
        )
        val qn11 = MyQuestion(
            11,
            R.drawable.nepal,
            "From Which Country this Flag Belong ?",
            "Bhutan",
            "Brazil",
            "India",
            "Nepal",
            4
        )
        val qn12 = MyQuestion(
            12,
            R.drawable.myanmar,
            "From Which Country this Flag Belong ?",
            "Nepal",
            "Bhutan",
            "Myanmar",
            "India",
            3
        )
        val qn13 = MyQuestion(
            13,
            R.drawable.belgiumflag,
            "From Which Country this Flag Belong ?",
            "France",
            "Italy",
            "Belgium",
            "Germany",
            3
        )
        list.add(qn1)
        list.add(qn2)
        list.add(qn3)
        list.add(qn4)
        list.add(qn5)
        list.add(qn6)
        list.add(qn7)
        list.add(qn8)
        list.add(qn9)
        list.add(qn10)
        list.add(qn11)
        list.add(qn12)
        list.add(qn13)
        return list
    }
}

