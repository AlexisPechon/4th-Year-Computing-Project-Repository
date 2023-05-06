package com.example.androidtimetableapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    //@GET("api/groute/404/0")
    @GET("/posts")
    Call<List<Posts>> getPosts();
}
