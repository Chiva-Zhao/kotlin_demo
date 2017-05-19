package com.zzh.basic

/**
 * Created by test on 2017/5/19.
 */
data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("Alex", 1)
}

fun main(args: Array<String>) {
    val user = getUser()
    println("name = ${user.name},id=${user.id}")

    val (name, id) = getUser()
    println("name=$name, id=$id")
    println("name = ${getUser().component1()}, id = ${getUser().component2()}")
}