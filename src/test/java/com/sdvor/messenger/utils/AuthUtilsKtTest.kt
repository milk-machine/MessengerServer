package com.sdvor.messenger.utils

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

/**
 * Created by mteterin on 06.03.2017.
 */
internal class AuthUtilsKtTest {

    @Test
    fun testGenerateSmsCode() {
        val predicate: String.() -> Boolean = {
            when {
                toInt() !in 0..99999 -> false
                else -> true
            }
        }

        for (Int in 1..200) {
            val generatedCode = generateSmsCode()
            assertTrue(predicate(generatedCode))
        }
    }
}