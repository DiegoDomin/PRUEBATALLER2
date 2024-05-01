package com.djdcgcinco.laboratorio03.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.djdcgcinco.laboratorio03.model.ObjectClass
import com.djdcgcinco.laboratorio03.viewModel.DataViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@Composable
fun ObjectListComponent(modifier: Modifier = Modifier) {

    val data: MutableState<MutableList<ObjectClass>> = remember { mutableStateOf(mutableListOf()) }
    val viewModel = DataViewModel()
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            GlobalScope.launch(Dispatchers.IO) {
                Thread.sleep(1000)
                data.value = viewModel.getData()
            }
        },

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                contentColor = Color.Black,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray,

                ),

            )





        {
            Text(text = "Los datos esta a 10km de ti, clickea aqui para traer los datos",fontFamily = FontFamily.Monospace)
        }


        LazyColumn(
            modifier = Modifier
                .weight(9f)
                .fillMaxWidth()
                .padding(top = 8.dp, start = 8.dp, end = 8.dp)
        ) {
            itemsIndexed(data.value){index, item ->
                Text(text = item.getPropertyOne())
                Text(text = item.getPropertyTwo())
            }
            /*TODO: Desplegar la lista que se encuentra en DummyData, haciendo uso de lo antes estudiado en Kotlin
            *  Ademas, cada objeto tiene que ser mapeado de manera especifica con los atirbutos que se especifican y un icono representativo*/
        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun ObjectListComponentPreview() {
    ObjectListComponent()
}