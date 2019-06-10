package com.zomato.conduit.api.responses

import androidx.annotation.Keep

@Keep
data class ErrorsResponse(
    val errors: Errors
) {
    data class Errors(
        val body: List<String>
    )
}