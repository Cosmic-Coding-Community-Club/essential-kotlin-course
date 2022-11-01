package com.c4.basics

import com.c4.basics.Section6Conditionals.ADULT
import com.c4.basics.Section6Conditionals.FLAVOR_CHOCOLATE
import com.c4.basics.Section6Conditionals.FLAVOR_STRAWBERRY
import com.c4.basics.Section6Conditionals.FLAVOR_VANILLA
import com.c4.basics.Section6Conditionals.MINOR
import com.c4.basics.Section6Conditionals.OLD
import com.c4.basics.Section6Conditionals.PASTRY.CROISSANT
import com.c4.basics.Section6Conditionals.PASTRY.DONUT
import com.c4.basics.Section6Conditionals.PASTRY.MUFFIN
import com.c4.basics.Section6Conditionals.PASTRY.OTHER
import com.c4.basics.Section6Conditionals.PastryNotFoundException
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class Section6ConditionalsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section6Conditionals.task1(true))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section6Conditionals.task1(false))
            .isEqualTo(FLAVOR_CHOCOLATE)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section6Conditionals.task2(15))
            .isEqualTo(MINOR)
        assertThat(Section6Conditionals.task2(18))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task2(45))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task2(75))
            .isEqualTo(ADULT)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section6Conditionals.task3(15))
            .isEqualTo(MINOR)
        assertThat(Section6Conditionals.task3(18))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task3(45))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task3(65))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task3(66))
            .isEqualTo(OLD)
        assertThat(Section6Conditionals.task3(78))
            .isEqualTo(OLD)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section6Conditionals.task4(CROISSANT))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section6Conditionals.task4(DONUT))
            .isEqualTo(FLAVOR_CHOCOLATE)
        assertThat(Section6Conditionals.task4(MUFFIN))
            .isEqualTo(FLAVOR_STRAWBERRY)
        assertThatThrownBy { Section6Conditionals.task8(OTHER) }
            .isInstanceOf(PastryNotFoundException::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section6Conditionals.task5(true))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section6Conditionals.task5(false))
            .isEqualTo(FLAVOR_CHOCOLATE)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section6Conditionals.task6(15))
            .isEqualTo(MINOR)
        assertThat(Section6Conditionals.task6(18))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task6(45))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task6(75))
            .isEqualTo(ADULT)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        assertThat(Section6Conditionals.task7(15))
            .isEqualTo(MINOR)
        assertThat(Section6Conditionals.task7(18))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task7(45))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task7(65))
            .isEqualTo(ADULT)
        assertThat(Section6Conditionals.task7(66))
            .isEqualTo(OLD)
        assertThat(Section6Conditionals.task7(78))
            .isEqualTo(OLD)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        assertThat(Section6Conditionals.task8(CROISSANT))
            .isEqualTo(FLAVOR_VANILLA)
        assertThat(Section6Conditionals.task8(DONUT))
            .isEqualTo(FLAVOR_CHOCOLATE)
        assertThat(Section6Conditionals.task8(MUFFIN))
            .isEqualTo(FLAVOR_STRAWBERRY)
        assertThatThrownBy { Section6Conditionals.task8(OTHER) }
            .isInstanceOf(PastryNotFoundException::class.java)
    }
}