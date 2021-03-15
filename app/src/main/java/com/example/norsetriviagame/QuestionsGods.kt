package com.example.norsetriviagame

object QuestionsGods {

    const val USER_NAME : String = "username"
    const val CORRECT_ANSWER : String = "correctAnswer"

    fun getQuestions(): ArrayList<Questions> {


        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
                1,
                "Who was the God of poetry?",
                R.drawable.norse_logo,
                "Bragi",
                "Thor",
                "Loki"

        )

        val que2 = Questions(
                2,
                "Which God was killed by a twig and mistletoe?",
                R.drawable.norse_logo,
                "Boromir",
                "Frey",
                "Balder"

        )

        val que3 = Questions(
                3,
                "Who was Odin's wife?",
                R.drawable.norse_logo,
                "Freya",
                "Frigga",
                "Hela"

        )

    questionsList.add(que1)
    questionsList.add(que2)
    questionsList.add(que3)

    return questionsList

}

}