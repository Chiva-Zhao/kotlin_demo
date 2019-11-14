package com.zzh.basic

abstract class AquariumFish : FishFunction {
    abstract val color: String
    override fun eat() = println("yum")
}

class Shark : AquariumFish() {
    override fun eat() {
        println("eat other fish")
    }

    override val color: String = "gray"
}

class Plecostomus : AquariumFish() {
    override fun eat() {
        println("eat algae")
    }

    override val color: String = "gold"
}

interface FishFunction {
    fun eat()
}

//A sealed class is a class that can be subclassed, but only inside the file in which it's declared. If you try to subclass the class in a different file, you get an error.
//
//Because the classes and subclasses are in the same file, Kotlin will know all the subclasses statically. That is, at compile time, the compiler sees all the classes and subclasses and knows that this is all of them, so the compiler can do extra checks for you
sealed class Seal

class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}