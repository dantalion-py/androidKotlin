package com.dantalion.first_project.exercices
val names:Int = 34
var namles:String = "namels"
fun main() {

    val morningNofications = 52
    val eveningNotifications = 134
    printNotificationSummary(morningNofications)
    printNotificationSummary(eveningNotifications)

}
fun printNotificationSummary(notifications:Int){
    if(notifications>=100){
        println("you have 99+ notifications")

    }else{
        println("you have $notifications")
    }
}