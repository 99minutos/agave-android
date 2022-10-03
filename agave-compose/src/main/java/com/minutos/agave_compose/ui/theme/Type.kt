package com.minutos.agave_compose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.minutos.agave_compose.R

val fonts = FontFamily(
    Font(R.font.barlowbold, weight = FontWeight.Bold),
    Font(R.font.barlowsemibold, weight = FontWeight.SemiBold),
    Font(R.font.barlowmedium, weight = FontWeight.Medium),
    Font(R.font.barlow_light, weight = FontWeight.Light),
    Font(R.font.barlowregular, weight = FontWeight.Normal),
)
val Typography = Typography(
    h1= TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 75.sp
    ),
    h2= TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 60.sp
    ),
    h3= TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 45.sp
    ),
    h4= TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 35.sp
    ),
    h5= TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),
    h6= TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 19.sp
    ),

    subtitle1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 19.sp
    ),
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 17.sp
    ),
    button = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    caption = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

)