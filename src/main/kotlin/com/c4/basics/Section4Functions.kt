package com.c4.basics

object Section4Functions {
    
    // Define function that has an integer param and returns a string
    fun task1(aInt: Int): String {
        return "This is a string example"
    }
    
    // Define function that has one string param and returns any value
    fun task2(aString: String) {
    }
    
    // Define function that has two short integer param and returns any value
    fun task3(aShort: Short, aOtherShort: Short) {
    }
    
    // Define function that has three param, one double, one string and one float and returns a long
    fun task4(aDouble: Double, aString: String, aFloat: Float): Long {
        return 2992L
    }
    
    // Define function that can have undefine number of params type of byte and returns an integer
    fun task5(vararg aByteParams: Byte): Int {
        return 2
    }
}