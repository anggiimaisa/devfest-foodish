package com.devfest.foodish.config

import com.google.gson.annotations.SerializedName

data class DrinkConfig (
    @SerializedName("enabled")
    val enabled: Boolean,
    @SerializedName("top_drink")
    val topDrink: String
)