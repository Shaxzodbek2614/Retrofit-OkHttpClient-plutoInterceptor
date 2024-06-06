package com.example.retrofitexample.api

import com.example.retrofitexample.models.Malumot
import com.example.retrofitexample.reqCreate.ReqUser
import com.example.retrofitexample.reqCreate.ResUser
import com.example.retrofitexample.reqCreate.UpdateUser
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface ApiService {
    @GET("plan")
    fun getAllInfo():Call<List<Malumot>>

    @POST("api/users")
    fun createInfo(@Body reqUser: ReqUser):Call<ResUser>

    @PUT("api/users/{id}")
    fun updateUser(@Path("id") id:Int, @Body reqUser: ReqUser):Call<UpdateUser>

    @DELETE("api/users/{id}")
    fun deleteUser(@Path("id") id:Int):Call<ResponseBody>



}