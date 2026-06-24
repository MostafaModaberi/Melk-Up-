package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = TurquoiseDark,
    onPrimary = DarkBg,
    secondary = DeepBlueDark,
    onSecondary = TextPrimaryDark,
    background = DarkBg,
    onBackground = TextPrimaryDark,
    surface = DarkSurface,
    onSurface = TextPrimaryDark,
    error = Color(0xFFEF4444)
)

private val LightColorScheme = lightColorScheme(
    primary = DeepBlueLight,
    onPrimary = Color.White,
    secondary = TurquoiseLight,
    onSecondary = Color.White,
    background = LightBg,
    onBackground = TextPrimaryLight,
    surface = LightSurface,
    onSurface = TextPrimaryLight,
    error = Color(0xFFDC2626)
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = false, // Force Light theme: "تم برنامه روشن باشد"
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme = LightColorScheme // Always light scheme

    MaterialTheme(colorScheme = colorScheme, typography = Typography, content = content)
}
