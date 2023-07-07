package com.dozkan.arraylistmethods

fun main() {
    val namesList = arrayListOf<String>("Ahmet", "Burcu", "Cemre", "Duygu", "Emir")

    println("Enter 3 names with using comma between them: ")
    val enteredNames: String? = readLine()
    val newNamesList = enteredNames?.split(",")?.map { it.trim() }

    if(enteredNames != null) {
        if (newNamesList != null) {
            namesList.addAll(newNamesList)
            println("Your new list: $namesList")
        }
    } else {
        println("Please enter 3 names with using comma.")
    }

}