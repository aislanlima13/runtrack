package com.aislan.data.data

import com.aislan.auth.domain.AuthRepository
import com.aislan.core.data.networking.post
import com.aislan.core.domain.util.DataError
import com.aislan.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}