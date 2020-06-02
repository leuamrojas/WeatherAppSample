package com.manuelrojas.data_weather.network.model

data class Currently(val time: String,
                     val summary: String,
                     val icon: String,
                     val nearestStormDistance: Int,
                     val nearestStormBearing: Int,
                     val precipIntensity: Double,
                     val precipProbability: Double,
                     val temperature: Double,
                     val apparentTemperature: Double,
                     val dewPoint: Double,
                     val humidity: Double,
                     val pressure: Double,
                     val windSpeed: Double,
                     val windGust: Double,
                     val windBearing: Int,
                     val cloudCover: Double,
                     val uvIndex: Int,
                     val visibility: Double,
                     val ozone: Double)