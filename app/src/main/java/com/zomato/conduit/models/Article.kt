package com.zomato.conduit.models

import androidx.annotation.Keep
import androidx.recyclerview.widget.DiffUtil
import java.util.*

@Keep
data class Article(
    val author: Author,
    val body: String,
    val createdAt: Date,
    val description: String,
    val favorited: Boolean,
    val favoritesCount: Int,
    val slug: String,
    val tagList: List<String>,
    val title: String,
    val updatedAt: Date
){
    companion object {
        val diffCallback = object: DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.toString() == newItem.toString()
            }

        }
    }
}