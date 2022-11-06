package com.c4.essentials

import com.c4.tooling.TestUtils.getFunction
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section05FunctionsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        val functionToCheck = getFunction(Section05Functions::class, "task1")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(String::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(2)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(Int::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        val functionToCheck = getFunction(Section05Functions::class, "task2")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(2)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(String::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        val functionToCheck = getFunction(Section05Functions::class, "task3")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Unit::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(3)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(Short::class)
        assertThat(functionToCheck.parameters[2].type.classifier).isEqualTo(Short::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        val functionToCheck = getFunction(Section05Functions::class, "task4")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Long::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(4)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(Double::class)
        assertThat(functionToCheck.parameters[2].type.classifier).isEqualTo(String::class)
        assertThat(functionToCheck.parameters[3].type.classifier).isEqualTo(Float::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        val functionToCheck = getFunction(Section05Functions::class, "task5")
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Int::class)
        assertThat(functionToCheck.parameters.size).isEqualTo(2)
        assertThat(functionToCheck.parameters[1].type.classifier).isEqualTo(ByteArray::class)
    }
}