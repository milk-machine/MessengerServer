package com.sdvor.messeger.controlers

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

/**
 * Created by mteterin on 02.03.2017.
 */
@Controller
class WebSocketController {

    @MessageMapping("/chat")
    fun chat() {

    }
}