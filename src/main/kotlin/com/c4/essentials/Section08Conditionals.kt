package com.c4.essentials

import com.c4.essentials.Section08Conditionals.PASTRY.CROISSANT
import com.c4.essentials.Section08Conditionals.PASTRY.DONUT
import com.c4.essentials.Section08Conditionals.PASTRY.MUFFIN

object Section08Conditionals {
    
    const val FLAVOR_VANILLA = "Flavor Vanilla"
    const val FLAVOR_CHOCOLATE = "Flavor Chocolate"
    const val FLAVOR_STRAWBERRY = "Flavor Strawberry"
    const val ADULT = "Adult"
    const val MINOR = "Minor"
    const val OLD = "old"
    
    // Define the behavior of function using "if" conditional:
    // If is a cake then return vanilla flavor else return chocolate flavor
    fun task1(isACake: Boolean) =
        if (isACake) {
            FLAVOR_VANILLA
        } else {
            FLAVOR_CHOCOLATE
        }
    
    // Define the behavior of function using "if" conditional:
    // If age is equal or greater than 18 then returns "adult" else returns "minor"
    fun task2(age: Int) =
        if (age >= 18) {
            ADULT
        } else {
            MINOR
        }
    
    // Define the behavior of function using "if" conditional:
    // If age is between than 18 and 65 inclusive then returns "adult"
    // else if age is greater than 65 then returns "old" else returns "minor"
    fun task3(age: Int) =
        if (age >= 18 && age <= 65) {
            ADULT
        } else if (age > 65) {
            OLD
        } else {
            MINOR
        }
    
    // Define the behavior of function using "if" conditional:
    // If pastry is croissant then return vanilla flavor
    // else if pastry is donut then return chocolate flavor
    // else if pastry is muffin then return strawberry flavor
    // else throw pastry not found exception
    fun task4(pastry: PASTRY) =
        if (pastry == CROISSANT) {
            FLAVOR_VANILLA
        } else if (pastry == DONUT) {
            FLAVOR_CHOCOLATE
        } else if (pastry == MUFFIN) {
            FLAVOR_STRAWBERRY
        } else {
            throw PastryNotFoundException()
        }
    
    // Define the behavior of function using "when" conditional:
    // If is a cake then return vanilla flavor else return chocolate flavor
    fun task5(isACake: Boolean) =
        when (isACake) {
            true -> FLAVOR_VANILLA
            false -> FLAVOR_CHOCOLATE
        }
    
    // Define the behavior of function using "when" conditional:
    // If age is equal or greater than 18 then returns "adult" else returns "minor"
    fun task6(age: Int) =
        when {
            age >= 18 -> ADULT
            else -> MINOR
        }
    
    // Define the behavior of function using "when" conditional:
    // If age is between than 18 and 65 inclusive then returns "adult"
    // else if age is greater than 65 then returns "old" else returns "minor"
    fun task7(age: Int) =
        when {
            age in 18..65 -> ADULT
            age > 65 -> OLD
            else -> MINOR
        }
    
    // Define the behavior of function using "when" conditional:
    // If pastry is croissant then return vanilla flavor
    // else if pastry is donut then return chocolate flavor
    // else if pastry is muffin then return strawberry flavor
    // else throw pastry not found exception
    fun task8(pastry: PASTRY) =
        when (pastry) {
            CROISSANT -> FLAVOR_VANILLA
            DONUT -> FLAVOR_CHOCOLATE
            MUFFIN -> FLAVOR_STRAWBERRY
            else -> throw PastryNotFoundException()
        }
    
    
    enum class PASTRY {
        CROISSANT, DONUT, MUFFIN, OTHER
    }
    
    class PastryNotFoundException : RuntimeException("Pastry not found")
}