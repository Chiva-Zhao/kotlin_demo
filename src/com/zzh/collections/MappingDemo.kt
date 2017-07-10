package com.zzh.collections

import org.junit.Assert.assertEquals


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, 2, 3, 4, null, null)

//    flatMap Iterates over the elements creating a new collection for each one, and finally flattens all the
//    collections into a unique list containing all the elements
//    print(list.flatMap { listOf(it, it + 1) })
    assertEquals(listOf(1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7), list.flatMap { listOf(it, it + 1) })

//    groupBy Returns a map of the elements in original collection grouped by the result of given function
//    print(list.groupBy { if (it % 2 == 0) "even" else "odd" })
    assertEquals(mapOf("even" to listOf(2, 4, 6), "odd" to listOf(1, 3, 5)),
            list.groupBy { if (it % 2 == 0) "even" else "odd" })

//    map Returns a list containing the results of applying the given transform function to each element of the
//    original collection.
//    print(list.map { it * 2 })
    assertEquals(listOf(2, 4, 6, 8, 10, 12), list.map { it * 2 })

//    mapIndexed Returns a list containing the results of applying the given transform function to each element and
//            its index of the original collection.
    assertEquals(listOf(0, 2, 6, 12, 20, 30), list.mapIndexed { index, it -> index * it })

//    mapNotNull Returns a list containing the results of applying the given transform function to each non-null
//    element of the original collection.
    assertEquals(listOf(2, 4, 6, 8), listWithNull.mapNotNull { it?.times(2) })
}