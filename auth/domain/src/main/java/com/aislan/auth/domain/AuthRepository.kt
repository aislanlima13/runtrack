package com.aislan.auth.domain

import com.aislan.core.domain.util.DataError
import com.aislan.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}