package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Section7ForLoopsTest {
    
    private val outContent: ByteArrayOutputStream = ByteArrayOutputStream()
    private val originalOut = System.out
    
    @BeforeEach
    internal fun setUp() {
        System.setOut(PrintStream(outContent));
    }
    
    @AfterEach
    internal fun tearDown() {
        System.setOut(originalOut);
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        Section7ForLoops.task1()
        assertThat(outContent.toString()).isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        Section7ForLoops.task2()
        assertThat(outContent.toString()).isEqualTo("1- Buddy\n2- Max\n3- Rosie\n4- Poppy\n5- Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        Section7ForLoops.task3()
        assertThat(outContent.toString()).isEqualTo("1- Buddy\n2- Max\n3- Rosie\n4- Poppy\n5- Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        Section7ForLoops.task4()
        assertThat(outContent.toString())
            .isEqualTo(
                "Id[10001] -> name[John]\nId[10002] -> name[Daniel]\n" +
                    "Id[10003] -> name[Charles]\nId[10004] -> name[Bella]\n"
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        Section7ForLoops.task5()
        assertThat(outContent.toString()).isEqualTo("123456789")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        Section7ForLoops.task6()
        assertThat(outContent.toString()).isEqualTo("12345678")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        Section7ForLoops.task7()
        assertThat(outContent.toString()).isEqualTo("13579")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        Section7ForLoops.task8()
        assertThat(outContent.toString()).isEqualTo("963")
    }
}