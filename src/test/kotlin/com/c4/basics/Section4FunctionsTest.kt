package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section4FunctionsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section4Functions::class.java.methods[0].returnType)
            .isEqualTo(String::class.java)
        assertThat(Section4Functions::class.java.methods[0].parameterCount)
            .isEqualTo(1)
        assertThat(Section4Functions::class.java.methods[0].parameters[0].type)
            .isEqualTo(Int::class.java)
        
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section4Functions::class.java.methods[1].returnType)
            .isEqualTo(Void.TYPE)
        assertThat(Section4Functions::class.java.methods[1].parameterCount)
            .isEqualTo(1)
        assertThat(Section4Functions::class.java.methods[1].parameters[0].type)
            .isEqualTo(String::class.java)
        
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section4Functions::class.java.methods[2].returnType)
            .isEqualTo(Void.TYPE)
        assertThat(Section4Functions::class.java.methods[2].parameterCount)
            .isEqualTo(2)
        assertThat(Section4Functions::class.java.methods[2].parameters[0].type)
            .isEqualTo(Short::class.java)
        assertThat(Section4Functions::class.java.methods[2].parameters[1].type)
            .isEqualTo(Short::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section4Functions::class.java.methods[3].returnType)
            .isEqualTo(Long::class.java)
        assertThat(Section4Functions::class.java.methods[3].parameterCount)
            .isEqualTo(3)
        assertThat(Section4Functions::class.java.methods[3].parameters[0].type)
            .isEqualTo(Double::class.java)
        assertThat(Section4Functions::class.java.methods[3].parameters[1].type)
            .isEqualTo(String::class.java)
        assertThat(Section4Functions::class.java.methods[3].parameters[2].type)
            .isEqualTo(Float::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section4Functions::class.java.methods[4].returnType)
            .isEqualTo(Int::class.java)
        assertThat(Section4Functions::class.java.methods[4].parameterCount)
            .isEqualTo(1)
        assertThat(Section4Functions::class.java.methods[4].parameters[0].type)
            .isEqualTo(ByteArray::class.java)
    }
}