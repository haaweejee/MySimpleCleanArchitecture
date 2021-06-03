package id.bangkit2021.mysimplecleanarchitecture.di

import id.bangkit2021.mysimplecleanarchitecture.data.IMessageDataSource
import id.bangkit2021.mysimplecleanarchitecture.data.MessageDataSource
import id.bangkit2021.mysimplecleanarchitecture.data.MessageRepository
import id.bangkit2021.mysimplecleanarchitecture.domain.MessageInteractor
import id.bangkit2021.mysimplecleanarchitecture.domain.MessageUseCase
import id.bangkit2021.mysimplecleanarchitecture.domain.iMessageRepository

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository() : iMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource() : IMessageDataSource{
        return MessageDataSource()
    }
}