package com.c4.basics

import com.c4.basics.Section06NamedArgumentsAndDefaults.GIVEN_A_FLOAT
import com.c4.basics.Section06NamedArgumentsAndDefaults.GIVEN_A_INT
import com.c4.basics.Section06NamedArgumentsAndDefaults.GIVEN_A_STRING
import com.c4.tooling.TestUtils.getFunction
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section06NamedArgumentsAndDefaultsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        Section06NamedArgumentsAndDefaults.task1()
        
        assertThat(Section06NamedArgumentsAndDefaults.argumentCapture[0] as Int).isEqualTo(GIVEN_A_INT)
        val functionToCheck = getFunction(Section06NamedArgumentsAndDefaults::class, "task1")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(2)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(Int::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        Section06NamedArgumentsAndDefaults.task2()
        
        assertThat(Section06NamedArgumentsAndDefaults.argumentCapture[0] as String).isEqualTo(GIVEN_A_STRING)
        assertThat(Section06NamedArgumentsAndDefaults.argumentCapture[1] as Float).isEqualTo(GIVEN_A_FLOAT)
        val functionToCheck = getFunction(Section06NamedArgumentsAndDefaults::class, "task2")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(3)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(String::class)
        assertThat(functionToCheck.parameters[2].type.classifier).isEqualTo(Float::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        Section06NamedArgumentsAndDefaults.task3()
        
        assertThat(Section06NamedArgumentsAndDefaults.argumentCapture[0] as Boolean).isEqualTo(true)
        val functionToCheck = getFunction(Section06NamedArgumentsAndDefaults::class, "task3")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(1)
    }
}