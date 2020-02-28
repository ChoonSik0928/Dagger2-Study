package com.choonsik.dagger2_example.example_step_two.cafe_app.component

import com.choonsik.dagger2_example.example_step_two.cafe_app.annotation.CoffeeScope
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeCoffeeMaker
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CoffeeBean
import com.choonsik.dagger2_example.example_step_two.cafe_app.module.CoffeeBeanModule
import com.choonsik.dagger2_example.example_step_two.cafe_app.module.CoffeeModule
import dagger.Subcomponent

@CoffeeScope
@Subcomponent(modules = [CoffeeModule::class, CoffeeBeanModule::class])
interface CafeCoffeeComponent{
    fun cafeCoffeeMaker() : CafeCoffeeMaker

    fun coffeeBean(): CoffeeBean

    fun coffeeBeanMap(): Map<String, CoffeeBean>

    @Subcomponent.Builder
    interface Builder{
        fun coffeeModule(coffeeModule: CoffeeModule): Builder

        fun build(): CafeCoffeeComponent
    }
}