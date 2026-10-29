package com.example.biblioteca.navigation

import kotlinx.serialization.Serializable

@Serializable
object Inicio

@Serializable
object ListaLibros

@Serializable
data class DetalleLibro(
    val nombre: String,
    val autor: String,
    val categoria: String,
    val descripcion: String
)

@Serializable
data class Confirmacion(
    val nombreLibro: String,
    val fecha: String
)
@Serializable
object MisReservas

@Serializable
data class DetalleReserva(
    val nombreLibro: String,
    val autor: String,
    val fechaReserva: String,
    val codigoReserva: String,
    val estado: String
)

@Serializable
data class RenovarReserva(
    val nombreLibro: String,
    val fechaReserva: String
)

@Serializable
data class RenovacionExitosa(
    val nombreLibro: String,
    val fechaNueva: String
)