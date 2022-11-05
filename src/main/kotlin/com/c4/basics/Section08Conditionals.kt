package com.c4.basics

<<<<<<< HEAD:src/main/kotlin/com/c4/basics/Section07Conditionals.kt
object Section07Conditionals {
=======
import com.c4.basics.Section08Conditionals.PASTRY.CROISSANT
import com.c4.basics.Section08Conditionals.PASTRY.DONUT
import com.c4.basics.Section08Conditionals.PASTRY.MUFFIN

object Section08Conditionals {
>>>>>>> 744b1a4 (add section 5 collections exercises and refactor order of rest sections):src/main/kotlin/com/c4/basics/Section08Conditionals.kt
    
    const val FLAVOR_VANILLA = "Flavor Vanilla"
    const val FLAVOR_CHOCOLATE = "Flavor Chocolate"
    const val FLAVOR_STRAWBERRY = "Flavor Strawberry"
    const val ADULT = "Adult"
    const val MINOR = "Minor"
    const val OLD = "old"
    
    // Define the behavior of function using "if" conditional:
    // If is a cake then return vanilla flavor else return chocolate flavor
    fun task1(isACake: Boolean) = "Unknown"
    
    // Define the behavior of function using "if" conditional:
    // If age is equal or greater than 18 then returns "adult" else returns "minor"
    fun task2(age: Int) = "Unknown"
    
    // Define the behavior of function using "if" conditional:
    // If age is between than 18 and 65 inclusive then returns "adult"
    // else if age is greater than 65 then returns "old" else returns "minor"
    fun task3(age: Int) = "Unknown"
    
    // Define the behavior of function using "if" conditional:
    // If pastry is croissant then return vanilla flavor
    // else if pastry is donut then return chocolate flavor
    // else if pastry is muffin then return strawberry flavor
    // else throw pastry not found exception
    fun task4(pastry: PASTRY) = "Unknown"
    
    // Define the behavior of function using "when" conditional:
    // If is a cake then return vanilla flavor else return chocolate flavor
    fun task5(isACake: Boolean) = "Unknown"
    
    // Define the behavior of function using "when" conditional:
    // If age is equal or greater than 18 then returns "adult" else returns "minor"
    fun task6(age: Int) = "Unknown"
    
    // Define the behavior of function using "when" conditional:
    // If age is between than 18 and 65 inclusive then returns "adult"
    // else if age is greater than 65 then returns "old" else returns "minor"
    fun task7(age: Int) = "Unknown"
    
    // Define the behavior of function using "when" conditional:
    // If pastry is croissant then return vanilla flavor
    // else if pastry is donut then return chocolate flavor
    // else if pastry is muffin then return strawberry flavor
    // else throw pastry not found exception
    fun task8(pastry: PASTRY) = "Unknown"
    
    
    enum class PASTRY {
        CROISSANT, DONUT, MUFFIN, OTHER
    }
    
    class PastryNotFoundException : RuntimeException("Pastry not found")
}