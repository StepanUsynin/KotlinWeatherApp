package com.example.crypton07.weatherapp.ui

import android.content.Context

class MainActivityContract {
    interface View {

    }

    interface Presenter {

        fun init(view: View, context: Context)

        fun getWeatherData(name: String)

    }
}