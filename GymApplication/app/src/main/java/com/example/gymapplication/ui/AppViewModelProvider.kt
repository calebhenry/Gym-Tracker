package com.example.gymapplication.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.gymapplication.GymApplication
import com.example.gymapplication.ui.home.HomeViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(gymApplication().container.routinesRepository)
        }
    }
}

fun CreationExtras.gymApplication(): GymApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as GymApplication)