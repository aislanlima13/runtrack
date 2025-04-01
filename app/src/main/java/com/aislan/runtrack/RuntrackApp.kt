package com.aislan.runtrack

import android.app.Application
import com.aislan.auth.presentation.di.authViewModelModule
import com.aislan.data.di.authDataModule
import com.aislan.runtrack.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuntrackApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuntrackApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule
            )
        }
    }
}