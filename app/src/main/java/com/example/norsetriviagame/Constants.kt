package com.example.norsetriviagame

object Constants {

    const val USER_NAME : String = "userName"
    const val GODS_CORRECT_ANSWER : String = "godsCorrectAnswer"
    const val HIGHEST_GODS_CORRECT_ANSWER : String = "highestGodsCorrectAnswer"
    const val PLACES_CORRECT_ANSWER : String = "placesWrongAnswer"
    const val HIGHEST_PLACES_CORRECT_ANSWER : String = "highestPlacesWrongAnswer"
    const val WEAPONS_WRONG_ANSWER : String = "weaponsWrongAnswer"

    fun getGodsQuestions(): ArrayList<Questions> {


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
                "Who ruled in Hel?",
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

    fun getPlacesQuestions(): ArrayList<Questions> {


        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
                1,
                "What was the home of the Gods called?",
                R.drawable.norse_logo,
                "Midgard",
                "Asgard",
                "Hel"

        )

        val que2 = Questions(
                2,
                "Where do the souls of warriors go after a brave death?",
                R.drawable.norse_logo,
                "Yggrasdil",
                "Jotunheim",
                "Valhalla"

        )

        val que3 = Questions(
                3,
                "What is the name of the bridge that connects Asgard with Midgard?",
                R.drawable.norse_logo,
                "Rainbow Bridge",
                "Bifrost",
                "Mighty Pathway"

        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)

        return questionsList

    }

    fun getWeaponryQuestions(): ArrayList<Questions> {


        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1,
            "What was the name of Thor's infamous hammer?",
            R.drawable.norse_logo,
            "Midgard",
            "Thor's Hammer",
            "Mjolnir"

        )

        val que2 = Questions(
            2,
            "What is the name of the great spear wielded by Odin?",
            R.drawable.norse_logo,
            "Dainsleif",
            "Gungnir",
            "Laevateinn"

        )

        val que3 = Questions(
            3,
            "Which sword did Sigurd use to slay the great dragon, Fafnir?",
            R.drawable.norse_logo,
            "Dragon Slayer",
            "Skofnung",
            "Gram"

        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)

        return questionsList

    }

}