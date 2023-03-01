package com.example.testeunitrio

class TemperatureConverter {
    fun converterToFahrenheit(degreesCelsius: Int): Int {
        return (degreesCelsius * 9/5) + 32
    }
}