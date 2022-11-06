package com.cccc.essentials

import com.cccc.essentials.Section11Classes.Bird
import com.cccc.essentials.Section11Classes.Bird.Color.GREEN
import com.cccc.tooling.TestUtils.getFunction
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Section11ClassesTest {
    
    @Test
    fun shouldReturnGreenWhenCheckTask1() {
        assertThat(Section11Classes.task1())
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Cat"))
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask2() {
        val instanceToCheck = Section11Classes.task2()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Dog"))
        assertThat(instanceToCheck.javaClass.kotlin.constructors)
            .hasSize(1)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters)
            .hasSize(2)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[0].type.classifier)
            .isEqualTo(String::class)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[1].type.classifier)
            .isEqualTo(Float::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask3() {
        val instanceToCheck = Section11Classes.task3()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Cat"))
        assertThat(Class.forName("com.cccc.essentials.creations.Feline").kotlin.isInstance(instanceToCheck))
            .isTrue
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask4() {
        val instanceToCheck = Section11Classes.task4()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Dog"))
        assertThat(Class.forName("com.cccc.essentials.creations.Canine").kotlin.isInstance(instanceToCheck))
            .isTrue
        assertThat(getFunction(Class.forName("com.cccc.essentials.creations.Canine").kotlin, "doWoof"))
            .isNotNull
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask5() {
        val instanceToCheck = Section11Classes.task5()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Cat"))
        assertThat(Class.forName("com.cccc.essentials.creations.Feline").kotlin.isInstance(instanceToCheck))
            .isTrue
        assertThat(Class.forName("com.cccc.essentials.creations.Animal").kotlin.isInstance(instanceToCheck))
            .isTrue
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask6() {
        val instanceToCheck = Section11Classes.task6()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Owner"))
        assertThat(instanceToCheck::class.isData)
            .isTrue
        assertThat(instanceToCheck.javaClass.kotlin.constructors)
            .hasSize(1)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters)
            .hasSize(3)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[0].type.classifier)
            .isEqualTo(String::class)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[1].type.classifier)
            .isEqualTo(Long::class)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[2].type.classifier)
            .isEqualTo(String::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask7() {
        val instanceToCheck = Section11Classes.task7()
        assertThat(instanceToCheck)
            .isInstanceOf(Class.forName("com.cccc.essentials.creations.Owner"))
        assertThat(instanceToCheck::class.isData)
            .isTrue
        assertThat(Class.forName("com.cccc.essentials.creations.Person").kotlin.isInstance(instanceToCheck))
            .isTrue
        assertThat(instanceToCheck.javaClass.kotlin.constructors)
            .hasSize(1)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters)
            .hasSize(3)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[0].type.classifier)
            .isEqualTo(String::class)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[1].type.classifier)
            .isEqualTo(Long::class)
        assertThat(instanceToCheck.javaClass.kotlin.constructors.elementAt(0).parameters[2].type.classifier)
            .isEqualTo(String::class)
    }
    
    @Test
    fun shouldReturnGreenWhenCheckTask8() {
        assertThat(Section11Classes.task8())
            .hasFieldOrPropertyWithValue("name", "Talker")
            .hasFieldOrPropertyWithValue("specie", "Parrot")
            .hasFieldOrPropertyWithValue("color", GREEN)
            .hasFieldOrPropertyWithValue("weight", 350.45f)
            .isInstanceOf(Bird::class.java)
    }
}