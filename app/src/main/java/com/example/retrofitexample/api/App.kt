package com.example.retrofitexample.api

import android.app.Application
import com.mocklets.pluto.Pluto

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        Pluto.initialize(this)
    }
}