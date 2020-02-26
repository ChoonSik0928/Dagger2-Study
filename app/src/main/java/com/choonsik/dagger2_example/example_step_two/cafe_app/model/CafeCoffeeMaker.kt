package com.choonsik.dagger2_example.example_step_two.cafe_app.model

import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.Heater
import javax.inject.Inject

class CafeCoffeeMaker
@Inject constructor(private val heater: Heater)
{
    fun brew(coffeeBean: CoffeeBean): String{
        return "CoffeeBeen($coffeeBean) [_]P coffee! [_]P "
    }
}