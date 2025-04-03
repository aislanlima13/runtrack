package com.aislan.core.data.networking

import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
}
