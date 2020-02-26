package com.choonsik.dagger2_example.example_step_two.cafe_app.model

class CafeInfo(var name: String = ""){
    fun welcome(): String{
        return "Welcome $name"
    }
}