package com.example.latihanmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _number = MutableLiveData<Int>()
    val number: LiveData<Int> get() = _number

    init {
        _number.value = 0
    }

    fun increment() {
        _number.value = (_number.value ?: 0) + 1
    }

    fun decrement() {
        _number.value = (_number.value ?: 0) - 1
    }
}