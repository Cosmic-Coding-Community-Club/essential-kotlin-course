package com.c4.essentials

object Section04Collections {
    
    // Return in this function a list of Int
    // with values 45, 15, 74 ,80
    fun task1() = listOf(45, 15, 74, 80)
    
    // Return in this function a list of String
    // with values "chair", "table", "lamp", "bed"
    fun task2() = listOf("chair", "table", "lamp", "bed")
    
    // Return in this function a mutable list of Int
    // with values 45, 15, 74 ,80
    fun task3() = mutableListOf(45, 15, 74, 80)
    
    // Return in this function a map
    // with keys-values (Int - String) 1 -> "John", 2 -> "Daniel", 3 -> "Mathew", 4 -> "Madison"
    fun task4() = mapOf(1 to "John", 2 to "Daniel", 3 to "Mathew", 4 to "Madison")
    
    // Return in this function a mutable map
    // with keys-values (Int - String) 1 -> "John", 2 -> "Daniel", 3 -> "Mathew", 4 -> "Madison"
    fun task5() = mutableMapOf(1 to "John", 2 to "Daniel", 3 to "Mathew", 4 to "Madison")
    
    // Return in this function a set
    // with keys-values (Int - String) 1 -> "John", 2 -> "Daniel", 3 -> "Mathew", 4 -> "Madison"
    fun task6() = setOf(1 to "John", 2 to "Daniel", 3 to "Mathew", 4 to "Madison")
    
    // Return in this function a mutable set
    // with keys-values (Int - String) 1 -> "John", 2 -> "Daniel", 3 -> "Mathew", 4 -> "Madison"
    fun task7() = mutableSetOf(1 to "John", 2 to "Daniel", 3 to "Mathew", 4 to "Madison")
}