package com.c4.basics

import com.c4.basics.Section11Classes.Bird.Color.GREEN
import com.c4.basics.Section11Classes.Bird.Color.RED
import com.c4.basics.creations.Cat
import com.c4.basics.creations.Dog
import com.c4.basics.creations.Owner

object Section11Classes {
    
    // Create inside "creations" package a new class named "Cat".
    // Return on this function an instance of this class.
    fun task1(): Any {
        return Cat()
    }
    
    // Create inside "creations" package a new class named "Dog".
    // Create a primary constructor for "Dog" class with the next parameter: name(String) and weight(Float) of dog
    // Return on this function an instance of this class.
    fun task2(): Any {
        return Dog("Roxie", 24.80f)
    }
    
    // Create inside "creations" package a new interface named "Feline".
    // Make that "Cat" class implement the new interface "Feline"
    // Return on this function an instance of "Cat"
    fun task3(): Any {
        return Cat()
    }
    
    // Create inside "creations" package a new interface named "Canine".
    // With abstract method named "doWoof" with zero parameters and returns nothing
    // Make that "Dog" class implement the new interface "Canine"
    // Return on this function an instance of "Dog"
    fun task4(): Any {
        return Dog("Bobby", 8.10f)
    }
    
    // Create inside "creations" package a new interface named "Animal".
    // Make that "Feline" interface inheritance from the new "Animal" interface.
    // Return on this function an instance of "Cat"
    fun task5(): Any {
        return Cat()
    }
    
    // Create inside "creations" package a new data class named "Owner"
    // with the next parameter: name(String), phone(Long) and address(String) of owner.
    // Return on this function an instance of this class.
    fun task6(): Any {
        return Owner("John Barington", 699123456, "street 3th, 4854, Hawking")
    }
    
    // Create inside "creations" package a new abstract class named "Person"
    // And also create abstract method named "talk" inside "Person" class.
    // Make that the "Owner" class inheritance from the new "person" class.
    // Return on this function an instance of this class.
    fun task7(): Any {
        return Owner("John Barington", 699123456, "street 3th, 4854, Hawking")
    }
    
    // Call "myBird" Function and copy result and replacing color value to GREEN
    // using data class methods
    fun task8(): Any {
        return myBird().copy(color = GREEN)
    }
    
    
    private fun myBird() = Bird("Talker", "Parrot", RED, 350.45f)
    
    data class Bird(
        val name: String,
        val specie: String,
        val color: Color,
        val weight: Float
    ) {
        enum class Color {
            RED, GREEN
        }
    }
}