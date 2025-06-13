package com.aislan.core.domain.util

// D é o tipo genérico para o Dado e E é o tipo genérico para o tipo de Erro
sealed interface Result<out D, out E: Error> {
    data class Success<out D>(val data: D): Result<D, Nothing>
    data class Error<out E: com.aislan.core.domain.util.Error>(val error: E): Result<Nothing, E>
}

// um map que pode "processar" os dados do Result
inline fun <T, E: Error, R> Result<T, E>.map(map: (T) -> R): Result<R, E> {
    return when (this) {
        is Result.Error -> Result.Error(error)
        is Result.Success -> Result.Success(map(data))
    }
}

fun <T, E: Error> Result<T, E>.asEmptyDataResult(): EmptyResult<E> {
    return map { }
}

typealias EmptyResult<E> = Result<Unit, E>