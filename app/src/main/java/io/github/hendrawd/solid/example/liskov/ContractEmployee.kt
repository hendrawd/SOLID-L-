package io.github.hendrawd.solid.example.liskov

class ContractEmployee(
    val id: Long,
    val name: String,
    private val salary: Double
) : IEmployee {
    override fun getSalary(): Double {
        return salary
    }
}