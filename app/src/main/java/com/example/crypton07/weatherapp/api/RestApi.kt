package com.example.crypton07.weatherapp.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RestApi {    
    private val baseUrl: String = "https://query.yahooapis.com/"    
    fun create(): YahooWeatherApiService{
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()
        return retrofit.create(YahooWeatherApiService::class.java)
    }
}