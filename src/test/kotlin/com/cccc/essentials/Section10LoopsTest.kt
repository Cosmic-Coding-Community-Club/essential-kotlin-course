package com.cccc.essentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class Section10LoopsTest {
    
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
        Section10Loops.task1()
        assertThat(outContent.toString()).isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        Section10Loops.task2()
        assertThat(outContent.toString()).isEqualTo("1- Buddy\n2- Max\n3- Rosie\n4- Poppy\n5- Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        Section10Loops.task3()
        assertThat(outContent.toString()).isEqualTo("1- Buddy\n2- Max\n3- Rosie\n4- Poppy\n5- Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        Section10Loops.task4()
        assertThat(outContent.toString())
            .isEqualTo(
                "Id[10001] -> name[John]\nId[10002] -> name[Daniel]\n" +
                    "Id[10003] -> name[Charles]\nId[10004] -> name[Bella]\n"
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        Section10Loops.task5()
        assertThat(outContent.toString()).isEqualTo("123456789")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        Section10Loops.task6()
        assertThat(outContent.toString()).isEqualTo("12345678")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        Section10Loops.task7()
        assertThat(outContent.toString()).isEqualTo("13579")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        Section10Loops.task8()
        assertThat(outContent.toString()).isEqualTo("963")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask9() {
        Section10Loops.task9()
        assertThat(outContent.toString()).isEqualTo("12345")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask10() {
        Section10Loops.task10()
        assertThat(outContent.toString()).isEqualTo("12345")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask11() {
        Section10Loops.task11()
        assertThat(outContent.toString())
            .isEqualTo(
                "Red-Car\nRed-Bicycle\nRed-Bus\nRed-Truck\nRed-Motorcycle\nRed-Van\n" +
                    "Black-Car\nBlack-Bicycle\nBlack-Bus\nBlack-Truck\nBlack-Motorcycle\nBlack-Van\n" +
                    "White-Car\nWhite-Bicycle\nWhite-Bus\nWhite-Truck\nWhite-Motorcycle\nWhite-Van\n"
            )
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask12() {
        Section10Loops.task12()
        assertThat(outContent.toString())
            .isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask13() {
        Section10Loops.task13()
        assertThat(outContent.toString())
            .isEqualTo("Pet: Buddy\nPet: Max\nPet: Rosie\nPet: Poppy\nPet: Milo\n")
    }
}