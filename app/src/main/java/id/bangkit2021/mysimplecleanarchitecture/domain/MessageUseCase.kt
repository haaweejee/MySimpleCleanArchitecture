package id.bangkit2021.mysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String) : MessageEntity
}