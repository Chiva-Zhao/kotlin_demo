package com.zzh.basic

import java.util.*

fun main(args: Array<String>) {
//    println("Hello ${args[0]}" )
    feedTheFish()
//    swim()   // uses default speed
//    swim("slow")   // positional argument
//    swim(speed = "turtle-like")   // named parameter
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun fishFood(day: String): String {
//    val food: String
//    when (day) {
//        "Monday" -> food = "flakes"
//        "Tuesday" -> food = "pellets"
//        "Wednesday" -> food = "redworms"
//        "Thursday" -> food = "granules"
//        "Friday" -> food = "mosquitoes"
//        "Saturday" -> food = "lettuce"
//        "Sunday" -> food = "plankton"
//        else -> food = "nothing"
//    }
//    return food
    return when (day) {
//        "Monday" -> "flakes"
//        "Tuesday" -> "pellets"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {
//    return when {
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" -> true
//        else -> false
//    }
    println(dirty)
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun getDirtySensorReading(): Int {
    return Random().nextInt(50)
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"