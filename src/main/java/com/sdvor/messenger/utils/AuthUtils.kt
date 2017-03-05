package com.sdvor.messenger.utils

import java.math.BigInteger
import java.security.SecureRandom

/**
 * Created by kefir on 05.03.2017.
 */

fun generateSmsCode(): String {

    val random = SecureRandom()

    return BigInteger(130, random).toString()
}