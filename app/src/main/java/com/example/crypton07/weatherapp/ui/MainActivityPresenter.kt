package com.example.crypton07.weatherapp.ui

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.example.crypton07.weatherapp.api.RestApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivityPresenter : MainActivityContract.Presenter {

    private lateinit var view: MainActivityContract.View
    private lateinit var context: Context

    override fun init(view: MainActivityContract.View, context: Context) {
        this.view = view
        this.context = context
    }

    @SuppressLint("CheckResult")
    override fun getWeatherData(name: String) {
        RestApi.serverApi().getData(q = name)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        { result ->
                            Log.v("ARTICLE ID ", "" + result)
                        },
                        { error ->
                            Log.e("ERROR", error.message)
                        })
    }
}