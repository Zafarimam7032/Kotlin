package com.kotlin.SpringBootProjectUsingKotlin.controller

import com.kotlin.SpringBootProjectUsingKotlin.service.EmployeeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController constructor(val employeeService: EmployeeService) {

      private  lateinit  var  employeeService1  : EmployeeService;

    @GetMapping("/add/{num}/{num1}")
    fun addNumner(@PathVariable("num") num: Int , @PathVariable("num1") num1 : Int) : ResponseEntity<Int>{

       val result  = employeeService.add(num,num1);
        return ResponseEntity.ok(result)
    }

    @GetMapping("/mul/{num}/{num1}")
    fun mul(@PathVariable("num") num: Int , @PathVariable("num1") num1: Int) : ResponseEntity<Int> {
        val result  = employeeService.mul(num,num1);
        return ResponseEntity.ok(result)
    }
}