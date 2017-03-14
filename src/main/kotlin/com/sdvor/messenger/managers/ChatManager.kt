package com.sdvor.messenger.managers

import com.sdvor.messenger.entities.ChatMessage

/**
 * Created by mteterin on 06.03.2017.
 */
object ChatManager {

    private val messages = mutableListOf<ChatMessage>()

    fun addNewMessage(message: ChatMessage) {
        messages += message
    }

    fun getAllMessages() = listOf(messages)
}