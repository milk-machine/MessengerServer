package com.sdvor.messenger

import com.sdvor.messenger.entities.Handler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.config.annotation.*


/**
 * Created by mteterin on 02.03.2017.
 */
@Configuration
@EnableWebSocket
open class WebSocketConfig : WebSocketConfigurer {

    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry.addHandler(getHandler(), "/ws").withSockJS()
    }

    @Bean
    open fun getHandler(): WebSocketHandler {
        return Handler()
    }


}