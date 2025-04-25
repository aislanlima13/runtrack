package com.aislan.auth.presentation.di

import com.aislan.auth.presentation.login.LoginViewModel
import com.aislan.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}