package com.zomato.conduit.api

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

/**
 * created by championswimmer on 2019-06-11
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
class ConduitApiTests {

    @Test
    fun `GET articles`() = runBlocking {
        val resp = Client.conduitAPI.getArticles().body()
        Assert.assertNotNull(resp)
        resp!!.let {
            Assert.assertEquals(20, resp.articles.size)
        }
    }

}
