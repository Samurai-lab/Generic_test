package com.example.homework83

class Container <T>(val contained: List<T>)

fun main(){
    var mList = listOf<Number>(1.2, 44, 3, 100 ,42.54, 2.333, 34.653, 34.654, 7, 11, 31, 47)
    val container = Container(mList)
    mList = genericList(container)
    println("""
        Integer values: ${mList.filter { it.toDouble() % 1.0 == 0.0 }}
        Double values: ${mList.filterNot { it.toDouble() % 1.0 == 0.0}}
    """.trimIndent())

}

fun genericList(container: Container<Number>): List<Number> {
    var listCopy = container.contained.toMutableList()
    listCopy.retainAll{ it.toInt() % 2 == 0 }
    return listCopy.sortedBy { it.toDouble() }
}