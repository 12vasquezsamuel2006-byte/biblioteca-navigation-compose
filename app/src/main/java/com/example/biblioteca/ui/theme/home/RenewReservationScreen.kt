package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RenewReservationScreen(
    nombreLibro: String,
    fechaReserva: String,
    onConfirmarClick: (String) -> Unit
) {
    var fechaNueva by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Renovar Reserva",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Libro: $nombreLibro", fontSize = 18.sp)
                Text(
                    text = "Reserva Actual: $fechaReserva",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 12.dp)
                )
            }
        }

        Text(
            text = "Nueva Fecha:",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )

        OutlinedTextField(
            value = fechaNueva,
            onValueChange = { fechaNueva = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text(text = "30/06/2026") }
        )

        Button(
            onClick = { onConfirmarClick(fechaNueva) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            Text(text = "Confirmar Renovación")
        }
    }
}

