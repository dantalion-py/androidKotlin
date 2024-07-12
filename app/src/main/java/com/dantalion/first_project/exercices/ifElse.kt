package com.dantalion.first_project.exercices

fun main() {
    determinateTrue("true")
    numMax(13,34)
    detecMont(13)
    detecMontTri(4)
    println(detecMontSem(11))

    moreActions("nameles")
}

fun determinateTrue(text:String){
    if(text !="false"){
        println("is true")
    }
    else{
        println("is false")
    }
}
fun numMax(num1:Long,num2:Long){
    if(num1>=20){
        println("alpha")
    }else{
        println("beta")
    }
}

fun detecMont(mont:Int){
    when(mont){
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
        5 -> println("5")
        6 -> println("6")
        7 -> println("7")
        8 -> println("8")
        9 -> println("9")
        10 -> println("10")
        11 -> println("11")
        12 -> println("12")
        else -> println("zero")
    }
}

fun detecMontTri(mont:Int){
    when(mont){
        1, 2, 3 -> println("1")
        4, 5, 6 -> println("2")
        7, 8, 9 -> println("3")
        10, 11, 12 -> println("4")
        else -> println("zero")
    }
}

fun detecMontSem(mont:Int):String {
    var resulting = when (mont) {
        in 1..6 -> "1"
        in 7..12 -> "2"
        //si no esta entre el 1-12
        !in 1..12 -> "none"
        else -> {
             "val else"
        }
    }
    return resulting
}

fun moreActions(result:Any) {
    when (result) {
        is Int -> result + result
        is String -> println("$result")
        is Boolean -> if (result) println("true")

    }
}


fun moreActions2(result:Int) =
    when (result) {
        in 1..6-> "first sem"
        in 7..12 -> "second sem"
        else -> "none"

    }
