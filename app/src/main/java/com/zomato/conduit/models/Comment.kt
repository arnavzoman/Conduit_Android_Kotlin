package com.zomato.conduit.models

import androidx.annotation.Keep

@Keep
data class Comment(
    val author: Author,
    val body: String,
    val createdAt: String,
    val id: Int,
    val updatedAt: String
)