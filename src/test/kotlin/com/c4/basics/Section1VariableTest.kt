package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section1VariableTest {

    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section1Variable.task1() is Int).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section1Variable.task2() is String).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section1Variable.task3() is Char).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section1Variable.task4() is Float).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section1Variable.task5() is Double).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section1Variable.task6() is Boolean).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        assertThat(Section1Variable.task7()).isInstanceOf(Array<Char>::class.java)
    }
}