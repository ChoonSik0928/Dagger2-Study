package com.choonsik.dagger2_example.example_step_one.coffee_maker_sample

import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.*
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.ElectricHeater

object WithoutDaggerInjection {

    fun provideHeater(): Heater {
        return ElectricHeater()
    }

    fun providePump(heater: Heater): Pump {
        return Thermosiphon(heater)
    }

    fun provideCoffeeMaker(): CoffeeMaker{
        val heater = provideHeater()
        val pump = providePump(heater)
        return CoffeeMaker(heater, pump)
    }

}