package com.example.gymapplication

import android.app.Application
import com.example.gymapplication.data.AppContainer
import com.example.gymapplication.data.AppDataContainer

class GymApplication: Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}