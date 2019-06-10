package com.zomato.conduit.api.requests

import androidx.annotation.Keep
import com.zomato.conduit.models.User

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */

@Keep
data class SignupRequest(
    val user: User
)