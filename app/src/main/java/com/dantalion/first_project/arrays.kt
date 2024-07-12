package com.dantalion.first_project
var weekend = arrayOf("monday","tuesday","wednesday","thursday","friday","saturday","sunday")
var nameles = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))

fun main(){
    println(weekend.withIndex())
    println(weekend.indices)
    println(weekend[0])
    println(weekend.size)
    println(nameles[2][2])
    for(i in nameles.indices){
        println(i)

    }
    // bi for
    for((position,value) in nameles[2].withIndex()){
        println("position $position value $value")

    }
}
