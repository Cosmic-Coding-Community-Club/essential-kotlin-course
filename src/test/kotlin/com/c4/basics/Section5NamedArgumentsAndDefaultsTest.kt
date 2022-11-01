package com.c4.basics

import com.c4.basics.TestUtils.getFunction
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section5NamedArgumentsAndDefaultsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        Section5NamedArgumentsAndDefaults.task1()
        
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[0] as Int).isEqualTo(1982)
        val functionToCheck = getFunction(Section5NamedArgumentsAndDefaults::class, "task1")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(2)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(Int::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        Section5NamedArgumentsAndDefaults.task2()
        
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[0] as String).isEqualTo("the best year.")
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[1] as Float).isEqualTo(3.1416f)
        val functionToCheck = getFunction(Section5NamedArgumentsAndDefaults::class, "task2")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(3)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(String::class)
        assertThat(functionToCheck.parameters[2].type.classifier).isEqualTo(Float::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        Section5NamedArgumentsAndDefaults.task3()
        
        assertThat(Section5NamedArgumentsAndDefaults.argumentCapture[0] as Boolean).isEqualTo(true)
        val functionToCheck = getFunction(Section5NamedArgumentsAndDefaults::class, "task3")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(1)
    }
}