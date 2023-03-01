package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class CalculateNumberTypesTest {
    @Test
    fun testSuccessCousinNumber() {
        val number1 = 2
        val number2 = 97

        Assert.assertTrue(CalculateNumberTypes().isCousinNumber(number1))
        Assert.assertTrue(CalculateNumberTypes().isCousinNumber(number2))
    }

    @Test
    fun testFailureCousinNumber() {
        val number1 = 76
        val number2 = -76

        Assert.assertFalse(CalculateNumberTypes().isCousinNumber(number1))
        Assert.assertFalse(CalculateNumberTypes().isCousinNumber(number2))
    }
}