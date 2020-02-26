package com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model

import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CoffeeBean
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