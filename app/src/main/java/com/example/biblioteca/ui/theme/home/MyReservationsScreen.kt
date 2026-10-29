package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.model.Reserva
import com.example.biblioteca.model.listaDeReservas
import com.example.biblioteca.ui.theme.Blanco
import com.example.biblioteca.ui.theme.Indigo
import com.example.biblioteca.ui.theme.IndigoClaro
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro
import com.example.biblioteca.ui.theme.Verde
import com.example.biblioteca.ui.theme.VerdeClaro

@Composable
fun MyReservationsScreen(onVerReservaClick: (Reserva) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp)
    ) {
        Text(
            text = "📋  Mis Reservas",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = TextoOscuro
        )

        Text(
            text = "Lista de reservas activas",
            fontSize = 14.sp,
            color = TextoGris,
            modifier = Modifier.padding(top = 4.dp, bottom = 20.dp)
        )

        LazyColumn {
            items(listaDeReservas) { reserva ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 14.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Blanco),
                    elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
                ) {
                    Column(modifier = Modifier.padding(18.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Box(
                                modifier = Modifier
                                    .size(52.dp)
                                    .background(
                                        IndigoClaro.copy(alpha = 0.2f),
                                        RoundedCornerShape(12.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(text = "📘", fontSize = 26.sp)
                            }

                            Column(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(start = 14.dp)
                            ) {
                                Text(
                                    text = reserva.nombreLibro,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = TextoOscuro
                                )
                                Text(
                                    text = "📅  ${reserva.fechaReserva}",
                                    fontSize = 13.sp,
                                    color = TextoGris,
                                    modifier = Modifier.padding(top = 4.dp)
                                )
                            }
                        }

                        Box(
                            modifier = Modifier
                                .padding(top = 14.dp)
                                .background(VerdeClaro, RoundedCornerShape(20.dp))
                                .padding(horizontal = 14.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = "● ${reserva.estado}",
                                fontSize = 12.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = Verde
                            )
                        }

                        Button(
                            onClick = { onVerReservaClick(reserva) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp)
                                .height(48.dp),
                            shape = RoundedCornerShape(14.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Indigo)
                        ) {
                            Text(
                                text = "👁  Ver Reserva",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }
        }
    }
}