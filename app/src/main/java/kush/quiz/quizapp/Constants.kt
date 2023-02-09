package kush.quiz.quizapp




object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
        fun getQuestions(): ArrayList<Question> {
            val questionsList = ArrayList<Question>()

            // 1
            val que1 = Question(
                1, "What is 10 % of 90?",
                R.drawable.math,
                "9", "10",
                "900", "100", 1
            )

            questionsList.add(que1)

            // 2
            val que2 = Question(
                2, "Which of the following is a programming language?",
                R.drawable.code,
                "Anaconda", "Viper",
                "Python", "Crocodile", 3
            )

            questionsList.add(que2)

            // 3
            val que3 = Question(
                3, "Who won Fifa world cup 2022?",
                R.drawable.wc,
                "Brazil", "Spain",
                "Italy", "Argentina", 4
            )

            questionsList.add(que3)

            // 4
            val que4 = Question(
                4, "What is 9-9*9?",
                R.drawable.math,
                "0", "-72",
                "9", "72", 2
            )

            questionsList.add(que4)

            // 5
            val que5 = Question(
                5, "Who is this famous personality?",
                R.drawable.virat,
                "Shikhar Dhawan", "Rohit Sharma",
                "Virat Kohli", "MS Dhoni", 3
            )

            questionsList.add(que5)

            // 6
            val que6 = Question(
                6, "What is the largest continent of the world?",
                R.drawable.globe,
                "Asia", "Antarctica",
                "Africa", "none of these", 1
            )

            questionsList.add(que6)

            // 7
            val que7 = Question(
                7, "Where is the Taj Mahal located?",
                R.drawable.taj,
                "Allahbad", "Delhi",
                "Agra", "Mumbai", 3
            )

            questionsList.add(que7)

            // 8
            val que8 = Question(
                8, "Who is the Prime Minister Of India ?",
                R.drawable.ic_flag_of_india,
                "Boris Johnson", "Sachin Tendulkar",
                "Arvind Kejriwal", "Narendra Modi", 4
            )

            questionsList.add(que8)

            // 9
            val que9 = Question(
                9, "What is the largest country of the world?",
                R.drawable.globe,
                "Australia", "New Zealand",
                "Russia", "United States of America", 3
            )

            questionsList.add(que9)

            // 10
            val que10 = Question(
                10, "Who won the cricket world cup 2022?",
                R.drawable.cup,
                "England", "India",
                "Australia", "Pakistan", 1
            )

            questionsList.add(que10)

            return questionsList
        }
}