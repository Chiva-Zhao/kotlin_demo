package com.zzh.collections

import org.junit.Assert.assertEquals

//Ordering operations
fun main(args: Array<String>) {
//    reverse Returns a list with elements in reversed order.
    val unsortedList = listOf(3, 2, 7, 5)
    assertEquals(listOf(5, 7, 2, 3), unsortedList.reversed())

//    sort Returns a sorted list of all elements.
    assertEquals(listOf(2, 3, 5, 7), unsortedList.sorted())

//    sortBy Returns a list of all elements, sorted by the specified comparator.
    assertEquals(listOf(3, 7, 2, 5), unsortedList.sortedBy { it % 3 })

//    sortDescending Returns a sorted list of all elements, in descending order.
    assertEquals(listOf(7, 5, 3, 2), unsortedList.sortedByDescending { it })

//    sortDescendingBy Returns a sorted list of all elements, in descending order by the results of the specified order function.
    assertEquals(listOf(2, 5, 7, 3), unsortedList.sortedByDescending { it % 3 })
}