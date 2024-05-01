package com.djdcgcinco.laboratorio03.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.djdcgcinco.laboratorio03.model.ObjectClass

val objectList: MutableState<MutableList<ObjectClass>> = mutableStateOf(mutableListOf())