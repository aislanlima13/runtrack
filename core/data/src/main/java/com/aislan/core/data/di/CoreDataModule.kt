package com.aislan.core.data.di

import com.aislan.core.data.auth.EncryptedSessionStorage
import com.aislan.core.data.networking.HttpClientFactory
import com.aislan.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}
