# Biblioteca — Práctica de Navigation Compose

Aplicación Android desarrollada en Kotlin con Jetpack Compose como práctica de **Navigation Compose**: navegación entre pantallas, envío de parámetros y recepción de argumentos.

Proyecto académico — ADSO, SENA.

---

## ¿Qué hace la app?

La app simula el sistema de una biblioteca con dos flujos conectados.

**Flujo 1 — Reservar un libro**

Inicio → Lista de Libros → Detalle del Libro → Confirmación de Reserva

El usuario ve un catálogo de libros, elige uno, consulta sus datos completos y confirma la reserva.

**Flujo 2 — Gestionar reservas**

Mis Reservas → Detalle de Reserva → Renovar Reserva → Renovación Exitosa

El usuario consulta sus reservas activas, revisa el detalle de una y puede renovarla ingresando una fecha nueva, o cancelarla.

---

## Conceptos practicados

- Navigation Compose con **rutas tipadas** (`@Serializable`)
- `NavHost` y `NavController`
- Envío de parámetros entre pantallas con `navigate()`
- Recepción de argumentos con `toRoute()`
- Botones de regreso con `popBackStack()`
- Manejo de estado con `remember { mutableStateOf() }`
- State hoisting: las pantallas reciben funciones (`() -> Unit`) en lugar del `NavController`

---

## Estructura del proyecto

```
com.example.biblioteca
├── model/
│   ├── Libro.kt                  Modelo de libro + lista de datos
│   └── Reserva.kt                Modelo de reserva + lista de datos
├── navigation/
│   ├── Routes.kt                 Rutas tipadas de los 8 destinos
│   └── AppNavigation.kt          NavHost con todos los composables
├── ui/theme/
│   ├── Color.kt                  Paleta de colores de la app
│   ├── Theme.kt                  Esquema de colores Material 3
│   ├── Type.kt
│   └── home/
│       ├── HomeScreen.kt                 Pantalla de bienvenida
│       ├── BookListScreen.kt             Catálogo de libros
│       ├── BookDetailScreen.kt           Detalle de un libro
│       ├── ConfirmationScreen.kt         Reserva exitosa
│       ├── MyReservationsScreen.kt       Reservas activas
│       ├── ReservationDetailScreen.kt    Detalle de una reserva
│       ├── RenewReservationScreen.kt     Formulario de renovación
│       └── RenewSuccessScreen.kt         Renovación exitosa
└── MainActivity.kt
```

**Por qué esta organización:** `navigation` guarda todo lo que decide a dónde se mueve la app, `model` los datos, y `ui/theme/home` las pantallas. Así un cambio en el flujo no obliga a tocar las pantallas, y al revés.

---

## Tecnologías

| Tecnología | Uso |
|---|---|
| Kotlin | Lenguaje |
| Jetpack Compose | Interfaz declarativa |
| Navigation Compose 2.10.2 | Navegación entre pantallas |
| Kotlinx Serialization 1.6.3 | Rutas tipadas y paso de parámetros |
| Material 3 | Componentes y sistema de color |

---

## Estructura de ramas

El proyecto se desarrolló con flujo de ramas, sin trabajar todo directamente sobre `main`:

```
main                      Versión estable
 └─ develop               Rama de integración
     ├─ feature/mis-reservas    Flujo 2 completo
     └─ feature/diseno-ui       Paleta de colores y diseño de las 8 pantallas
```

Cada feature se desarrolló en su propia rama, se fusionó a `develop` y de ahí a `main`.

---

## Cómo ejecutarlo

1. Clonar el repositorio
2. Abrirlo en Android Studio
3. Esperar la sincronización de Gradle
4. Ejecutar en un emulador o dispositivo (API 24 o superior)

---

## Notas

Los datos de libros y reservas están definidos en código (`listaDeLibros` y `listaDeReservas`) porque el objetivo de la práctica es la navegación, no la persistencia. En una versión posterior se podría conectar una base de datos local con Room.

---

**Autor:** Samuel Vásquez
