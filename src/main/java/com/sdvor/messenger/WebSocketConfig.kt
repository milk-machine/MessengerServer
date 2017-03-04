package com.sdvor.messenger

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.simp.config.MessageBrokerRegistry
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.config.annotation.*


/**
 * Created by mteterin on 02.03.2017.
 */
@Configuration
@EnableWebSocketMessageBroker
open class WebSocketConfig : AbstractWebSocketMessageBrokerConfigurer() {

    override fun registerStompEndpoints(registry: StompEndpointRegistry) {
        registry.addEndpoint("/ws").withSockJS()
    }

    override fun configureMessageBroker(registry: MessageBrokerRegistry) {
        registry.enableSimpleBroker("/chat")
    }
}