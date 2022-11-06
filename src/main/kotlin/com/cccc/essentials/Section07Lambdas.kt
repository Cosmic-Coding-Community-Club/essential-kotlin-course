package com.cccc.essentials

object Section07Lambdas {
    
    // Return a lambda function with empty parameters and returns an Int
    fun task1(): () -> Int = { 1895 }
    
    // Return a lambda function with String and Float parameters and returns an Double
    fun task2(): (String, Float) -> Double = { aString, aFloat -> 12.1211 }
    
    // Return a lambda function with Long parameter and not returns any data
    fun task3(): (Long) -> Unit = { along -> println("$along is a long.") }
    
    // Return a lambda function with Long and two Int parameters and returns a Boolean
    fun task4(): (Long, Int, Int) -> Boolean = { along, anInt1, anInt2 -> true }
    
    // Return a lambda function with empty parameters and not returns any data
    fun task5(): () -> Unit = { println("This is a lambda function.") }
}