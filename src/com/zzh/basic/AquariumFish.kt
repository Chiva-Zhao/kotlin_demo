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