package com.example.crypton07.weatherapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface yahooWeatherApiService {
    @GET("v1/public/yq")
    fun getData(@Query("q") query: String)
}