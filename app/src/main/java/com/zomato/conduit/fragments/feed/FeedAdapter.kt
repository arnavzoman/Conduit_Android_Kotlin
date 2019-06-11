package com.zomato.conduit.fragments.feed

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.getSystemService
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zomato.conduit.R
import com.zomato.conduit.models.Article
import kotlinx.android.synthetic.main.list_item_article.view.*

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */

class FeedAdapter :
    ListAdapter<Article, FeedAdapter.ArticleViewHolder>(Article.diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val inflater = parent.context.getSystemService<LayoutInflater>()
        val itemView = inflater?.inflate(R.layout.list_item_article, parent, false)
        return ArticleViewHolder(itemView!!)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.itemView.run {
            getItem(position).let {
                tvTitle.text = it.title
            }

        }
    }


    inner class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}