package com.example.crypton07.weatherapp.ui

import android.content.Context
import android.widget.Toast

class MainActivityPresenter : MainActivityContract.Presenter {

    private lateinit var view: MainActivityContract.View
    private lateinit var context: Context

    override fun init(view: MainActivityContract.View, context: Context) {
        this.view = view
        this.context = context
    }

    override fun getWeatherData(name: String) {
        Toast.makeText(context, name, Toast.LENGTH_SHORT).show()
    }
}