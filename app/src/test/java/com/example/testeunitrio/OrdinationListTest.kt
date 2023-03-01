package com.example.testeunitrio

import org.junit.Assert
import org.junit.Test

class OrdinationListTest {
    @Test
    fun testIsOrdinationList() {
        val list1: List<Int> = listOf(1,2,3,4,5)
        val list2: List<Int> = listOf(-5,-4,-3,-2,-1)

        Assert.assertTrue(OrdinationList().isOrdinationList(list1))
        Assert.assertTrue(OrdinationList().isOrdinationList(list2))
    }

    @Test
    fun testIsNotOrdinationList() {
        val list1: List<Int> = listOf(2,4,3,2,1)
        val list2: List<Int> = listOf(-1,-2,-3,-4,-5)

        Assert.assertFalse(OrdinationList().isOrdinationList(list1))
        Assert.assertFalse(OrdinationList().isOrdinationList(list2))
    }
}