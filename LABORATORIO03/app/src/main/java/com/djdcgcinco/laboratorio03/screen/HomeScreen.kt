package com.djdcgcinco.laboratorio03.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.djdcgcinco.laboratorio03.ui.component.InsertDataComponent
import com.djdcgcinco.laboratorio03.ui.component.ObjectListComponent

@Composable
fun HomeScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        InsertDataComponent(modifier = Modifier.weight(2.5f),

            )
        ObjectListComponent(modifier = Modifier.weight(5.5f))
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}