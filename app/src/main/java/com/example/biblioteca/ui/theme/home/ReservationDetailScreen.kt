package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            .padding(16.dp)
    ) {
        Text(
            text = "Detalle de Reserva",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Nombre: $nombreLibro", fontSize = 16.sp)
                Text(
                    text = "Autor: $autor",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Fecha Reserva: $fechaReserva",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Código Reserva: $codigoReserva",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Estado: $estado",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }

        Text(
            text = "Estos datos fueron enviados desde la pantalla anterior como parámetros.",
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        Button(
            onClick = onRenovarClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            Text(text = "Renovar Reserva")
        }

        Button(
            onClick = onCancelarClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        ) {
            Text(text = "Cancelar Reserva")
        }
    }
}
