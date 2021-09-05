package com.example.firstshortstories.damain

class GetAnswersUseCase(private val reposritory: AnswersRepository)  {

    fun getAnswers(): String {
        return reposritory.getAnswers()
    }
    
}