package com.sdvor.messenger.controllers

import com.sdvor.messenger.utils.generateSmsCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.util.UriComponentsBuilder

/**
 * Created by mteterin on 01.03.2017.
 */
@RestController
class AuthController {

    private val SMS_GATE_API_KEY = "DD2E6238-4FDF-C67F-26D1-32CEA25E4E9F"

    @PostMapping("api/auth")
    fun auth(@RequestBody phone: String): ResponseEntity<String> {
        val uri = UriComponentsBuilder.fromUriString("https://sms.ru/sms/send")
                .queryParam("api_id", SMS_GATE_API_KEY)
                .queryParam("to", phone)
                .queryParam("text", generateSmsCode())
                .build()


        return ResponseEntity.ok().build()
    }

    @PostMapping("api/auth/validate")
    fun validateSmsCode(): ResponseEntity<String> {
        return ResponseEntity.ok().build()
    }
}