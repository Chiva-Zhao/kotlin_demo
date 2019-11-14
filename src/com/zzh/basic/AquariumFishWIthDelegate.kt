package com.zzh.basic

interface FishColor {
    val color: String
}

interface FishAction {
    fun eat()
}

object GoldColor : FishColor {
    override val color: String = "golden"

}

class PrintFishAction(val food: String) : FishAction {
    override fun eat() = println("eat ${food}")
}

class SharkWithDelegate : FishAction, FishColor {
    override val color = "gold";
    override fun eat() {
        println("eat algae")
    }
}

//class PlecostomusWithDelegate : FishAction, FishColor by GoldColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}

class PlecostomusWithDelegate(fishColor: FishColor = GoldColor) :
        FishAction by PrintFishAction("other fish"), FishColor by fishColor {
    override fun eat() {
        println("eat algae")
    }
}

