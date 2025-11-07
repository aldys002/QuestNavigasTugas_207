package com.example.navigasi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.navigasi.R


@Composable
fun ListPeserta(
    onBerandaClick : () ->,
    onDaftarClick : () ->
) {
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Aldys Igidia Triatmaja"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Perempuan"),
        Pair(first = stringResource(id = R.string.alamat), second = "Sleman, Yogyakarta")
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(id = listOf(R.string.list_peserta),
                        color = Color.White)
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(color = 0xFF00897B)
                )
            )
        }
    ) { innerPadding ->
        Column(modifier = Modifier
            .padding(paddingValues = innerPadding)
            .padding(all = dimensionResource(id = R.dimen.padding_medium)),
            verticalArrangement = Arrangement.SpaceBetween
        ) {  }
    }
}