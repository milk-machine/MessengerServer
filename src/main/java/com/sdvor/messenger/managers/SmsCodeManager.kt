package com.sdvor.messenger.managers

import com.sdvor.messenger.utils.generateSmsCode

/**
 * Created by mteterin on 06.03.2017.
 */
object SmsCodeManager {

    private val temporarySmsCodes: MutableMap<String, String> = LinkedHashMap()

    fun getCode(phone: String): String {
        val code = generateSmsCode()
        temporarySmsCodes += phone to code

        return code
    }

    fun checkCode(phone: String, code: String) = temporarySmsCodes[phone] == code
}