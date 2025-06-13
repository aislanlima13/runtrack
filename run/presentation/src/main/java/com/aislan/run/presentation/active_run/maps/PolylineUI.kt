package com.aislan.run.presentation.active_run.maps

import androidx.compose.ui.graphics.Color
import com.aislan.core.domain.location.Location

data class PolylineUI(
    val location1: Location,
    val location2: Location,
    val color: Color
)
