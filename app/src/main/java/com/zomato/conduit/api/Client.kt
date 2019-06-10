package com.zomato.conduit.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * created by championswimmer on 2019-06-10
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
object Client {

    val okhttp by lazy {
        OkHttpClient.Builder()
            .build()
    }

    val retrofit by lazy {

        Retrofit.Builder()
            .baseUrl("https://conduit.productionready.io/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val conduitAPI by lazy {
        retrofit.create(ConduitAPI::class.java)
    }

}