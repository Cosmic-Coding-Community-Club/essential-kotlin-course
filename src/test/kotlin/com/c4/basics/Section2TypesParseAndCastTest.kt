package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section2TypesParseAndCastTest {

    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section2TypesParseAndCasts.task1() is Int).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section2TypesParseAndCasts.task2() is String).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section2TypesParseAndCasts.task3() is Char).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section2TypesParseAndCasts.task4() is Int).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section2TypesParseAndCasts.task5() is Double).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section2TypesParseAndCasts.task6() is Boolean).isTrue
    }
}