package com.choonsik.dagger2_example.example_step_two.cafe_app.component

import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeInfo
import com.choonsik.dagger2_example.example_step_two.cafe_app.module.CafeModule
import dagger.Component
import javax.inject.Singleton

@Component(modules = [CafeModule::class])
@Singleton
interface CafeComponent {
    fun cafeInfo(): CafeInfo
//    fun coffeeMaker(): CafeCoffeeMaker
    fun coffeeComponent(): CafeCoffeeComponent.Builder
}