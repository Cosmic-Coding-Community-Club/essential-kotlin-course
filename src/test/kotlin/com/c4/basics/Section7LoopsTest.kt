package com.c4.basics

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Section7LoopsTest {
    
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
        Section7Loops.task1()
        assertThat(outContent.toString()).isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        Section7Loops.task2()
        assertThat(outContent.toString()).isEqualTo("1- Buddy\n2- Max\n3- Rosie\n4- Poppy\n5- Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        Section7Loops.task3()
        assertThat(outContent.toString()).isEqualTo("1- Buddy\n2- Max\n3- Rosie\n4- Poppy\n5- Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        Section7Loops.task4()
        assertThat(outContent.toString())
            .isEqualTo(
                "Id[10001] -> name[John]\nId[10002] -> name[Daniel]\n" +
                    "Id[10003] -> name[Charles]\nId[10004] -> name[Bella]\n"
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        Section7Loops.task5()
        assertThat(outContent.toString()).isEqualTo("123456789")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        Section7Loops.task6()
        assertThat(outContent.toString()).isEqualTo("12345678")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        Section7Loops.task7()
        assertThat(outContent.toString()).isEqualTo("13579")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        Section7Loops.task8()
        assertThat(outContent.toString()).isEqualTo("963")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask9() {
        Section7Loops.task9()
        assertThat(outContent.toString())
            .isEqualTo(
                "Red-Car\nRed-Bicycle\nRed-Bus\nRed-Truck\nRed-Motorcycle\nRed-Van\n" +
                    "Black-Car\nBlack-Bicycle\nBlack-Bus\nBlack-Truck\nBlack-Motorcycle\nBlack-Van\n" +
                    "White-Car\nWhite-Bicycle\nWhite-Bus\nWhite-Truck\nWhite-Motorcycle\nWhite-Van\n"
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask10() {
        Section7Loops.task10()
        assertThat(outContent.toString())
            .isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask11() {
        Section7Loops.task11()
        assertThat(outContent.toString())
            .isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
}