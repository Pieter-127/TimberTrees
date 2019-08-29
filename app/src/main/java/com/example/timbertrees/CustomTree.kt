package com.example.timbertrees

import android.util.Log
import android.util.Log.ERROR
import timber.log.Timber

class CustomTree : Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {

        if (priority == ERROR) {
            //log to Crash report service
            Log.d("example", "This will come through as debug log: $message")
        }

    }
}