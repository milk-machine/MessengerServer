package com.sdvor.messenger

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

/**
 * Created by mteterin on 01.03.2017.
 */

@SpringBootApplication
open class MessengerApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(MessengerApplication::class.java)
            .bannerMode(Banner.Mode.OFF)
            .build()
            .run(*args)
}