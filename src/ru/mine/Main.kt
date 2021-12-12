package ru.mine

import ru.mine.dto.Person

fun main() {
    val petr = Person(
        firstName = "Petr",
        lastName = "Ivanov",
        age = 35,
        city = "Moscow"
    )

    println(petr)

    val forUpdate = petr.copy(
        firstName = "Petya",
        lastName = "Sidorov",
        age = 40,
        city = "Sochi"
    )

    petr.firstName = forUpdate.firstName
    petr.lastName = forUpdate.lastName
    petr.age = forUpdate.age
    petr.city = forUpdate.city

    println(petr)
}