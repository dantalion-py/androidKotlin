package com.dantalion.first_project
fun main() {
    //inmutable list
    var coreList:List<String> = listOf("arquimedes","euclides","asmodeus","dantalion","democrito")

    println(coreList.toString())
    println(coreList)
    println(coreList.last())
    println(coreList.first())
    println(coreList.filter { it.contains("e") })
    coreList.forEach { i -> println(i) }
    mutableList()
}
fun mutableList(){
    var coreList2:MutableList<String> = mutableListOf("arquimedes","euclides","asmodeus","dantalion","democrito")
    coreList2.add("socrates")
    coreList2.add(3,"leonidas")

    println(coreList2)
    if(coreList2.isEmpty()){
        println("is empty")
    }else{
        println("is not empty")
    }

}