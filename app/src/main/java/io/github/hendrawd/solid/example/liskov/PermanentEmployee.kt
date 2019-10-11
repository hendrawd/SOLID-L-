package io.github.hendrawd.solid.example.liskov

class PermanentEmployee(
    val id: Long,
    val name: String,
    private val salary: Double
) : IEmployee, IEmployeeBonus {
    override fun getSalary(): Double {
        return salary
    }

    override fun getBonus(): Double {
        return salary
    }
}