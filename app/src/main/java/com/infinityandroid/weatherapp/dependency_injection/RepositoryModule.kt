package com.infinityandroid.weatherapp.dependency_injection

import com.infinityandroid.weatherapp.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { WeatherDataRepository(weatherAPI = get()) }
}