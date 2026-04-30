package com.kotlin.SpringBootProjectUsingKotlin.service

import org.springframework.stereotype.Service

@Service
class DemoService {

    fun display() :String{
        return "this is from DemoService";
    }
}