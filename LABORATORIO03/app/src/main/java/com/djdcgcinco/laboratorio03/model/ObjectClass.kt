package com.djdcgcinco.laboratorio03.model


data class ObjectClass(
    private var propertyOne: String,
    private var propertyTwo: String,
) /*TODO: Hace ruso de buenas praticas de POO para poder asignar o obtener valores de las properties a utilizar*/ {
    fun getPropertyOne():String{
        return propertyOne
    }
    fun getPropertyTwo():String{
        return propertyTwo
    }
}