package id.bangkit2021.mysimplecleanarchitecture.domain

interface iMessageRepository {
    fun getWelcomeMessage(name : String) : MessageEntity
}