package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class TemperatureConverterTest {
    @Test
    fun testSuccessConverterToFahrenheit() {
        val Celsius1 = 0
        val Celsius2 = 10
        val Celsius3 = -10
        val Celsius4 = 1000

        Assert.assertEquals(32, TemperatureConverter().converterToFahrenheit(Celsius1))
        Assert.assertEquals(50, TemperatureConverter().converterToFahrenheit(Celsius2))
        Assert.assertEquals(14, TemperatureConverter().converterToFahrenheit(Celsius3))
        Assert.assertEquals(1832, TemperatureConverter().converterToFahrenheit(Celsius4))
    }
}