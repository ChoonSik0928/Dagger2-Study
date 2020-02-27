package com.choonsik.dagger2_example.example_step_two.cafe_app.module

import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.ElectricHeater
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.Heater
import com.choonsik.dagger2_example.example_step_two.cafe_app.component.CafeCoffeeComponent
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeCoffeeMaker
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CafeCoffeeComponent::class])
class CafeModule {

    @Singleton
    @Provides
    fun provideCafeInfo(): CafeInfo{
        return CafeInfo()
    }
}
