package com.c4.basics

object Section7Loops {
    
    private val pets: List<String> =
        listOf("Buddy", "Max", "Rosie", "Poppy", "Milo")
    private val users: Map<Int, String> =
        mapOf(10001 to "John", 10002 to "Daniel", 10003 to "Charles", 10004 to "Bella")
    private val vehicles: List<String> =
        listOf("Car", "Bicycle", "Bus", "Truck", "Motorcycle", "Van")
    private val colors: List<String> =
        listOf("Red", "Black", "White")
    
    
    // Define the behavior of method using "for" loop:
    // print in console the pet list with the next style
    // ie:
    //      Pet: Buddy
    //      Pet: Max ...
    fun task1() {
        for (pet in pets) {
            println("Pet: $pet")
        }
    }
    
    // Define the behavior of method using "for" loop and old school count variable:
    // print in console the pet list with the next style
    //      1- Buddy
    //      2- Max ...
    fun task2() {
        var count = 1
        for (pet in pets) {
            println("$count- $pet")
            count++
        }
    }
    
    // Define the behavior of method using "for" loop and "withIndex" operator of list:
    // print in console the pet list with the next style
    //      1- Buddy
    //      2- Max ...
    fun task3() {
        for ((index, pet) in pets.withIndex()) {
            println("${index + 1}- $pet")
        }
    }
    
    // Define the behavior of method using "for" loop:
    // print in console the users map with the next style:
    //      Id[10001] -> Name[John]
    //      Id[10002] -> Name[Daniel] ...
    fun task4() {
        for ((key, value) in users) {
            println("Id[$key] -> name[$value]")
        }
    }
    
    // Define the behavior of method using "for" loop and a range of 1 to 9:
    // print in console the literal: 123456789
    fun task5() {
        for (num in 1..9) {
            print(num)
        }
    }
    
    // Define the behavior of method using "for" loop and a range of 1 to 9:
    // print in console the literal: 12345678
    fun task6() {
        for (num in 1 until 9) {
            print(num)
        }
    }
    
    // Define the behavior of method using "for" loop and a range of 1 to 9:
    // print in console the literal: 13579
    fun task7() {
        for (num in 1..9 step 2) {
            print(num)
        }
    }
    
    // Define the behavior of method using "for" loop and a range of 1 to 9:
    // print in console the literal: 963
    fun task8() {
        for (num in 9 downTo 1 step 3) {
            print(num)
        }
    }
    
    // Define the behavior of method using "for" loops:
    // print in console all combination of colors and vehicles (respecting order of lists) with the next style
    //      Red-Car
    //      Red-Bicycle ...
    fun task9() {
        for (color in colors) {
            for (vehicle in vehicles) {
                println("$color-$vehicle")
            }
        }
    }
    
    // Define the behavior of method using "while" loop:
    // print in console the pet list with the next style
    //      Pet: Buddy
    //      Pet: Max ...
    fun task10() {
        var index = 0
        while (index < pets.size) {
            println("Pet: ${pets[index]}")
            index++
        }
    }
    
    // Define the behavior of method using "do..while" loop:
    // print in console the pet list with the next style
    //      Pet: Buddy
    //      Pet: Max ...
    fun task11() {
        var index = 0
        do {
            println("Pet: ${pets[index]}")
            index++
        } while (index < pets.size)
    }
}