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
fun BookDetailScreen(
    nombre: String,
    autor: String,
    categoria: String,
    descripcion: String,
    onReservarClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Detalle del Libro",
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Nombre: $nombre", fontSize = 16.sp)
                Text(
                    text = "Autor: $autor",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Categoría: $categoria",
                    fontSize = 16.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Descripción: $descripcion",
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }

        Button(
            onClick = onReservarClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            Text(text = "Reservar Libro")
        }
    }
}

