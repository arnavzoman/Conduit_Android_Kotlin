package com.zomato.conduit.models

import androidx.annotation.Keep

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */

@Keep
data class User(
    val username: String?,
    val email: String?,
    val password: String?,
    val bio: String?,
    val image: String?,
    val token: String?
)
