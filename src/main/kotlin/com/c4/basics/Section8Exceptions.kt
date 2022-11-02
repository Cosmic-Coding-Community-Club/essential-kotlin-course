package com.c4.basics

object Section8Exceptions {
    
    const val MESSAGE_USER_NOT_FOUND = "User not found"
    const val DEFAULT_STRING = "This is a default String"
    
    
    // Define the behavior of method:
    // throw a Runtime Exception with message MESSAGE_USER_NOT_FOUND
    fun task1() {
    }
    
    // Define the behavior of method:
    // throw a Null Pointer Exception
    fun task2() {
    }
    
    // Define the behavior of method:
    // avoid the Null Pointer Exception throw from "wrongFunction" and return DEFAULT_STRING
    fun task3(): String = wrongFunction()
    
    private fun wrongFunction(): String {
        throw NullPointerException()
    }
}