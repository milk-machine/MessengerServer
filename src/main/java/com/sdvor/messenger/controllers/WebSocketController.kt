package com.sdvor.messenger.controllers

import com.sdvor.messenger.entities.ChatMessage
import com.sdvor.messenger.entities.User
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller

/**
 * Created by kefir on 04.03.2017.
 */
@Controller
class WebSocketController {

    @MessageMapping("/chat")
    @SendTo("/chat/messages")
    fun chating(user: User): ChatMessage {
        return ChatMessage("new message", 3123123L, user.name)
    }
}