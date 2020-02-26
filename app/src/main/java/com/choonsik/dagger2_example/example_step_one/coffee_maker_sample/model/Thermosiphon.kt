package com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model

import javax.inject.Inject

class Thermosiphon @Inject
constructor(private val heater: Heater) : Pump {

    override fun pump(): String {
        return if (heater.isHot) {
            "=> => pumping => =>"
        } else {
            ""
        }
    }
}