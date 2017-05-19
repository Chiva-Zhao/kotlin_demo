package com.zzh

/**
 * Created by test on 2017/5/18.
 */
fun main(args: Array<String>) {
    cases(1)
    cases("Hello")
    cases(MyClass())
    cases("hello")
    val customer = Customer("Phase")
    println(customer.name)
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

class MyClass() {

}