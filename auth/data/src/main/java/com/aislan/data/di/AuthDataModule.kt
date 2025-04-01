package com.aislan.data.di

import com.aislan.auth.domain.PatternValidator
import com.aislan.auth.domain.UserDataValidator
import com.aislan.data.data.EmailPatternValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}
