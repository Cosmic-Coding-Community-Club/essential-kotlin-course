package com.c4.basics

object Section5NamedArgumentsAndDefaults {
    private const val GIVEN_A_INT: Int = 1982
    private const val GIVEN_A_STRING: String = "the best year."
    private const val GIVEN_A_FLOAT: Float = 3.1416f
    private const val GIVEN_A_LONG: Long = 123456789L
    
    var argumentCapture: Array<Any> = arrayOf(-1, -1)
    
    // Define function that has an integer param with given default value and returns any value
    fun task1(aInt: Int = GIVEN_A_INT) {
        argumentCapture[0] = aInt
    }
    
    // Define function that has a String and a float param with given default values and returns any value
    fun task2(aString: String = GIVEN_A_STRING, afloat: Float = GIVEN_A_FLOAT) {
        argumentCapture[0] = aString
        argumentCapture[1] = afloat
    }
    
    // Call function "functionToCall" passing arguments in different order
    // and assign returned bool value to argumentCapture
    fun task3() {
        argumentCapture[0] = functionToCall(aLong = GIVEN_A_LONG, aString = GIVEN_A_STRING)
    }
    
    private fun functionToCall(aString: String, aLong: Long): Boolean {
        return true
    }
}