package io.github.hendrawd.solid.example.notliskov

class PermanentEmployee(id: Long, name: String, salary: Double) : Employee(id, name, salary) {
    override fun getBonus(): Double {
        return salary
    }
}