package com.zzh.collections

import org.junit.Assert.*

fun main(args: Array<String>) {
//contains Returns true if the element is found in the collection
    val list = listOf(1, 2, 3, 4, 5, 6)
    assertTrue(list.contains(2))

//    elementAt Returns an element at the given index or throws an IndexOutOfBoundsException if the index is out
//            of bounds of this collection.
    assertEquals(2, list.elementAt(1))

//    elementAtOrElse Returns an element at the given index or the result of calling the default function if the index is out
//            of bounds of this collection.
    assertEquals(20, list.elementAtOrElse(10, { 2 * it }))

//    elementAtOrNull Returns an element at the given index or null if the index is out of bounds of this collection.
    assertNull(list.elementAtOrNull(10))

//    first Returns the first element matching the given predicate
    assertEquals(2, list.first { it % 2 == 0 })

//    firstOrNull Returns the first element matching the given predicate, or null if no element was found.
    assertNull(list.firstOrNull { it % 7 == 0 })

//    indexOf Returns the first index of element, or -1 if the collection does not contain element.
    assertEquals(3, list.indexOf(4))

//    indexOfFirst Returns index of the first element matching the given predicate, or -1 if the collection does not
//    contain such element.
    assertEquals(1, list.indexOfFirst { it % 2 == 0 })

//    indexOfLast Returns index of the last element matching the given predicate, or -1 if the collection does not contain
//    such element.
    assertEquals(5, list.indexOfLast { it % 2 == 0 })

//    last Returns the last element matching the given predicate.
    assertEquals(6, list.last { it % 2 == 0 })

//    lastIndexOf Returns last index of element, or -1 if the collection does not contain element
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    assertEquals(5, listRepeated.lastIndexOf(5))

//    lastOrNull Returns the last element matching the given predicate, or null if no such element was found.
    assertNull(list.lastOrNull { it % 7 == 0 })

//    single Returns the single element matching the given predicate, or throws exception if there is no or more
//    than one matching element.
    assertEquals(5, list.single { it % 5 == 0 })

//    singleOrNull Returns the single element matching the given predicate, or null if element was not found or more
//    than one element was found.
    assertNull(list.singleOrNull { it % 7 == 0 })
}