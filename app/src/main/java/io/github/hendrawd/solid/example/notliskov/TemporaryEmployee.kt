package io.github.hendrawd.solid.example.notliskov

class TemporaryEmployee(id: Long, name: String, salary: Double) : Employee(id, name, salary) {
    override fun getBonus(): Double {
        return salary / 2
    }
}