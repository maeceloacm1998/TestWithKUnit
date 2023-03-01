package com.example.testeunitrio

class OrdinationList {
    fun isOrdinationList(list: List<Int>): Boolean {
        val sort = list.sortedBy { it }

        if (sort != list) {
            return false
        }

        return true
    }
}