package com.sdvor.messenger.entities

import org.springframework.data.annotation.Id

/**
 * Created by mteterin on 01.03.2017.
 */
data class ChatMessage(val text: String, val userName: String) {

    @Id
    lateinit var id: String
        private set
}