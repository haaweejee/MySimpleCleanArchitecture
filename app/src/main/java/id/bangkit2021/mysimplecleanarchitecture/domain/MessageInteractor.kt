package id.bangkit2021.mysimplecleanarchitecture.domain

class MessageInteractor(private val messageRepository: iMessageRepository) : MessageUseCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}