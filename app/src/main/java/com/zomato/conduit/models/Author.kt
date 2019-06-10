package com.zomato.conduit.models

import androidx.annotation.Keep

@Keep
data class Author(
    val bio: String,
    val following: Boolean,
    val image: String,
    val username: String
)