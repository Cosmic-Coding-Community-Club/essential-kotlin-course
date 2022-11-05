package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.AbstractMap.SimpleEntry
import kotlin.reflect.full.allSupertypes

class Section04CollectionsTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section04Collections.task1() as List<*>)
            .isNotNull
            .hasSize(4)
            .contains(45, 15, 74, 80)
            .isInstanceOf(List::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        assertThat(Section04Collections.task2() as List<*>)
            .isNotNull
            .hasSize(4)
            .contains("chair", "table", "lamp", "bed")
            .isInstanceOf(List::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        assertThat(Section04Collections.task3() as List<*>)
            .isNotNull
            .hasSize(4)
            .contains(45, 15, 74, 80)
            .isInstanceOf(MutableList::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        assertThat(Section04Collections.task4() as Map<Int,String>)
            .isNotNull
            .hasSize(4)
            .contains(
                SimpleEntry(1, "John"),
                SimpleEntry(2, "Daniel"),
                SimpleEntry(3, "Mathew"),
                SimpleEntry(4, "Madison")
            )
            .isInstanceOf(Map::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        assertThat(Section04Collections.task4() is MutableMap).isTrue
        assertThat(Section04Collections.task5() as Map<Int,String>)
            .isNotNull
            .hasSize(4)
            .contains(
                SimpleEntry(1, "John"),
                SimpleEntry(2, "Daniel"),
                SimpleEntry(3, "Mathew"),
                SimpleEntry(4, "Madison")
            )
            .isInstanceOf(Map::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        assertThat(Section04Collections.task6() as Set<*>)
            .isNotNull
            .hasSize(4)
            .isInstanceOf(Set::class.java)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        assertThat(Section04Collections.task7() as Set<*>)
            .isNotNull
            .hasSize(4)
            .isInstanceOf(Set::class.java)
    }
}