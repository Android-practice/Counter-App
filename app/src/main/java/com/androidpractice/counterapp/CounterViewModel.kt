package com.androidpractice.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//ViewModel : help View(Screen) & Model(data) communicate
class CounterViewModel() : ViewModel() { // repository can be passed as a parameter
    private val _repository: CounterRepository = CounterRepository()
    private val _count = mutableStateOf(_repository.getCounter().count)

    //Expose the count(public) as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {//View model no longer directly change the variable
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrementCounter()
        _count.value = _repository.getCounter().count
    }
}