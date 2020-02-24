package com.choonsik.dagger2_example.example_step_one.coffe_sample.model

import javax.inject.Inject


class CoffeeMaker
@Inject constructor(
    private val heater: Heater,
    private val pump: Pump
) {

    fun brew(): String {
        return heater.on() + "\n" +
                pump.pump() + "\n" +
                " [_]P coffee! [_]P " + "\n" +
                heater.off() + "\n"
    }
}