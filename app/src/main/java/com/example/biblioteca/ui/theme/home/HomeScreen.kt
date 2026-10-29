package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(onVerLibrosClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "¡Bienvenido a tu Biblioteca!",
            fontSize = 28.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Descubre, aprende y reserva tus libros favoritos.",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 12.dp)
        )

        Button(
            onClick = onVerLibrosClick,
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text(text = "Ver Libros")
        }
    }
}

