package com.dantalion.first_project

fun main(){
    var child:Int = 10
    var adult = 28
    var senior =614
    var isMonday:Boolean = false
    //new exprecion for add function in printlns
    println("your price for ticket is \$${ticketPrice(isMonday, child)}")
    println("your price for ticket is \$${ticketPrice(isMonday, adult)}")
    println("your price for ticket is \$${ticketPrice(isMonday, senior)}")
}

fun ticketPrice(isMonday:Boolean, age:Int):Int {

    return when(age){
        in 0..12 -> 15
        in 13..60 -> if(isMonday) 25 else 30

        in 61..100 -> 20
        else -> -1

    }

}