package com.zomato.conduit.api.responses

import androidx.annotation.Keep
import com.zomato.conduit.models.Article

@Keep
data class ArticleResponse(
    val article: Article
) {
}