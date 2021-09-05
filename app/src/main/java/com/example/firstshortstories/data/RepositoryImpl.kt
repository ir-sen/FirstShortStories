package com.example.firstshortstories.data

import com.example.firstshortstories.damain.Answers
import com.example.firstshortstories.damain.AnswersRepository

object RepositoryImpl: AnswersRepository {

    private val answers = mutableListOf<Answers>()

    override fun getAnswers(): String {
        TODO("Not yet implemented")
    }

    override fun getType(type: Answers): Boolean {
        TODO("Not yet implemented")
    }


}