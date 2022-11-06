package com.c4.essentials

import java.util.Random

object Section03NullableTypes {
    
    const val THE_BEST_PHRASE: String = "Coding and keep calm."
    const val USE_THIS_VALUE_TO_DEFAULT_PHRASE: String = "This is a default phrase"
    const val USE_THIS_VALUE_TO_DEFAULT_LENGTH: Int = 0

    // Return the best phrase or default phrase.
    // Use elvis operator [?:] to check nullability
    fun task1(): Any {
        val phrase = randomPhrase()

        return Any()
    }
    
    // Return the best phrase length or default phrase length
    // Use operator "safe calls" [?.] and elvis operator [?:] to check nullability
    fun task2(): Any {
        val phrase = randomPhrase()

        return Any()
    }

    // Return the best phrase in lowercase or default phrase in lowercase
    // Use operator "safe calls" [?.] and elvis operator [?:] to check nullability
    fun task3(): Any {
        val phrase = randomPhrase()

        return Any()
    }

    private fun randomPhrase(): String? {
        return if (Random().nextBoolean()) {
            null
        } else {
            THE_BEST_PHRASE
        }
    }
}