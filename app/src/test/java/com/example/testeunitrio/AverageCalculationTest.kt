package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test


class AverageCalculationTest {
    @Test
    fun testSuccessAverageCalculation() {
        val list1: List<Int> = listOf(5,5,20)
        val list2: List<Int> = listOf(-5,-5,-20)
        val list3: List<Int> = listOf(0,0,0)

        Assert.assertEquals(10, AverageCalculation().average(list1))
        Assert.assertEquals(-10, AverageCalculation().average(list2))
        Assert.assertEquals(0, AverageCalculation().average(list3))
    }

    @Test
    fun testFailedAverageCalculation() {
        val list1: List<Int> = listOf()

        Assert.assertEquals(0, AverageCalculation().average(list1))
    }
}