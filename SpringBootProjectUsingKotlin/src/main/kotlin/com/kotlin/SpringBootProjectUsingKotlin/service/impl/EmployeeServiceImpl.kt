package com.kotlin.SpringBootProjectUsingKotlin.service.impl

import com.kotlin.SpringBootProjectUsingKotlin.service.EmployeeService
import org.springframework.stereotype.Service

@Service
class EmployeeServiceImpl : EmployeeService {
    override fun add(num: Int, num1: Int): Int {
        return num + num1;
    }

    override fun mul(num: Int, num1: Int): Int {
        return num * num1;
    }
}