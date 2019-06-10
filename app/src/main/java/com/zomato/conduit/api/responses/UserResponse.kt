package com.zomato.conduit.api.responses

import androidx.annotation.Keep
import com.zomato.conduit.models.User

@Keep
data class UserResponse(
    val user: User
)