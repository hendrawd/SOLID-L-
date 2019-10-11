package io.github.hendrawd.solid

import io.github.hendrawd.solid.example.notliskov.ContractEmployee
import io.github.hendrawd.solid.example.notliskov.Employee
import io.github.hendrawd.solid.example.notliskov.PermanentEmployee
import io.github.hendrawd.solid.example.notliskov.TemporaryEmployee
import org.junit.Test

class NotLiskovTest {
    @Test
    fun notLiskovTest() {
        val employeeList = listOf<Employee>(
            PermanentEmployee(1, "Iznan", 100_000_000.0),
            TemporaryEmployee(2, "Hendra", 1_000.0),
            ContractEmployee(3, "Imam", 10_000_000.0)
        )

        employeeList.forEach {
            println("${it.name}, salary: ${it.salary}, bonus: ${it.getBonus()}")
        }
    }
}