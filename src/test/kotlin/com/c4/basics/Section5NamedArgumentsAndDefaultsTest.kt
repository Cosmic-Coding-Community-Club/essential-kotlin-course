package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section5NamedArgumentsAndDefaultsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        Section5NamedArgumentsAndDefaults.task1()
        
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[0] as Int).isEqualTo(1982)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[0].returnType)
            .isEqualTo(Void.TYPE)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[0].parameterCount)
            .isEqualTo(1)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[0].parameters[0].type)
            .isEqualTo(Int::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        Section5NamedArgumentsAndDefaults.task2()
        
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[0] as String).isEqualTo("the best year.")
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[1] as Float).isEqualTo(3.1416f)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[1].returnType)
            .isEqualTo(Void.TYPE)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[1].parameterCount)
            .isEqualTo(2)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[1].parameters[0].type)
            .isEqualTo(String()::class.java)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[1].parameters[1].type)
            .isEqualTo(Float::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        Section5NamedArgumentsAndDefaults.task3()
        
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[0] as Boolean).isEqualTo(true)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[2].returnType)
            .isEqualTo(Void.TYPE)
        assertThat(Section5NamedArgumentsAndDefaults::class.java.methods[2].parameterCount)
            .isEqualTo(0)
       
    }
}