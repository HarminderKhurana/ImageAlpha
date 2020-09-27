package com.live.harminder.imagex

import android.app.Application
import android.content.Context

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        instance = this
//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
//        LeakCanary.install(this);
//        // Normal app init code...
//
    }

    companion object {
        var context: Context? = null
        val TAG = BaseApplication::class.java.simpleName
        @get:Synchronized
        var instance: BaseApplication? = null
            private set
    }


}