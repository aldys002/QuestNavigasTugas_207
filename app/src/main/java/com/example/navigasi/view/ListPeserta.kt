package com.example.navigasi.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
}