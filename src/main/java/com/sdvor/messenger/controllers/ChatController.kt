package com.sdvor.messenger.controllers

import com.sdvor.messenger.entities.ChatMessage
import com.sdvor.messenger.managers.ChatManager
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

/**
 * Created by kefir on 04.03.2017.
 */
@Controller
class ChatController {

    @MessageMapping("/chat")
    @SendTo("/chat/messages")
    fun chating(message: ChatMessage): ChatMessage {
        ChatManager.onNewMessage(message)
        return message
    }
}