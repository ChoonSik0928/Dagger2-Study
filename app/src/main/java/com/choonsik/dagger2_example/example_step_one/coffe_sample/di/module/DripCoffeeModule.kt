package com.choonsik.dagger2_example.example_step_one.coffe_sample.di.module

import com.choonsik.dagger2_example.example_step_one.coffe_sample.model.ElectricHeater
import com.choonsik.dagger2_example.example_step_one.coffe_sample.model.Heater
import dagger.Module
import javax.inject.Singleton
import dagger.Provides

@Module(includes = [PumpModule::class])
internal class DripCoffeeModule {
    @Provides
    @Singleton
    fun provideHeater(): Heater {
        return ElectricHeater()
    }
}