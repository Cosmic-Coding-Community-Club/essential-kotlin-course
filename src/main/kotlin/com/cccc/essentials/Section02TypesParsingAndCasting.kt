package com.cccc.essentials

object Section02TypesParsingAndCasting {
    
    // Return integer numeric variable from string
    fun task1(): Any {
        return "25".toInt()
    }
    
    // Return string variable from integer
    fun task2(): Any {
        val year = 1982
        return year.toString()
    }
    
    // Return float variable from char
    fun task3(): Any {
        return '9'.code.toChar()
    }
    
    // Return integer variable and check type with smart and safe cast
    fun task4(): Any {
        val myYear: Any = "1982"
        
        return if (myYear is String) {
            myYear.toInt()
        } else {
            throw RuntimeException("Wrong type")
        }
    }
    
    // Return double variable and check type with smart and SAFE cast
    fun task5(): Any {
        val myWeight: Any = 74.5
        
        return if (myWeight is Double) {
            myWeight.toDouble()
        } else {
            throw RuntimeException("Wrong type")
        }
    }
    
    // Return boolean variable and check type with UNSAFE cast
    fun task6(): Any {
        val isMySister: Any = "true"
        
        return (isMySister as String).toBoolean()
    }
}