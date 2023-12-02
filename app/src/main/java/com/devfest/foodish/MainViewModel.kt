package com.devfest.foodish

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel: ViewModel() {

    // TODO: get RemoteConfigManager.kt instance

    private val _uiState = MutableStateFlow(MainUiState.None)
    val uiState: StateFlow<MainUiState> = _uiState

    fun fetchConfig() {
//        remoteConfigManager.fetchConfig { configName ->
//        TODO: setting UI State
//        }
    }
}