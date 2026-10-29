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
