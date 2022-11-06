package com.cccc.essentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section02TypesParsingAndCastingTest {

    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section02TypesParsingAndCasting.task1() is Int).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section02TypesParsingAndCasting.task2() is String).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section02TypesParsingAndCasting.task3() is Char).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section02TypesParsingAndCasting.task4() is Int).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section02TypesParsingAndCasting.task5() is Double).isTrue
    }

    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section02TypesParsingAndCasting.task6() is Boolean).isTrue
    }
}