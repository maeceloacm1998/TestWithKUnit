package com.example.testeunitrio

class FatorialCalculation {

    fun fatorial(number: Int): Long {
        if(number < 0.0) {
            return 0
        }

        if(number == 0) {
            return 1
        }

        var factorialNumber: Long = 1

        for (i in 1..number) {
            factorialNumber *= i.toLong()

            if(i == number) {
                return factorialNumber
            }
        }

        return 0
    }
}