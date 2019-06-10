package com.zomato.conduit.api.requests

import androidx.annotation.Keep
import com.zomato.conduit.models.User

@Keep
data class LoginRequest(
    val user: User
)