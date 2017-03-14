package com.sdvor.messenger

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by mteterin on 01.03.2017.
 */

@SpringBootApplication
open class MessengerApplication

fun main(args: Array<String>) {
    SpringApplication.run(MessengerApplication::class.java, *args)
}