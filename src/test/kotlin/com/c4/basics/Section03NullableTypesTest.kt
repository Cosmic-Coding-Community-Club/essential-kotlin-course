package com.c4.basics

import com.c4.basics.Section03NullableTypes.THE_BEST_PHRASE
import com.c4.basics.Section03NullableTypes.USE_THIS_VALUE_TO_DEFAULT_LENGTH
import com.c4.basics.Section03NullableTypes.USE_THIS_VALUE_TO_DEFAULT_PHRASE
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section03NullableTypesTest {

    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section03NullableTypes.task1() is String).isTrue
        assertThat(Section03NullableTypes.task1()).isNotNull
        assertThat(Section03NullableTypes.task1()).isIn(THE_BEST_PHRASE, USE_THIS_VALUE_TO_DEFAULT_PHRASE)
    }

    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section03NullableTypes.task2() is Int).isTrue
        assertThat(Section03NullableTypes.task2()).isNotNull
        assertThat(Section03NullableTypes.task2()).isIn(THE_BEST_PHRASE.length, USE_THIS_VALUE_TO_DEFAULT_LENGTH)
    }

    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section03NullableTypes.task3() is String).isTrue
        assertThat(Section03NullableTypes.task3()).isNotNull
        assertThat(Section03NullableTypes.task3())
            .isIn(THE_BEST_PHRASE.lowercase(), USE_THIS_VALUE_TO_DEFAULT_PHRASE.lowercase())
    }
}