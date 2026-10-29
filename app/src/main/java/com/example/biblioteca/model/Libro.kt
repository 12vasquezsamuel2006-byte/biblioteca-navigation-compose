package com.example.biblioteca.model

data class Libro(
    val nombre: String,
    val autor: String,
    val categoria: String,
    val descripcion: String
)

val listaDeLibros = listOf(
    Libro(
        nombre = "Clean Code",
        autor = "Robert C. Martin",
        categoria = "Programación",
        descripcion = "Guía práctica para escribir código limpio, legible y mantenible. Un clásico imprescindible para desarrolladores."
    ),
    Libro(
        nombre = "Kotlin para Android",
        autor = "Antonio Leiva",
        categoria = "Desarrollo Móvil",
        descripcion = "Aprende a desarrollar aplicaciones Android modernas usando el lenguaje Kotlin."
    ),
    Libro(
        nombre = "Arquitectura de Software",
        autor = "Robert C. Martin",
        categoria = "Ingeniería",
        descripcion = "Principios y patrones para diseñar sistemas de software escalables y mantenibles."
    ),
    Libro(
        nombre = "Jetpack Compose",
        autor = "Thomas Künneth",
        categoria = "Desarrollo Móvil",
        descripcion = "Guía completa para construir interfaces declarativas modernas en Android con Compose."
    )
)

