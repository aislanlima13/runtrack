package com.aislan.runtrack

import android.app.Application
import com.aislan.auth.presentation.di.authViewModelModule
import com.aislan.core.data.di.coreDataModule
import com.aislan.data.data.di.authDataModule
import com.aislan.run.location.di.locationModule
import com.aislan.run.presentation.di.runPresentationModule
import com.aislan.runtrack.di.appModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuntrackApp: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

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
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule
            )
        }
    }
}