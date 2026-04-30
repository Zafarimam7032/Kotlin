package com.kotlin.SpringBootProjectUsingKotlin

import com.zafar.java.EmployeeController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.zafar","com.kotlin"])
class SpringBootProjectUsingKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringBootProjectUsingKotlinApplication>(*args)
}
