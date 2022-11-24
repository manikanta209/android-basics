package com.md.api_call.api

import com.md.api_call.model.User
import com.md.api_call.model.UserItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("/users")
    suspend fun getAllUsers() : Response<User>

    //Get used data based on specific id
    @GET("/users/{id}")
    suspend fun getSingleUser(@Path("id") id : Int) : Response<UserItem>

}