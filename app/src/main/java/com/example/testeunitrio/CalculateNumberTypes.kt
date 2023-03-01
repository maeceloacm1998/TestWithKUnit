package com.example.testeunitrio

class CalculateNumberTypes {
    fun isCousinNumber(number: Int): Boolean {
        if(number <= 1) return false

        if (number % 2 == 0 && number != 2) {
            return false
        }

        return true
    }
}