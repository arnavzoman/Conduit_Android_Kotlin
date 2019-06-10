package com.zomato.conduit.api.responses

import androidx.annotation.Keep

@Keep
data class TagsResponse(
    val tags: List<String>
)