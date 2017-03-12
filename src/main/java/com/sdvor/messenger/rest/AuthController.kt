package com.sdvor.messenger.rest

import com.sdvor.messenger.entities.AuthValidatingData
import com.sdvor.messenger.managers.SmsCodeManager
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.util.UriComponentsBuilder

/**
 * Created by mteterin on 01.03.2017.
 */
@RestController
class AuthController {

    private val SMS_GATE_API_KEY = "DD2E6238-4FDF-C67F-26D1-32CEA25E4E9F"

    @PostMapping("api/auth")
    fun requestSms(@RequestBody body: Map<String, String>): ResponseEntity<String> {
        val phone = body["phone"]!!
        val smsCode = SmsCodeManager.generateNewCode(phone)

        val url = UriComponentsBuilder.fromUriString("https://sms.ru/sms/send")
                .queryParam("api_id", SMS_GATE_API_KEY)
                .queryParam("to", phone)
                .queryParam("text", smsCode)
                .build()
                .encode()
                .toUri()

        RestTemplate().execute<Unit>(url, HttpMethod.POST, null, null)

        return ResponseEntity.ok().build()
    }

    @PostMapping("api/auth/validate")
    fun validateSmsCode(@RequestBody validatingData: AuthValidatingData): ResponseEntity<String> {
        val phone = validatingData.phone
        val code = validatingData.code

        if (SmsCodeManager.checkCode(phone, code))
            return ResponseEntity.status(202).build()
        else
            return ResponseEntity.status(401).build()
    }
}