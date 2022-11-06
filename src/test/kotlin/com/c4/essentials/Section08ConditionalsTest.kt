package com.c4.essentials

import com.c4.essentials.Section08Conditionals.ADULT
import com.c4.essentials.Section08Conditionals.FLAVOR_CHOCOLATE
import com.c4.essentials.Section08Conditionals.FLAVOR_STRAWBERRY
import com.c4.essentials.Section08Conditionals.FLAVOR_VANILLA
import com.c4.essentials.Section08Conditionals.MINOR
import com.c4.essentials.Section08Conditionals.OLD
import com.c4.essentials.Section08Conditionals.PASTRY.CROISSANT
import com.c4.essentials.Section08Conditionals.PASTRY.DONUT
import com.c4.essentials.Section08Conditionals.PASTRY.MUFFIN
import com.c4.essentials.Section08Conditionals.PASTRY.OTHER
import com.c4.essentials.Section08Conditionals.PastryNotFoundException
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class Section08ConditionalsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section08Conditionals.task1(true))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section08Conditionals.task1(false))
            .isEqualTo(FLAVOR_CHOCOLATE)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section08Conditionals.task2(15))
            .isEqualTo(MINOR)
        assertThat(Section08Conditionals.task2(18))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task2(45))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task2(75))
            .isEqualTo(ADULT)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section08Conditionals.task3(15))
            .isEqualTo(MINOR)
        assertThat(Section08Conditionals.task3(18))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task3(45))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task3(65))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task3(66))
            .isEqualTo(OLD)
        assertThat(Section08Conditionals.task3(78))
            .isEqualTo(OLD)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section08Conditionals.task4(CROISSANT))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section08Conditionals.task4(DONUT))
            .isEqualTo(FLAVOR_CHOCOLATE)
        assertThat(Section08Conditionals.task4(MUFFIN))
            .isEqualTo(FLAVOR_STRAWBERRY)
        assertThatThrownBy { Section08Conditionals.task8(OTHER) }
            .isInstanceOf(PastryNotFoundException::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section08Conditionals.task5(true))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section08Conditionals.task5(false))
            .isEqualTo(FLAVOR_CHOCOLATE)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section08Conditionals.task6(15))
            .isEqualTo(MINOR)
        assertThat(Section08Conditionals.task6(18))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task6(45))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task6(75))
            .isEqualTo(ADULT)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        assertThat(Section08Conditionals.task7(15))
            .isEqualTo(MINOR)
        assertThat(Section08Conditionals.task7(18))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task7(45))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task7(65))
            .isEqualTo(ADULT)
        assertThat(Section08Conditionals.task7(66))
            .isEqualTo(OLD)
        assertThat(Section08Conditionals.task7(78))
            .isEqualTo(OLD)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        assertThat(Section08Conditionals.task8(CROISSANT))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section08Conditionals.task8(DONUT))
            .isEqualTo(FLAVOR_CHOCOLATE)
        assertThat(Section08Conditionals.task8(MUFFIN))
            .isEqualTo(FLAVOR_STRAWBERRY)
        assertThatThrownBy { Section08Conditionals.task8(OTHER) }
            .isInstanceOf(PastryNotFoundException::class.java)
    }
}