package id.bangkit2021.mysimplecleanarchitecture.data

import id.bangkit2021.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String) : MessageEntity
}