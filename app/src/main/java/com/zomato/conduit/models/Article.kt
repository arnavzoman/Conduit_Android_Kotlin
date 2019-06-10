package com.zomato.conduit.models

import androidx.annotation.Keep

@Keep
data class Article(
    val author: Author,
    val body: String,
    val createdAt: String,
    val description: String,
    val favorited: Boolean,
    val favoritesCount: Int,
    val slug: String,
    val tagList: List<String>,
    val title: String,
    val updatedAt: String
)