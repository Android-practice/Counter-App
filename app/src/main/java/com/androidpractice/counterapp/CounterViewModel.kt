package com.androidpractice.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//ViewModel : help View(Screen) & Model(data) communicate
class CounterViewModel : ViewModel() {

    //Model
    //private variable is not expose to the outside
    private val _count = mutableStateOf(0) //private variable name에는 _붙이는 것이 custom

    //ViewModel
    //Expose the count(public) as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}