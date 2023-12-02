package com.devfest.foodish.config

import android.util.Log
import com.google.gson.Gson

class RemoteConfigManager {

    // TODO: get remote config instance

    fun fetchConfig(onComplete: (String) -> Unit) {
        // TODO: listen to remote config whenever there's a changes
//        remoteConfig.addOnConfigUpdateListener(
//            object : ConfigUpdateListener {
//                override fun onUpdate(configUpdate: ConfigUpdate) {
//                    remoteConfig.activate().addOnCompleteListener {
//                        if (it.isSuccessful) {
//                            configUpdate.updatedKeys.forEach { key ->
//                               // TODO: do something when it succeed
//                            }
//                        }
//                    }
//                }
//                override fun onError(error: FirebaseRemoteConfigException) {
//                    // TODO: do something when got error
//                }
//            }
//        )
    }

//    fun getBoolean(key: String): Boolean = remoteConfig.getBoolean(key)

    // TODO: get drink config (json value)
//    fun getDrinkConfig(key: String): DrinkConfig {
//        val jsonString = remoteConfig.getString(key)
//        return Gson().fromJson(jsonString, DrinkConfig::class.java)
//    }

}