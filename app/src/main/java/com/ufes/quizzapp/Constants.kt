package com.ufes.quizzapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(

                1,
                "Which is the keyword for creating Objects?",
                "create",
                "obj",
                "new",
                "build",
                2
        )
        questionList.add(question1)

        val question2 = Question(

                2,
                "What's the size of an int?",
                "16bits",
                "1bit",
                "32bits",
                "64bits",
                3
        )
        questionList.add(question2)

        val question3 = Question(

                3,
                "Which element its not an access modifier?",
                "protected",
                "public",
                "private",
                "static",
                4
        )
        questionList.add(question3)

        val question4 = Question(

                4,
                "What type of code results after compiling?",
                "hashcode",
                "bytecode",
                "java code",
                "binary code",
                2
        )
        questionList.add(question4)


        val question5 = Question(

                5,
                "Which data type is used to create a variable that should store text??",
                "string",
                "String",
                "Txt",
                "myString",
                2
        )
        questionList.add(question5)

        val question6 = Question(

                6,
                "How do you create a variable with the numeric value 5?",
                "x=5;",
                "int x=5;",
                "float x =5;",
                "num x=5;",
                2
        )
        questionList.add(question6)

        val question7 = Question(

                7,
                "Which method can be used to find the length of a string?",
                "len()",
                "getLength()",
                "getSize()",
                "lenght()",
                4
        )
        questionList.add(question7)


        val question8 = Question(

                8,
                "Which operator can be used to compare two values?",
                "==",
                "<>",
                "><",
                "=",
                1
        )
        questionList.add(question8)

        val question9 = Question(

                9,
                "How do you start writing a while loop in Java?",
                "while(x>y)",
                "while x>y {",
                "whyle x>y:",
                "x>y while {",
                1
        )
        questionList.add(question9)

        val question10 = Question(

                10,
                "How do you insert comments in Java?",
                "*this is a comment",
                "//this is a comment {",
                "!this is a comment",
                "[this is a comment] {",
                2
        )
        questionList.add(question10)

        return questionList;






    }


}