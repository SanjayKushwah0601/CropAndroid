package com.sanjay.networking.logging


//import com.crashlytics.android.Crashlytics

import timber.log.Timber

class CrashlyticsTree : Timber.Tree() {
    override protected fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
//        Crashlytics.log(message)
    }
}