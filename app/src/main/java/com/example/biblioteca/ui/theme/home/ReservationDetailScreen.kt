package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.ui.theme.Blanco
import com.example.biblioteca.ui.theme.IndigoClaro
import com.example.biblioteca.ui.theme.Rojo
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro
import com.example.biblioteca.ui.theme.Verde
import com.example.biblioteca.ui.theme.VerdeClaro

@Composable
fun ReservationDetailScreen(
    nombreLibro: String,
    autor: String,
    fechaReserva: String,
    codigoReserva: String,
    estado: String,
    onRenovarClick: () -> Unit,
    onCancelarClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Text(
            text = "Detalle de Reserva",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = TextoOscuro,
            modifier = Modifier.padding(bottom = 20.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Blanco),
            elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                FilaDato(emoji = "📖", etiqueta = "Nombre", valor = nombreLibro)
                FilaDato(emoji = "✍️", etiqueta = "Autor", valor = autor)
                FilaDato(emoji = "📅", etiqueta = "Fecha Reserva", valor = fechaReserva)
                FilaDato(emoji = "🔢", etiqueta = "Código Reserva", valor = codigoReserva)

                Box(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .background(VerdeClaro, RoundedCornerShape(20.dp))
                        .padding(horizontal = 14.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = "● $estado",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Verde
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
                .background(IndigoClaro.copy(alpha = 0.15f), RoundedCornerShape(12.dp))
                .padding(14.dp)
        ) {
            Text(
                text = "ℹ️  Estos datos fueron enviados desde la pantalla anterior como parámetros.",
                fontSize = 12.sp,
                color = TextoGris
            )
        }

        Button(
            onClick = onRenovarClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
                .height(52.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Verde)
        ) {
            Text(
                text = "🔄  Renovar Reserva",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold
            )
        }

        Button(
            onClick = onCancelarClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
                .height(52.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Rojo)
        ) {
            Text(
                text = "✕  Cancelar Reserva",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Composable
private fun FilaDato(emoji: String, etiqueta: String, valor: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(bottom = 14.dp)
    ) {
        Text(text = emoji, fontSize = 20.sp)
        Column(modifier = Modifier.padding(start = 12.dp)) {
            Text(text = etiqueta, fontSize = 11.sp, color = TextoGris)
            Text(
                text = valor,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = TextoOscuro
            )
        }
    }
}