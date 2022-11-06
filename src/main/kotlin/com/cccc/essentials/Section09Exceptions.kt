package com.cccc.essentials

object Section09Exceptions {
    
    const val MESSAGE_USER_NOT_FOUND = "User not found"
    const val DEFAULT_STRING = "This is a default String"
    
    
    // Define the behavior of method:
    // throw a Runtime Exception with message MESSAGE_USER_NOT_FOUND
    fun task1() {
        throw RuntimeException(MESSAGE_USER_NOT_FOUND)
    }
    
    // Define the behavior of method:
    // throw a Null Pointer Exception
    fun task2() {
        throw NullPointerException()
    }
    
    // Define the behavior of method:
    // avoid the Null Pointer Exception throw from "wrongFunction" and return DEFAULT_STRING
    fun task3(): String {
        return try {
            wrongFunction()
        } catch (nullPointerException: NullPointerException) {
            DEFAULT_STRING
        }
    }
    
    private fun wrongFunction(): String {
        throw NullPointerException()
    }
}