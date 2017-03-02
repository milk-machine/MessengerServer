package com.sdvor.messenger.entities

import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

/**
 * Created by kefir on 03.03.2017.
 */
class Handler : TextWebSocketHandler() {

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        session.sendMessage(TextMessage("WOW!!!"))
    }
}