package com.dantalion.first_project
var longNum:Long = 12812823762376723
var smallNum:Int = 1281
var floatNum:Float = 23.23f
var doubleNum:Double = 334.346464
var charLet:Char = 'n'
var stringLe:String = "nameles"
var booleaLetres:Boolean = true
var name= 34343897987
val name2 = "sdsd"

fun variables(){


}
fun main (){
    println("hello world")
    name=34
    println(stringLe+" "+name+ charLet+" $doubleNum")
    println(name2.toString())
    sayHello()
    println(
        sayHelloHacker("nameles")

    )

}
//default args
fun sayHello(name:String = "dantalion"){
    println("hello $name")
}
//one line!!
fun sayHelloHacker(name:String) = "asmodeus"+name