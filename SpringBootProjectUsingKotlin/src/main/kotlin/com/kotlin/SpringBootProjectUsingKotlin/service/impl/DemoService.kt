package com.kotlin.SpringBootProjectUsingKotlin.service.impl

import org.springframework.stereotype.Service

@Service
class DemoService {

    fun display() :String{
        return "this is from DemoService";
    }
}