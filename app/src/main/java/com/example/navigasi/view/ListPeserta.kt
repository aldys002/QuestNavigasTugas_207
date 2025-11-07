@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.navigasi.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
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
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(
                    space = dimensionResource(id = R.dimen.padding_small)
                )
            ) {
                items.forEach { item ->
                    Column {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 22.sp
                        )
                    }
                    HorizontalDivider(
                        thickness = dimensionResource(id = R.dimen.thickness_divider)
                        color = Color.Cyan
                    )
                }
            }
        }
    }
}