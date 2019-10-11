package io.github.hendrawd.solid.example.notliskov

import java.lang.IllegalArgumentException

class ContractEmployee(id: Long, name: String, salary: Double) : Employee(id, name, salary) {
    override fun getBonus(): Double {
        throw IllegalArgumentException("Contact employee doesn't get bonus!")
    }
}