package com.example.crypton07.weatherapp.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.crypton07.weatherapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.init(this, applicationContext)

        searchButton.setOnClickListener{
            presenter.getWeatherData(cityEditText.text.toString())
        }
    }
}
