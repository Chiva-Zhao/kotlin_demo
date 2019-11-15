package com.zzh.basic.anot

data class Fish(var name: String)

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase
    with(fish.name) {
        //        this.capitalize()
        println(capitalize())
    }

    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

//    run() and apply() are similar, but run() returns the result of applying the function, and apply() returns the object after applying the function.
    fish.run { name }

    val fish2 = Fish("小鱼").apply { name = "鲨鱼" }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
            .let { it + "fish" }
            .let { it.length }
            .let { it + 31 })
    println(fish)
}

fun main() {
    fishExamples()
    fishExamples1()
    runExample()
}

//Create a higher-order function
fun myWith(name: String, operation: String.() -> Unit) {
    name.operation()
}

fun fishExamples1() {
    val fish = Fish("splashy")  // all lowercase
    myWith(fish.name) {
        println(capitalize())
    }
}

fun runExample() {
    val run = object : Runnable {
        override fun run() {
            println("I am a runnable")
        }
    }
    JavaRun.runNow(run)
    JavaRun.runNow({
        println("I'm a runnable too")
    })
    JavaRun.runNow { println("I'm another runnable") }
}