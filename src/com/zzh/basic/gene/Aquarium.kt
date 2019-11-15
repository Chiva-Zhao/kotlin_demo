package com.zzh.basic.gene

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)
class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

//class Aquarium<T>(val waterSupply: T)
//class Aquarium<T : WaterSupply>(val waterSupply: T) {
class Aquarium<out T : WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }

    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

//    inline fun <reified R : WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
}

//fun genericsExample1() {
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)
//}

fun genericsExample2() {
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun genericsExample3() {
    val aquarium = Aquarium(TapWater())
    addItemTo(aquarium)
}

fun genericsExample4() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}

fun main() {
//    genericsExample()
//    genericsExample1()
//    genericsExample2()
//    genericsExample3()
//    genericsExample4()
//    genericsExample5()
//    genericsExample6()
//    genericsExample7()
    genericsExample8()
}

interface Cleaner<in T : WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner : Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

//Find out about generic functions
fun isWaterClean(aquarium: Aquarium<WaterSupply>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessing}")
}

fun <T : WaterSupply> isWaterClean1(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${!aquarium.waterSupply.needsProcessing}")
}

fun genericsExample5() {
    val aquarium = Aquarium(TapWater())
//    isWaterClean1<TapWater>(aquarium)
    isWaterClean1(aquarium)
}

fun genericsExample6() {
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())   // true
}

inline fun <reified T : WaterSupply> WaterSupply.isOfType() = this is T

fun genericsExample7() {
    val aquarium = Aquarium(TapWater())
    println(aquarium.waterSupply.isOfType<TapWater>())
}

inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun genericsExample8() {
    val aquarium = Aquarium(TapWater())
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}