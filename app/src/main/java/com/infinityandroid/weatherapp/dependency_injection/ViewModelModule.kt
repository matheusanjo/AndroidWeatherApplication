package com.infinityandroid.weatherapp.dependency_injection

import com.infinityandroid.weatherapp.fragments.home.HomeViewModel
import com.infinityandroid.weatherapp.fragments.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(weatherDataRepository = get()) }
    viewModel { LocationViewModel(weatherDataRepository = get()) }
}