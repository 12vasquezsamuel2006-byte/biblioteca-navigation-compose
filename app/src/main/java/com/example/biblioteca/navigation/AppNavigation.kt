package com.example.biblioteca.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.biblioteca.ui.theme.home.HomeScreen
import com.example.biblioteca.ui.theme.home.BookListScreen
import com.example.biblioteca.ui.theme.home.BookDetailScreen
import com.example.biblioteca.ui.theme.home.ConfirmationScreen
import com.example.biblioteca.ui.theme.home.MyReservationsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Inicio
    ) {

        composable<Inicio> {
            HomeScreen(
                onVerLibrosClick = {
                    navController.navigate(ListaLibros)
                }
            )
        }

        composable<ListaLibros> {
            BookListScreen(
                onVerDetalleClick = { libro ->
                    navController.navigate(
                        DetalleLibro(
                            nombre = libro.nombre,
                            autor = libro.autor,
                            categoria = libro.categoria,
                            descripcion = libro.descripcion
                        )
                    )
                }
            )
        }

        composable<DetalleLibro> { backStackEntry ->
            val datos = backStackEntry.toRoute<DetalleLibro>()

            BookDetailScreen(
                nombre = datos.nombre,
                autor = datos.autor,
                categoria = datos.categoria,
                descripcion = datos.descripcion,
                onReservarClick = {
                    navController.navigate(
                        Confirmacion(
                            nombreLibro = datos.nombre,
                            fecha = "15/06/2026"
                        )
                    )
                }
            )
        }

        composable<Confirmacion> { backStackEntry ->
            val datos = backStackEntry.toRoute<Confirmacion>()

            ConfirmationScreen(
                nombreLibro = datos.nombreLibro,
                fecha = datos.fecha,
                onVolverInicioClick = {
                    navController.popBackStack(Inicio, inclusive = false)
                },
                onVerMisReservasClick = {
                    navController.navigate(MisReservas)
                }
            )
        }

        composable<MisReservas> {
            MyReservationsScreen(
                onVerReservaClick = { reserva ->
                    navController.navigate(
                        DetalleReserva(
                            nombreLibro = reserva.nombreLibro,
                            autor = reserva.autor,
                            fechaReserva = reserva.fechaReserva,
                            codigoReserva = reserva.codigoReserva,
                            estado = reserva.estado
                        )
                    )
                }
            )
        }
    }
}