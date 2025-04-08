package com.androidpractice.counterapp

//Model
//this example is very simple so doenst require Model (View Model itself is enough)
//but try to show the Model Example
data class CounterModel(var count: Int)

/*
Repository :
- A design pattern that acts as a clean API(stands for Application Programming Interface for data access)
- A mediator between data sources (ex. remote Apis, local db, in-memory )
- to handle the data no matter where it came (data sources...)
 */
class CounterRepository { // all data logic managed in repository
    private var counter = CounterModel(0)

    //counter is private (hidden)
    fun getCounter() = counter

    fun incrementCounter() {
        counter.count++
    }

    fun decrementCounter() {
        counter.count--
    }
}
