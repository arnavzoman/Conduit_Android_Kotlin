package com.zomato.conduit.api.responses

import androidx.annotation.Keep

@Keep
data class ProfileResponse(
    val profile: Profile
) {
    data class Profile(
        val bio: String,
        val following: Boolean,
        val image: String,
        val username: String
    )
}