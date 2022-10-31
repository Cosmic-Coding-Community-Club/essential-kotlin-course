package com.c4.basics

object Section5NamedArgumentsAndDefaults {
    private const val GIVEN_A_INT: Int = 1982
    private const val GIVEN_A_STRING: String = "the best year."
    private const val GIVEN_A_FLOAT: Float = 3.1416f
    private const val GIVEN_A_LONG: Long = 123456789L
    
    var argumentCapture: Array<Any> = arrayOf(-1, -1)
    
    // Define function that has an integer param with given default value and returns any value
    fun task1() {
        argumentCapture[0] = -1
    }
    
    // Define function that has a String and a float param with given default values and returns any value
    fun task2() {
        argumentCapture[0] = -1
        argumentCapture[1] = -1
    }
    
    // Call function "functionToCall" passing arguments in different order
    // and assign returned bool value to argumentCapture
    fun task3() {
        argumentCapture[0] = -1
    }
    
    private fun functionToCall(aString: String, aLong: Long): Boolean {
        return true
    }
}