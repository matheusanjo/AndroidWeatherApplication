package com.infinityandroid.weatherapp.utils

import android.app.Application
import com.infinityandroid.weatherapp.dependency_injection.networkModule
import com.infinityandroid.weatherapp.dependency_injection.repositoryModule
import com.infinityandroid.weatherapp.dependency_injection.serializerModule
import com.infinityandroid.weatherapp.dependency_injection.storageModule
import com.infinityandroid.weatherapp.dependency_injection.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppConfig : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppConfig)
            modules(
                listOf(
                    repositoryModule,
                    viewModelModule,
                    serializerModule,
                    storageModule,
                    networkModule
                )
            )
        }
    }
}