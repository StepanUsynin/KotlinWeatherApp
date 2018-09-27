package com.example.crypton07.weatherapp.model

data class Query (
        val count: Long,
        val created: String,
        val lang: String,
        val results: Results
)

data class Results (
        val channel: Channel
)

data class Channel (
        val units: Units,
        val title: String,
        val link: String,
        val description: String,
        val language: String,
        val lastBuildDate: String,
        val ttl: String,
        val location: Location,
        val wind: Wind,
        val atmosphere: Atmosphere,
        val astronomy: Astronomy,
        val image: Image,
        val item: Item
)

data class Astronomy (
        val sunrise: String,
        val sunset: String
)

data class Atmosphere (
        val humidity: String,
        val pressure: String,
        val rising: String,
        val visibility: String
)

data class Image (
        val title: String,
        val width: String,
        val height: String,
        val link: String,
        val url: String
)

data class Item (
        val title: String,
        val lat: String,
        val long: String,
        val link: String,
        val pubDate: String,
        val condition: Condition,
        val forecast: List<Forecast>,
        val description: String,
        val guid: GUID
)

data class Condition (
        val code: String,
        val date: String,
        val temp: String,
        val text: String
)

data class Forecast (
        val code: String,
        val date: String,
        val day: String,
        val high: String,
        val low: String,
        val text: String
)

data class GUID (
        val isPermaLink: String
)

data class Location (
        val city: String,
        val country: String,
        val region: String
)

data class Units (
        val distance: String,
        val pressure: String,
        val speed: String,
        val temperature: String
)

data class Wind (
        val chill: String,
        val direction: String,
        val speed: String
)
