package com.example.biblioteca.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = Indigo,
    onPrimary = Blanco,
    primaryContainer = IndigoClaro,
    onPrimaryContainer = Blanco,

    secondary = Naranja,
    onSecondary = Blanco,
    secondaryContainer = NaranjaClaro,

    tertiary = Verde,
    onTertiary = Blanco,
    tertiaryContainer = VerdeClaro,

    error = Rojo,
    onError = Blanco,

    background = FondoClaro,
    onBackground = TextoOscuro,

    surface = Blanco,
    onSurface = TextoOscuro,
    surfaceVariant = Blanco,
    onSurfaceVariant = TextoGris
)

@Composable
fun BibliotecaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}