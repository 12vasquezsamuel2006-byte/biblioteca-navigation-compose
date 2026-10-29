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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.biblioteca.model.Libro
import com.example.biblioteca.model.listaDeLibros
import com.example.biblioteca.ui.theme.Blanco
import com.example.biblioteca.ui.theme.Indigo
import com.example.biblioteca.ui.theme.IndigoClaro
import com.example.biblioteca.ui.theme.TextoGris
import com.example.biblioteca.ui.theme.TextoOscuro

@Composable
fun BookListScreen(onVerDetalleClick: (Libro) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp)
    ) {
        Text(
            text = "📚  Mis Libros",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = TextoOscuro
        )

        Text(
            text = "Elige un libro para ver más detalles.",
            fontSize = 14.sp,
            color = TextoGris,
            modifier = Modifier.padding(top = 4.dp, bottom = 20.dp)
        )

        LazyColumn {
            items(listaDeLibros) { libro ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 14.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = Blanco),
                    elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(48.dp)
                                .background(
                                    IndigoClaro.copy(alpha = 0.2f),
                                    RoundedCornerShape(12.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "📘", fontSize = 24.sp)
                        }

                        Column(
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 14.dp)
                        ) {
                            Text(
                                text = libro.nombre,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                color = TextoOscuro
                            )
                            Text(
                                text = libro.autor,
                                fontSize = 13.sp,
                                color = TextoGris,
                                modifier = Modifier.padding(top = 2.dp)
                            )
                        }

                        Button(
                            onClick = { onVerDetalleClick(libro) },
                            shape = RoundedCornerShape(12.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = Indigo),
                            modifier = Modifier.height(40.dp)
                        ) {
                            Text(
                                text = "Ver Detalle",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Medium
                            )
                        }
                    }
                }
            }
        }
    }
}