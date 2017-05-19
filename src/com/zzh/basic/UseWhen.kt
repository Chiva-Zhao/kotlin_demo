package com.zzh.basic

/**
 * Created by test on 2017/5/18.
 */
fun main(args: Array<String>) {
    com.zzh.basic.cases(1)
    com.zzh.basic.cases("Hello")
    com.zzh.basic.cases(MyClass())
    com.zzh.basic.cases("hello")
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