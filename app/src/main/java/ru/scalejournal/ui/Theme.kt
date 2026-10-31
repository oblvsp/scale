package ru.scalejournal.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

// Тёмная схема — цвета сняты пипеткой со скриншотов «Калькулятора КБЖУ» (бирюзовый тон, hue ≈ 180°).
private val DarkColors = darkColorScheme(
    primary = Color(0xFFA1F5F7),
    onPrimary = Color(0xFF052B2E),
    primaryContainer = Color(0xFF2E686A),
    onPrimaryContainer = Color(0xFFDDE7E8),
    secondaryContainer = Color(0xFF476E6D),
    onSecondaryContainer = Color(0xFFDDE7E8),
    tertiary = Color(0xFF138D90),
    onTertiary = Color(0xFF052B2E),
    tertiaryContainer = Color(0xFF17393A),
    onTertiaryContainer = Color(0xFFC2D0D0),
    error = Color(0xFFF2B8B5),
    errorContainer = Color(0xFF8C1D18),
    onErrorContainer = Color(0xFFF9DEDC),
    surface = Color(0xFF0F1817),
    onSurface = Color(0xFFDDE7E8),
    surfaceContainerLow = Color(0xFF182325),
    surfaceContainer = Color(0xFF1C2C2C),
    surfaceContainerHigh = Color(0xFF223635),
    surfaceContainerHighest = Color(0xFF2A4242),
    onSurfaceVariant = Color(0xFFC2D0D0),
    outline = Color(0xFF425758),
    outlineVariant = Color(0xFF2A4242),
)

// Светлая схема — тот же тон (hue 180°, sat 58%), контрастные значения.
private val LightColors = lightColorScheme(
    primary = Color(0xFF33C1C1),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFDDF3F3),
    onPrimaryContainer = Color(0xFF155151),
    secondaryContainer = Color(0xFFDCECEC),
    onSecondaryContainer = Color(0xFF1E3E3E),
    tertiary = Color(0xFF348E8E),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFD6EBEB),
    onTertiaryContainer = Color(0xFF1E5252),
    error = Color(0xFFB3261E),
    errorContainer = Color(0xFFF9DEDC),
    onErrorContainer = Color(0xFF410E0B),
    surface = Color(0xFFFBFCFC),
    onSurface = Color(0xFF1C2121),
    surfaceContainerLow = Color(0xFFF5F8F8),
    surfaceContainer = Color(0xFFEFF4F4),
    surfaceContainerHigh = Color(0xFFE9EFEF),
    surfaceContainerHighest = Color(0xFFE2EBEB),
    onSurfaceVariant = Color(0xFF475252),
    outline = Color(0xFF738181),
    outlineVariant = Color(0xFFCAD3D3),
)

@Composable
fun AppTheme(content: @Composable () -> Unit) {
    val dark = isSystemInDarkTheme()
    MaterialTheme(
        colorScheme = if (dark) DarkColors else LightColors,
        shapes = MaterialTheme.shapes.copy(
            medium = RoundedCornerShape(16.dp),
        ),
        content = content,
    )
}
