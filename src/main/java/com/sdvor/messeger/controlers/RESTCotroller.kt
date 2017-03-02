package com.sdvor.messeger.controlers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by mteterin on 01.03.2017.
 */
@RestController
class RESTCotroller {

    @PostMapping(name = "api/auth")
    fun auth(@RequestBody phone: String): ResponseEntity<String> {
        return ResponseEntity.ok().body(phone + " ok!")
    }

    @PostMapping(name = "api/auth/validate")
    fun validateSmsCode(): ResponseEntity<String> {
        return ResponseEntity.ok().build()
    }
}