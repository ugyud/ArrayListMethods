package com.dozkan.arraylistmethods

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    val sortedNames = names.sorted()

    println("Names that sorted in alphabetical order: $sortedNames")
    println("Enter a name: ")
    val enteredName: String? = readLine()

    if (sortedNames.contains(enteredName)) {
        val name = enteredName?.uppercase()?.reversed()
        println("Reversed and uppercased name: $name")
    }

}