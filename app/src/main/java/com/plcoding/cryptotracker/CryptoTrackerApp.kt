package com.plcoding.cryptotracker

import android.app.Application
import com.plcoding.cryptotracker.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CryptoTrackerApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { // this will setup koin
            androidContext(this@CryptoTrackerApp) // if one of our dependencies need context, koin will know this
            androidLogger()

            modules(appModule) // we'll need to add all of our dependency modules
        }
    }
}