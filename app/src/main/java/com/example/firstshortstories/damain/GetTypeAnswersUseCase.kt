package com.example.firstshortstories.damain

class GetTypeAnswersUseCase(private val repository: AnswersRepository) {

    fun getType(type: Answers) : Boolean{
        return repository.getType(type)
    }

}