package com.example.timbertrees

import android.app.Application
import timber.log.Timber

class TimberApp : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(CustomTree())
        }
    }
}