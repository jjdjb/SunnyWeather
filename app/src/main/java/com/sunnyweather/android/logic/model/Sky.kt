package com.sunnyweather.android.logic.model

import com.sunnyweather.android.R

class Sky (val info: String, val icon: Int, val bg: Int)
private val sky = mapOf(
    "CLEAR_DAY" to Sky("Clear Day", R.drawable.ic_clear_day, R.drawable.bg_clear_day),
    "CLEAR_NIGHT" to Sky("Clear Night", R.drawable.ic_clear_night, R.drawable.bg_clear_night),
    "PARTLY_CLOUDY_DAY" to Sky("Partly Cloudy Day", R.drawable.ic_partly_cloud_day, R.drawable.bg_partly_cloudy_day),
    "PARTLY_CLOUDY_NIGHT" to Sky("Partly Cloudy Night", R.drawable.ic_partly_cloud_night, R.drawable.bg_partly_cloudy_night),
    "CLOUDY" to Sky("Cloudy", R.drawable.ic_cloudy, R.drawable.bg_cloudy),
    "WIND" to Sky("Windy", R.drawable.ic_cloudy, R.drawable.bg_wind),
    "LIGHT_RAIN" to Sky("Light Rain", R.drawable.ic_light_rain, R.drawable.bg_rain),
    "MODERATE_RAIN" to Sky("Moderate Rain", R.drawable.ic_moderate_rain, R.drawable.bg_rain),
    "HEAVY_RAIN" to Sky("Heavy Rain", R.drawable.ic_heavy_rain, R.drawable.bg_rain),
    "STORM_RAIN" to Sky("Storm Rain", R.drawable.ic_storm_rain, R.drawable.bg_rain),
    "THUNDER_SHOWER" to Sky("Thunder Shower", R.drawable.ic_thunder_shower, R.drawable.bg_rain),
    "SLEET" to Sky("Sleet", R.drawable.ic_sleet, R.drawable.bg_rain),
    "LIGHT_SNOW" to Sky("Light Snow", R.drawable.ic_light_snow, R.drawable.bg_snow),
    "MODERATE_SNOW" to Sky("Moderate Snow", R.drawable.ic_moderate_snow, R.drawable.bg_snow),
    "HEAVY_SNOW" to Sky("Heavy Snow", R.drawable.ic_heavy_snow, R.drawable.bg_snow),
    "STORM_SNOW" to Sky("Storm Snow", R.drawable.ic_heavy_snow, R.drawable.bg_snow),
    "HAIL" to Sky("Hail", R.drawable.ic_hail, R.drawable.bg_snow),
    "LIGHT_HAZE" to Sky("Light Haze", R.drawable.ic_light_haze, R.drawable.bg_fog),
    "MODERATE_HAZE" to Sky("Moderate Haze", R.drawable.ic_moderate_haze, R.drawable.bg_fog),
    "HEAVY_HAZE" to Sky("Heavy Haze", R.drawable.ic_heavy_haze, R.drawable.bg_fog),
    "FOG" to Sky("Fog", R.drawable.ic_fog, R.drawable.bg_fog),
    "DUST" to Sky("Dust", R.drawable.ic_fog, R.drawable.bg_fog)
)
fun getSky(skycon: String): Sky {
    return sky[skycon] ?: sky["CLEAR_DAY"]!!
}