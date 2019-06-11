package com.zomato.conduit.fragments.feed

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.zomato.conduit.models.Article
import com.zomato.conduit.repositories.ArticlesRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FeedViewModel(application: Application) : AndroidViewModel(application) {

    private val articlesRepository = ArticlesRepository(application)

    fun getGlobalFeed(): MutableLiveData<List<Article>> {
        CoroutineScope(Dispatchers.IO).launch {
            articlesRepository.refreshFeed()
        }
        return articlesRepository.globalFeed
    }


}
