package com.kotlin.SpringBootProjectUsingKotlin.controller

import com.kotlin.SpringBootProjectUsingKotlin.model.Employee
import com.kotlin.SpringBootProjectUsingKotlin.service.impl.DemoService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController constructor(private val demoService: DemoService) {

    private val logger : Logger = LoggerFactory.getLogger(this.javaClass)


    @GetMapping("/demo")
    fun display() : String{
        return demoService.display()
    }

    @GetMapping(path= ["/message/{mess}"])
    fun show(@PathVariable("mess") message :String) : String {
        return "Hello World! $message"
    }

    @GetMapping(path = ["/http"])
    fun handleHttpResponse(): ResponseEntity<String> {
        try{
            logger.info("Hello World!")
            return ResponseEntity.ok("Hello World!")
        }catch (e : Exception){
            return ResponseEntity.badRequest().body(e.message)
        }
    }

    @GetMapping("/employee")
    fun getEmployee() : ResponseEntity<Employee> {
        val employee = Employee("Zafar",28,"hcltech");
        return ResponseEntity.ok(employee)
    }
}