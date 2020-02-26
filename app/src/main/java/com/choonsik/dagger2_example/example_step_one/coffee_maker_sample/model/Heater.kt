package com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model

interface Heater {
    val isHot: Boolean
    fun on(): String
    fun off(): String
}