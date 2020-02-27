package com.choonsik.dagger2_example.example_step_two.cafe_app.component

import com.choonsik.dagger2_example.example_step_two.cafe_app.annotation.CoffeeScope
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeCoffeeMaker
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CoffeeBean
import com.choonsik.dagger2_example.example_step_two.cafe_app.module.CoffeeModule
import dagger.Subcomponent

@CoffeeScope
@Subcomponent(modules = [CoffeeModule::class])
interface CafeCoffeeComponent{
    fun cafeCoffeeMaker() : CafeCoffeeMaker

    fun coffeeBean(): CoffeeBean

    @Subcomponent.Builder
    interface Builder{
        fun build(): CafeCoffeeComponent
    }
}