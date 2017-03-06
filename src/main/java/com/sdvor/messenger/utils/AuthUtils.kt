package com.sdvor.messenger.utils

import java.security.SecureRandom

/**
 * Created by kefir on 05.03.2017.
 */

fun generateSmsCode(): String {

    return (10000 + SecureRandom().nextInt(90000)).toString()
}