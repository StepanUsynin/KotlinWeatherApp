package com.example.crypton07.weatherapp.api

import com.example.crypton07.weatherapp.model.WeatherResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

const val KEY: String = "88a37b3a65e01f19b0eab7b945e81c42"

interface OpenWeatherApiService {
    @GET("data/2.5/weather")
    fun getData(@Query("APPID") APPID: String = KEY,
                @Query("q") q: String) : Observable<WeatherResponse>
}