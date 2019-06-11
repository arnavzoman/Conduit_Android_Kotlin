package com.zomato.conduit.repositories

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.zomato.conduit.api.Client
import com.zomato.conduit.models.Article

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */

class ArticlesRepository(application: Application) {

    val globalFeed: MutableLiveData<List<Article>> by lazy {
        MutableLiveData<List<Article>>()
    }

    suspend fun refreshFeed() {
        val resp = Client.conduitAPI.getArticles()
        resp.body()?.let {
            globalFeed.postValue(it.articles)
        }
    }
}