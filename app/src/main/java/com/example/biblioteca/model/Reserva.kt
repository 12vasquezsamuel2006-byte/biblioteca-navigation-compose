package com.example.biblioteca.model

data class Reserva(
    val nombreLibro: String,
    val autor: String,
    val fechaReserva: String,
    val codigoReserva: String,
    val estado: String
)

val listaDeReservas = listOf(
    Reserva(
        nombreLibro = "Clean Code",
        autor = "Robert C. Martin",
        fechaReserva = "15/06/2026",
        codigoReserva = "RES-2026-001",
        estado = "Activa"
    )
)