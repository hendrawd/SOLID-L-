package io.github.hendrawd.solid

import io.github.hendrawd.solid.example.liskov.ContractEmployee
import io.github.hendrawd.solid.example.liskov.IEmployee
import io.github.hendrawd.solid.example.liskov.PermanentEmployee
import io.github.hendrawd.solid.example.liskov.TemporaryEmployee
import org.junit.Test

class LiskovTest {
    @Test
    fun liskovTest() {
        val employeeList = listOf<IEmployee>(
            PermanentEmployee(1, "Iznan", 100_000_000.0),
            TemporaryEmployee(2, "Hendra", 1_000.0),
            ContractEmployee(3, "Imam", 10_000_000.0)
        )

        employeeList.forEachIndexed { index, iEmployee ->
            println("Employee - $index, salary: ${iEmployee.getSalary()}")
        }
    }
}