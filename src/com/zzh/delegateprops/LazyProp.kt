package com.zzh.delegateprops

/**
 * Created by test on 2017/5/19.
 */
class LazySample {
    val lazyprop: String by lazy {
        println("computed!")
        "my lazy"
    }
}

fun main(args: Array<String>) {
    val sample = LazySample()
    println("lazy = ${sample.lazyprop}")
    println("lazy = ${sample.lazyprop}")
}