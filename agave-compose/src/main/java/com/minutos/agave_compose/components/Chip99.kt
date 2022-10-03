package com.minutos.agave_compose.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.minutos.agave_compose.ui.theme.fonts

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Chip99(
    color: Color,
    text: String,
    onClick: () -> Unit
) {
    Chip(
        colors = ChipDefaults.chipColors(color.copy(alpha = 0.25f)),
        shape = RoundedCornerShape(5.dp),
        onClick = { }) {
        Text(
            text = text, style = TextStyle(color = color, fontFamily = fonts, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
        )
    }

}
