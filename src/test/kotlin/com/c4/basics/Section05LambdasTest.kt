package com.c4.basics

import com.c4.tooling.TestUtils.getFunction
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section05LambdasTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        val functionToCheck = getFunction(Section05Lambdas::class, "task1")
        
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Function0::class)
        assertThat(functionToCheck.returnType.arguments).hasSize(1)
        assertThat(functionToCheck.returnType.arguments[0].type?.classifier).isEqualTo(Int::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        val functionToCheck = getFunction(Section05Lambdas::class, "task2")
        
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Function2::class)
        assertThat(functionToCheck.returnType.arguments).hasSize(3)
        assertThat(functionToCheck.returnType.arguments[0].type?.classifier).isEqualTo(String::class)
        assertThat(functionToCheck.returnType.arguments[1].type?.classifier).isEqualTo(Float::class)
        assertThat(functionToCheck.returnType.arguments[2].type?.classifier).isEqualTo(Double::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        val functionToCheck = getFunction(Section05Lambdas::class, "task3")
        
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Function1::class)
        assertThat(functionToCheck.returnType.arguments).hasSize(2)
        assertThat(functionToCheck.returnType.arguments[0].type?.classifier).isEqualTo(Long::class)
        assertThat(functionToCheck.returnType.arguments[1].type?.classifier).isEqualTo(Unit::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        val functionToCheck = getFunction(Section05Lambdas::class, "task4")
        
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Function3::class)
        assertThat(functionToCheck.returnType.arguments).hasSize(4)
        assertThat(functionToCheck.returnType.arguments[0].type?.classifier).isEqualTo(Long::class)
        assertThat(functionToCheck.returnType.arguments[1].type?.classifier).isEqualTo(Int::class)
        assertThat(functionToCheck.returnType.arguments[2].type?.classifier).isEqualTo(Int::class)
        assertThat(functionToCheck.returnType.arguments[3].type?.classifier).isEqualTo(Boolean::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        val functionToCheck = getFunction(Section05Lambdas::class, "task5")
        
        assertThat(functionToCheck.returnType.classifier).isEqualTo(Function0::class)
        assertThat(functionToCheck.returnType.arguments).hasSize(1)
        assertThat(functionToCheck.returnType.arguments[0].type?.classifier).isEqualTo(Unit::class)
    }
}