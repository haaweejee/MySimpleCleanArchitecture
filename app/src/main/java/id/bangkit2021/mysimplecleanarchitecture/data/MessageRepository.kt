package id.bangkit2021.mysimplecleanarchitecture.data

import id.bangkit2021.mysimplecleanarchitecture.domain.MessageEntity
import id.bangkit2021.mysimplecleanarchitecture.domain.iMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource) : iMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}