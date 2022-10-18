package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VariableTest {

    @Test
    internal fun shouldCheckVariables() {
        assertThat(Variable.task1() is Int).isTrue
        assertThat(Variable.task2() is String).isTrue
        assertThat(Variable.task3() is Char).isTrue
        assertThat(Variable.task4() is Float).isTrue
        assertThat(Variable.task5() is Double).isTrue
        assertThat(Variable.task6() is Boolean).isTrue
        assertThat(Variable.task7()).isInstanceOf(Array<Char>::class.java)
    }
}