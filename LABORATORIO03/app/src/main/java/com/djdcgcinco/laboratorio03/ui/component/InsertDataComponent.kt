package com.djdcgcinco.laboratorio03.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.djdcgcinco.laboratorio03.model.ObjectClass
import com.djdcgcinco.laboratorio03.viewModel.DataViewModel

@Composable
fun InsertDataComponent(modifier: Modifier = Modifier) {
    val textFieldPropertyOne: MutableState<String> = remember { mutableStateOf("") }
    val textFieldPropertyTwo: MutableState<String> = remember { mutableStateOf("") }
    val viewModel = DataViewModel()
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {

        Text(modifier = Modifier.padding(bottom = 5.dp), text = "Inserta lo que quieras :D", fontFamily = FontFamily.Monospace, fontSize = 30.sp)

        TextField(modifier = Modifier.padding(bottom = 5.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            value = textFieldPropertyOne.value,
            onValueChange = { textFieldPropertyOne.value = it },
            placeholder = {
                Text(text = "Inserta cualquier cosa 1",
                    fontFamily = FontFamily.Cursive)
            },
            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Black,
                disabledTextColor = Color.Black,
                errorTextColor = Color.Black,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.Black,
                errorContainerColor = Color.Red,
                cursorColor = Color.Black,
                errorCursorColor = Color.Black,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.Black,
                disabledIndicatorColor = Color.Black,
                errorIndicatorColor = Color.Black,
                focusedLeadingIconColor = Color.Black,
                unfocusedLeadingIconColor = Color.Black,
                disabledLeadingIconColor = Color.Black,
                errorLeadingIconColor = Color.Black,
                focusedTrailingIconColor = Color.Black,
                unfocusedTrailingIconColor = Color.Black,
                disabledTrailingIconColor = Color.Black,
                errorTrailingIconColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                disabledLabelColor = Color.Black,
                errorLabelColor = Color.Black,
                focusedPlaceholderColor = Color.Black,
                unfocusedPlaceholderColor = Color.Black,
                disabledPlaceholderColor = Color.Black,
                errorPlaceholderColor = Color.Black,
                focusedSupportingTextColor = Color.Black,
                unfocusedSupportingTextColor = Color.White,//color de texto del textfield
                disabledSupportingTextColor = Color.Black,
                errorSupportingTextColor = Color.Black,
                focusedPrefixColor = Color.Black,
                unfocusedPrefixColor = Color.White,
                disabledPrefixColor = Color.Black,
                errorPrefixColor = Color.Black,
                focusedSuffixColor = Color.Black,
                unfocusedSuffixColor = Color.White,
                disabledSuffixColor = Color.Black,
                errorSuffixColor = Color.Black
            )








        )

        TextField(modifier = Modifier.padding(bottom = 5.dp), singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            value = textFieldPropertyTwo.value,
            onValueChange = { textFieldPropertyTwo.value = it },
            placeholder = {
                Text(text = "Inserta cualquier cosa 2",
                    fontFamily = FontFamily.Cursive)
            },

            colors = TextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Black,
                disabledTextColor = Color.Black,
                errorTextColor = Color.Black,
                focusedContainerColor = Color.Black,
                unfocusedContainerColor = Color.White,//color Textfield
                disabledContainerColor = Color.Black,
                errorContainerColor = Color.Red,
                cursorColor = Color.Black,
                errorCursorColor = Color.Black,
                focusedIndicatorColor = Color.Black,
                unfocusedIndicatorColor = Color.Black,
                disabledIndicatorColor = Color.Black,
                errorIndicatorColor = Color.Black,
                focusedLeadingIconColor = Color.Black,
                unfocusedLeadingIconColor = Color.Black,
                disabledLeadingIconColor = Color.Black,
                errorLeadingIconColor = Color.Black,
                focusedTrailingIconColor = Color.Black,
                unfocusedTrailingIconColor = Color.Black,
                disabledTrailingIconColor = Color.Black,
                errorTrailingIconColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                disabledLabelColor = Color.Black,
                errorLabelColor = Color.Black,
                focusedPlaceholderColor = Color.Black,
                unfocusedPlaceholderColor = Color.Black,//color de texto del textfield
                disabledPlaceholderColor = Color.Black,
                errorPlaceholderColor = Color.Black,
                focusedSupportingTextColor = Color.Black,
                unfocusedSupportingTextColor = Color.White,
                disabledSupportingTextColor = Color.Black,
                errorSupportingTextColor = Color.Black,
                focusedPrefixColor = Color.Black,
                unfocusedPrefixColor = Color.White,
                disabledPrefixColor = Color.Black,
                errorPrefixColor = Color.Black,
                focusedSuffixColor = Color.Black,
                unfocusedSuffixColor = Color.White,
                disabledSuffixColor = Color.Black,
                errorSuffixColor = Color.Black
            )

        )

        Button(modifier = Modifier.padding(bottom = 5.dp), onClick = { /*TODO*/
            val myList: MutableList<ObjectClass> = mutableListOf(
                ObjectClass(textFieldPropertyOne.value, textFieldPropertyTwo.value)
            )
            viewModel.setData(myList)

        }
            ,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.LightGray,
            )
        ) {
            Text(text = "¡Clickea aqui para mandar datos y ganar un Iphone!",
                fontFamily = FontFamily.Monospace,

                )
        }
    }
}

@Preview(showSystemUi = false)
@Composable
private fun InsertDataComponentPreview() {
    InsertDataComponent(modifier = Modifier)
}