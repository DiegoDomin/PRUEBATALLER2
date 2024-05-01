package com.djdcgcinco.laboratorio03.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.djdcgcinco.laboratorio03.data.objectList
import com.djdcgcinco.laboratorio03.model.ObjectClass
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DataViewModel: ViewModel() {
    fun setData(myList: MutableList<ObjectClass>){
        viewModelScope.launch (Dispatchers.IO) {
            delay(1000)
            objectList.value = myList
        }
    }

    fun getData(): MutableList<ObjectClass>{
        return objectList.value
    }
}