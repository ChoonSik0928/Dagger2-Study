package com.choonsik.dagger2_example.example_step_one.coffe_sample.component

import com.choonsik.dagger2_example.example_step_one.coffe_sample.di.module.DripCoffeeModule
import com.choonsik.dagger2_example.example_step_one.coffe_sample.model.CoffeeMaker
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DripCoffeeModule::class])
interface CoffeeShopComponent {
    fun maker(): CoffeeMaker
}