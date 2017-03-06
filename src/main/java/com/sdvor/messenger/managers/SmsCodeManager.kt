package com.sdvor.messenger.managers

import java.security.SecureRandom

/**
 * Created by mteterin on 06.03.2017.
 */
object SmsCodeManager {

    private val temporarySmsCodes: MutableMap<String, String> = mutableMapOf()

    fun generateNewCode(phone: String): String {
        val code = generateNumericCode()
        temporarySmsCodes += phone to code

        return code
    }

    private fun generateNumericCode(): String {
        return (10000 + SecureRandom().nextInt(90000)).toString()
    }

    fun checkCode(phone: String, code: String) = temporarySmsCodes[phone] == code
}