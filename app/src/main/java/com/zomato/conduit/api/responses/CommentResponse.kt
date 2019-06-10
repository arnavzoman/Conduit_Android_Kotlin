package com.zomato.conduit.api.responses

import androidx.annotation.Keep
import com.zomato.conduit.models.Comment

@Keep
data class CommentResponse(
    val comment: Comment
)