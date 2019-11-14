package com.zzh.basic.deco

data class Decoration(val rocks: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))
//    You could have used == to check whether d1 == d2 and d3 == d2. In Kotlin, using == on data class objects is the same as using equals() (structural equality). If you need to check whether two variables refer to the same object (referential equality), use the === operator. Read more about equality in Kotlin in the language documentation.
    println(decoration1 == decoration2)
    println(decoration3 == decoration2)

    println(decoration1 === decoration2)
    println(decoration3 === decoration2)
}

fun main() {
//    makeDecorations()
    makeDecorations2()
}

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String) {
}

fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

//    If you don't need one or more of the properties, you can skip them by using _ instead of a variable name, as shown in the code below.
    val (rock1, _, diver1) = d5
}