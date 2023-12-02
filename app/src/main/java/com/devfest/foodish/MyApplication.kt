package com.devfest.foodish

import android.app.Application

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        // TODO: initialize FirebaseApp & Remote Config
//        FirebaseApp.initializeApp(this)
//        val configSettings = FirebaseRemoteConfigSettings.Builder()
//            .setMinimumFetchIntervalInSeconds(3600)
//            .build()
//
//        FirebaseRemoteConfig.getInstance()
//            .setConfigSettingsAsync(configSettings)
    }
}