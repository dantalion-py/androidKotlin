package com.dantalion.first_project.exercices
//nullabilizar variables
var versatile:String? = "dantalion"
fun main() {
    //si versatile no es nulo que me devuleva la posicion 3
    println(versatile?.get(3))

    //si versatile no es nulo que me devuleva la posicion 3, pero si lo es
    println(versatile?.get(3) ?: "es nulo")

    
    println(versatile)
    verify(versatile)
}
fun verify(varible:String?){
    if (varible==null){
        println("misspase")
    }else{
        println("verify")
    }
}