package com.c4.essentials

import com.c4.essentials.Section09Exceptions.DEFAULT_STRING
import com.c4.essentials.Section09Exceptions.MESSAGE_USER_NOT_FOUND
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class Section09ExceptionsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThatThrownBy { Section09Exceptions.task1() }
            .isInstanceOf(RuntimeException::class.java)
            .hasMessage(MESSAGE_USER_NOT_FOUND)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThatThrownBy { Section09Exceptions.task2() }
            .isInstanceOf(NullPointerException::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section09Exceptions.task3())
            .isEqualTo(DEFAULT_STRING)
    }
}