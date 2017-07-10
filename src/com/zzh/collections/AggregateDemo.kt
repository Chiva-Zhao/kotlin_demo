package com.zzh.collections

import org.junit.Assert.*

fun main(args: Array<String>) {
//    Any Returns true if at least one element matches the given predicate
    val list = listOf(1, 2, 3, 4, 5, 6)
    assertTrue(list.any { it % 2 == 0 })
    assertFalse(list.any { it > 10 })

//    all Returns true if all the elements match the given predicate
    assertTrue(list.all { it < 10 })
    assertFalse(list.all { it % 2 == 0 })

//    count Returns the number of elements matching the given predicate.
    assertEquals(3, list.count { it % 2 == 0 })

//    fold Accumulates the value starting with an initial value and applying an operation from the first to the
//    last element in a collection
    assertEquals(25, list.fold(4) { total, next -> total + next })

//    foldRight Same as fold, but it goes from the last element to first.
    assertEquals(25, list.foldRight(4) { total, next -> total + next })

//    forEach Performs the given operation to each element.
    list.forEach { println(it) }

//    forEachIndexed Same as forEach, though we also get the index of the element.
    list.forEachIndexed { index, i -> println("Position $index contains a $i") }

//    max Returns the largest element or null if there are no elements.
    assertEquals(6, list.max())

//    maxBy Returns the first element yielding the largest value of the given function or null if there are no elements
    // The element whose negative is greater
    assertEquals(1, list.maxBy { -it })

//    min Returns the smallest element or null if there are no elements.
    assertEquals(1, list.min())

//    minBy Returns the first element yielding the smallest value of the given function or null if there are no elements.
    // The element whose negative is smaller
    assertEquals(6, list.minBy { -it })

//    none Returns true if no elements match the given predicate.
    // No elements are divisible by 7
    assertTrue(list.none { it % 7 == 0 })

//    reduce Same as fold, but it doesn’t use an initial value. It accumulates the value applying an operation from
//    the first to the last element in a collection.
    assertEquals(21, list.reduce { total, next -> total + next })

//    reduceRight Same as reduce, but it goes from the last element to first.
    assertEquals(21, list.reduceRight { i, acc -> i + acc })

//    sumBy Returns the sum of all values produced by the transform function from the elements in the collection.
    assertEquals(3, list.sumBy { it % 2 })
}


