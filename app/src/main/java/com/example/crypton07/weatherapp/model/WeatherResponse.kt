package com.example.crypton07.weatherapp.model

import com.beust.klaxon.Json

data class WeatherResponse (
        val coord: Coord,
        val weather: List<Weather>,
        val base: String,
        val main: Main,
        val wind: Wind,
        val clouds: Clouds,
        val rain: Rain,
        val dt: Long,
        val sys: Sys,
        val id: Long,
        val name: String,
        val cod: Int
)

data class Coord (
        val lon: Double,
        val lat: Double
)

data class Weather (
        val id: Int,
        val main: String,
        val description: String,
        val icon: String
)

data class Main (
        val temp: Double,
        val pressure: Double,
        val humidity: Int,

        @Json(name = "temp_min")
        val tempMin: Double,

        @Json(name = "temp_max")
        val tempMax: Double,

        @Json(name = "sea_level")
        val seaLevel: Double,

        @Json(name = "grnd_level")
        val grndLevel: Double
)

data class Wind (
        val speed: Double,
        val deg: Double
)

data class Clouds (
        val all: Int
)

data class Rain (
        @Json(name = "3h")
        val the3H: Long
)

data class Sys (
        val type: Long,
        val id: Long,
        val message: Double,
        val country: String,
        val sunrise: Long,
        val sunset: Long
)
