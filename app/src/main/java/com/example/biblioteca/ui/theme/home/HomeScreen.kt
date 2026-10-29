package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.Indigo
import com.example.biblioteca.ui.theme.IndigoClaro
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun HomeScreen(onVerLibrosClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(160.dp)
                .background(IndigoClaro.copy(alpha = 0.2f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "📚", fontSize = 72.sp)
        }

        Text(
            text = "¡Bienvenido a tu",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = TextoOscuro,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 32.dp)
        )

        Text(
            text = "Biblioteca!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Indigo,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Descubre, aprende y reserva tus libros favoritos.",
            fontSize = 15.sp,
            color = TextoGris,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )

        Button(
            onClick = onVerLibrosClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 48.dp)
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Indigo)
        ) {
            Text(
                text = "📖  Ver Libros",
                fontSize = 17.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}