package com.infinityandroid.weatherapp.dependency_injection

import com.infinityandroid.weatherapp.storage.SharedPreferencesManager
import org.koin.dsl.module

val storageModule = module {
    single { SharedPreferencesManager(context = get(), gson = get()) }
}