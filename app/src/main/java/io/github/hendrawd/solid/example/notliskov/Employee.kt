package io.github.hendrawd.solid.example.notliskov

abstract class Employee(val id: Long, val name: String, val salary: Double) {
    init {
        require(salary >= 0) { "Salary must higher than 0" }
    }

    abstract fun getBonus(): Double
}