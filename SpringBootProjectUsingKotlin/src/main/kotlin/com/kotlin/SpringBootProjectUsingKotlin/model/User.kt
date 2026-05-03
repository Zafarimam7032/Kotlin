package com.kotlin.SpringBootProjectUsingKotlin.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "usr")
class User (
            @Id @GeneratedValue(strategy = GenerationType.AUTO)
            var id : Int,
            var username:String,
            var password:String){

}