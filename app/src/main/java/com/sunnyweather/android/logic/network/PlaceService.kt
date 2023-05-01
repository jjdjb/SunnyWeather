package com.sunnyweather.android.logic.network

import PlaceResponse
import com.sunnyweather.android.SunnyWeatherApplication
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}