package com.aislan.core.presentation.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.text2.input.TextFieldState
import androidx.compose.runtime.snapshotFlow

@OptIn(ExperimentalFoundationApi::class)
fun TextFieldState.textAsFlow() = snapshotFlow { text }