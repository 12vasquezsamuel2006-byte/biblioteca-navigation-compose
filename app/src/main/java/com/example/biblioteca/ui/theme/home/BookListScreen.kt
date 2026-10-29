package com.example.biblioteca.ui.theme.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.biblioteca.model.Libro
import com.example.biblioteca.model.listaDeLibros

@Composable
fun BookListScreen(onVerDetalleClick: (Libro) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Mis Libros",
            fontSize = 26.sp
        )

        Text(
            text = "Elige un libro para ver más detalles.",
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 16.dp)
        )

        LazyColumn {
            items(listaDeLibros) { libro ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = libro.nombre,
                            fontSize = 16.sp,
                            modifier = Modifier.weight(1f)
                        )

                        Button(onClick = { onVerDetalleClick(libro) }) {
                            Text(text = "Ver Detalle")
                        }
                    }
                }
            }
        }
    }
}
