package com.zzh.basic

fun main() {
    val filter = { dirty: Int -> dirty / 2 }
    println(updateDirty(17, filter))
    println(updateDirty(44, ::incrementDirty))

//    Kotlin prefers that any parameter that takes a function is the last parameter. When working with higher-order functions, Kotlin has a special syntax, called the last parameter call syntax, which lets you make the code even more concise. In this case, you can pass a lambda for the function parameter, but you don't need to put the lambda inside the parentheses.
    var dirtyLevel = 18
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 10 }
    println(dirtyLevel)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun incrementDirty(dirty: Int) = dirty + 1