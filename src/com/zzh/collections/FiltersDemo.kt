package com.zzh.collections

import org.junit.Assert.*

fun main(args: Array<String>) {
//    drop returns a list containing all elements except fisrt n elements
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, 2, 3, 4, null, null)
    assertEquals(listOf(5, 6), list.drop(4))

//    dropWhile Returns a list containing all elements except first elements that satisfy the given predicate.
    assertEquals(listOf(3, 4, 5, 6), list.dropWhile { it < 3 })

//    dropLastWhile Returns a list containing all elements except last elements that satisfy the given predicate
    assertEquals(listOf(1, 2, 3, 4), list.dropLastWhile { it > 4 })

//    filter Returns a list containing all elements matching the given predicate.
    assertEquals(listOf(2, 4, 6), list.filter { it % 2 == 0 })

//    filterNot Returns a list containing all elements not matching the given predicate.
    assertEquals(listOf(1, 3, 5), list.filterNot { it % 2 == 0 })

//    filterNotNull Returns a list containing all elements that are not null.
    assertEquals(listOf(1, 2, 3, 4), listWithNull.filterNotNull())

//    slice Returns a list containing elements at specified indices
    assertEquals(listOf(2, 4, 5), list.slice(listOf(1, 3, 4)))

//    take Returns a list containing first n elements
    assertEquals(listOf(1, 2), list.take(2))

//    takeLast Returns a list containing last n elements.
    assertEquals(listOf(5, 6), list.takeLast(2))

//    takeWhile Returns a list containing first elements satisfying the given predicate.
    assertEquals(listOf(1, 2), list.takeWhile { it < 3 })
}
