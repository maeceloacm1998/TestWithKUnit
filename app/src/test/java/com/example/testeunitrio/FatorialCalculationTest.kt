package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class FatorialCalculationTest {

    @Test
    fun testFatorialCalculation() {
        val number1 = 5
        val number2 = 1

        Assert.assertEquals(120, FatorialCalculation().fatorial(number1))
        Assert.assertEquals(1, FatorialCalculation().fatorial(number2))
    }

    @Test
    fun testExceptionFatorialCalculation() {
        val number1 = -5
        val number2 = 0

        Assert.assertEquals(0, FatorialCalculation().fatorial(number1))
        Assert.assertEquals(1, FatorialCalculation().fatorial(number2))
    }
}