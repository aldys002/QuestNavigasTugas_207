package com.example.navigasi

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Beranda,
    ListPeserta,
    FormPendaftaran
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Navigasi.Beranda.name) {
                Beranda(
                    onSubmitClick = {
                        navController.navigate(Navigasi.ListPeserta.name)
                    }
                )
            }
            composable(route = Navigasi.ListPeserta.name) {
                ListPeserta (
                    onBerandaClick = {
                        navController.navigate(Navigasi.Beranda.name)
                    },
                    onDaftarClick = {
                        navController.navigate(Navigasi.FormPendaftaran.name)
                    }
                )
            }
        }
    }
}