package com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model

internal class ElectricHeater : Heater {
    override var isHot: Boolean = false

    override fun on():String {
        this.isHot = true
        return "-- on -- ~ ~ ~ heating ~ ~ ~"
    }

    override fun off():String {
        this.isHot = false
        return "--off--"
    }
}