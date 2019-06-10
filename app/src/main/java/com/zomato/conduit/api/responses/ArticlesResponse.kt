package com.zomato.conduit.api.responses

import androidx.annotation.Keep
import com.zomato.conduit.models.Article

@Keep
data class ArticlesResponse(
    val articles: List<Article>,
    val articlesCount: Int
)