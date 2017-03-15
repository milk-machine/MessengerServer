package com.sdvor.messenger.network.ws

import com.sdvor.messenger.entities.ChatMessage
import com.sdvor.messenger.repositories.ChatMessageRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

/**
 * Created by kefir on 04.03.2017.
 */
@Controller
class ChatController {

    @Autowired
    private lateinit var messageRepository: ChatMessageRepository

    @MessageMapping("/chat")
    @SendTo("/chat/messages")
    fun chating(message: ChatMessage): ChatMessage {
        messageRepository.save(message)

        return message
    }
}