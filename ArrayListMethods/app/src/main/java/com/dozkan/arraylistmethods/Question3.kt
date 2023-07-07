package com.dozkan.arraylistmethods

fun main() {
    data class Student(val name: String, val age: Int, val school: String)

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    val oldestStudent = students.maxByOrNull { it.age }
    println("The oldest student: ${oldestStudent?.name}\nIndexed at: ${students.indexOf(oldestStudent)}")

    val youngestStudent = students.minByOrNull { it.age }
    println("The youngest student: ${youngestStudent?.name}\nIndexed at: ${students.indexOf(youngestStudent)}")

    val universityAStudents = students.filter { it.school.equals("Üniversite A") }
    println("Students who are older than 25: ${universityAStudents.filter { it.age > 25 }.map { it.name }}")
    println("Students who are younger than 25 ${universityAStudents.filter { it.age < 25 }.map { it.name }}")
}