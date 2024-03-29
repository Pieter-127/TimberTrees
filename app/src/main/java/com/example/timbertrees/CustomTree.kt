package com.example.timbertrees

import android.util.Log
import timber.log.Timber

class CustomTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {

        if (priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO) {
            return
        }

        //log to Crash report service
        Log.d("example", "This will come through as debug log: $message")


    }
}