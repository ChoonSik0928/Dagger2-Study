package com.choonsik.dagger2_example.example_step_two.cafe_app.module

import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.ElectricHeater
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.Heater
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeCoffeeMaker
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CoffeeBean
import dagger.Module
import dagger.Provides

@Module
class CoffeeModule {

    @Provides
    fun provideCoffeeMaker(heater: Heater): CafeCoffeeMaker {
        return CafeCoffeeMaker(heater)
    }

    @Provides
    fun provideHeater(): Heater {
        return ElectricHeater()
    }

    @Provides
    fun provideCoffeeBean(): CoffeeBean {
        return CoffeeBean()
    }
}