package com.devfest.foodish

import com.devfest.foodish.config.DrinkConfig

sealed class MainUiState {

    data object None: MainUiState()
    data class DessertConfigSuccess(val isEnable: Boolean): MainUiState()
    data class DrinkConfigSuccess(val config: DrinkConfig): MainUiState()
    data class Error(val throwable: Throwable): MainUiState()

}