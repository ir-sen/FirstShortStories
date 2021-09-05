package com.example.firstshortstories.damain

interface AnswersRepository {

    fun getAnswers(): String

    fun getType(type: Answers) : Boolean
}