package com.c4.essentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section01BasicDataTypesTest {

    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section01BasicDataTypes.task1() is Int).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section01BasicDataTypes.task2() is String).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section01BasicDataTypes.task3() is Char).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section01BasicDataTypes.task4() is Float).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section01BasicDataTypes.task5() is Double).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section01BasicDataTypes.task6() is Boolean).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        assertThat(Section01BasicDataTypes.task7()).isInstanceOf(Array<Char>::class.java)
    }
}