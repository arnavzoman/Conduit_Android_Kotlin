package com.zomato.conduit.api

import com.zomato.conduit.api.requests.LoginRequest
import com.zomato.conduit.api.requests.SignupRequest
import com.zomato.conduit.api.responses.ArticlesResponse
import com.zomato.conduit.api.responses.ProfileResponse
import com.zomato.conduit.api.responses.UserResponse
import com.zomato.conduit.models.User
import retrofit2.Call
import retrofit2.http.*

/**
 * created by championswimmer on 2019-06-10
 * Copyright (c) 2019 Zomato Media Pvt. Ltd.
 */
interface ConduitAPI {

    @POST("api/users/login")
    fun loginUser(@Body loginRequest: LoginRequest): Call<UserResponse>

    @POST("api/users")
    fun signupUser(@Body signupRequest: SignupRequest): Call<UserResponse>

    @GET("api/user")
    fun getUser(): Call<UserResponse>

    @PUT("api/user")
    fun updateUser(@Body user: User): Call<UserResponse>

    @GET("api/user/{username}")
    fun getProfile(@Path("username") username: String): Call<ProfileResponse>

    @POST("api/profiles/{username}/follow")
    fun followProfile(@Path("username") username: String): Call<ProfileResponse>

    @DELETE("api/profiles/{username}/follow")
    fun unfollowProfile(@Path("username") username: String): Call<ProfileResponse>

    @GET("api/articles")
    fun getArticles(
        @Query("tag") vararg tag: String?,
        @Query("author") author: String?,
        @Query("favourited") user: String?,
        @Query("limit") limit: Int = 20,
        @Query("offset") offset: Int = 0
    ): Call<ArticlesResponse>


}