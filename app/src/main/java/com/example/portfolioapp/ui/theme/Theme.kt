package com.example.portfolioapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Blue,
    secondary = Purple,
    tertiary = PurpleDark,
    background = Gray700,
    surface = Gray600,
    onPrimary = White,
    onSecondary = White,
    onTertiary = White,
    onBackground = Gray100,
    onSurface = Gray100,
    error = Danger,
    onError = White
)

private val LightColorScheme = lightColorScheme(
    primary = BlueDark,
    secondary = PurpleDark,
    tertiary = Purple,
    background = Gray700,
    surface = Gray600,
    onPrimary = White,
    onSecondary = White,
    onTertiary = White,
    onBackground = Gray100,
    onSurface = Gray100,
    error = Danger,
    onError = White
)

@Composable
fun PortfolioAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}