package com.dozkan.arraylistmethods

fun main() {
    data class Workers(val name: String, val salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    val updatedSalariesList = workers.map { Workers(it.name,(it.salary * 0.35) + it.salary) }
    val shuffledList = updatedSalariesList.shuffled().sortedBy { it.salary }

    println("The highest paid worker: ${shuffledList.maxBy { it.salary }}")
    println("The highest paid worker: ${shuffledList.minBy { it.salary }}")

    val averageSalary = shuffledList.sumOf { it.salary }/shuffledList.count()
    println("Average salary: $averageSalary")
}