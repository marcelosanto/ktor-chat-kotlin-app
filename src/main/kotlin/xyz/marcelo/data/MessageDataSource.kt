package xyz.marcelo.data

import xyz.marcelo.data.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>

    suspend fun insertMessages(message: Message)
}
