package com.kotlin.SpringBootProjectUsingKotlin

import com.kotlin.SpringBootProjectUsingKotlin.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : JpaRepository<User, Int> {
}