package com.example.testeunitrio

class AverageCalculation {
    fun average(list: List<Int>): Int {
        return if (list.isEmpty()) {
            0
        } else {
            var sum = 0
            list.forEach { number ->
                sum += number
            }

            sum / list.size
        }
    }
}