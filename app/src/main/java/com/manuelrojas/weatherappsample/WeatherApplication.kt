package com.manuelrojas.weatherappsample

import android.util.Log
import androidx.multidex.MultiDexApplication
import com.facebook.stetho.Stetho
import com.jakewharton.threetenabp.AndroidThreeTen
import com.manuelrojas.data_weather.di.WeatherDataInjector
import com.manuelrojas.feature_weather.di.WeatherInjector
import com.manuelrojas.weatherappsample.di.AppInjector

class WeatherApplication : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        initializeDagger()
        initializeWeather()
        initializeThreeTen()
        initializeStetho()
    }

    private fun initializeDagger() {
        AppInjector.initialize(this)
        Log.d("WeatherDataInjector", "initializeDagger")
    }

    private fun initializeWeather() {
        Log.d("WeatherDataInjector", "initializeWeather")
        WeatherDataInjector.initialize() //Inject dependencies for data and domain layers
        WeatherInjector.initialize()  //Inject dependencies for feature(presentation) layer
    }

    private fun initializeThreeTen() = AndroidThreeTen.init(this)

    private fun initializeStetho() = Stetho.initializeWithDefaults(this)
}