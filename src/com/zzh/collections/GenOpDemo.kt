package com.zzh.collections

import org.junit.Assert.assertEquals

//Generation operations

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
//    merge two list in one
    assertEquals(listOf(3, 4, 6, 8, 10, 11), list.zip(listRepeated) { it1, it2 -> it1 + it2 })

//    partition Splits original collection into pair of collections, where the first collection contains elements for
//    which the predicate returned true, while the second collection contains elements for which the
//    predicate returned false.
    assertEquals(Pair(listOf(2, 4, 6), listOf(1, 3, 5)), list.partition { it % 2 == 0 })

//    plus Returns a list containing all elements of the original collection and then all elements of the given
//    collection. Because of the name of the function, we can use the ‘+’ operator with it.
    assertEquals(listOf(1, 2, 3, 4, 5, 6, 7, 8), list + listOf(7, 8))

//    zip Returns a list of pairs built from the elements of both collections with the same indexes. The list has
//    the length of the shortest collection.
    assertEquals(listOf(Pair(1, 7), Pair(2, 8)), list.zip(listOf(7, 8)))

//    unzip Generates a Pair of Lists from a List of Pairs
    assertEquals(Pair(listOf(5, 6), listOf(7, 8)), listOf(Pair(5, 7), Pair(6, 8)).unzip())
}
