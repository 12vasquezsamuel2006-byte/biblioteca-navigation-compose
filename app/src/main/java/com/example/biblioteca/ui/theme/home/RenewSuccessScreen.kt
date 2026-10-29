package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.Blanco
import com.example.biblioteca.ui.theme.Indigo
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro
import com.example.biblioteca.ui.theme.Verde
import com.example.biblioteca.ui.theme.VerdeClaro

@Composable
fun RenewSuccessScreen(
    nombreLibro: String,
    fechaNueva: String,
    onVolverMisReservasClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .size(140.dp)
                .background(VerdeClaro, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "🔄", fontSize = 64.sp)
        }

        Text(
            text = "¡Reserva Renovada!",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = TextoOscuro,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp)
        )

        Text(
            text = "Tu reserva se extendió correctamente",
            fontSize = 14.sp,
            color = TextoGris,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 8.dp)
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Blanco),
            elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "📗", fontSize = 22.sp)
                    Column(modifier = Modifier.padding(start = 12.dp)) {
                        Text(text = "Libro", fontSize = 12.sp, color = TextoGris)
                        Text(
                            text = nombreLibro,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = TextoOscuro
                        )
                    }
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Text(text = "🗓️", fontSize = 22.sp)
                    Column(modifier = Modifier.padding(start = 12.dp)) {
                        Text(text = "Nueva Fecha", fontSize = 12.sp, color = TextoGris)
                        Text(
                            text = fechaNueva,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Verde
                        )
                    }
                }
            }
        }

        Button(
            onClick = onVolverMisReservasClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp)
                .height(54.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Indigo)
        ) {
            Text(
                text = "📋  Volver a Mis Reservas",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}