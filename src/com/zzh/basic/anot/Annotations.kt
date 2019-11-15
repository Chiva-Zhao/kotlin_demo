package com.zzh.basic.anot

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.findAnnotation

@ImAPlant
class Plant {
    fun trim() {}
    fun fertilize() {}
    @get:OnGet
    val isGrowing: Boolean = true

    @set:OnSet
    var needsFood: Boolean = false
}

fun testAnnotations() {
    var objectCls = Plant::class
    for (m in objectCls.declaredMemberFunctions) {
        println(m.name)
    }

    for (m in objectCls.annotations) {
        println(m.annotationClass.simpleName)
    }

    var myAnnotation = objectCls.findAnnotation<ImAPlant>()
    println(myAnnotation)
}

fun main() {
    testAnnotations()
    labels()
}

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class OnGet

@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class OnSet

fun labels() {
    outloop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (i > 10) break@outloop
        }
    }
}