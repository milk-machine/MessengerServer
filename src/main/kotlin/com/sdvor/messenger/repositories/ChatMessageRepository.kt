package com.sdvor.messenger.repositories

import com.sdvor.messenger.entities.ChatMessage
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by mteterin on 14.03.2017.
 */
interface ChatMessageRepository : MongoRepository<ChatMessage, String>