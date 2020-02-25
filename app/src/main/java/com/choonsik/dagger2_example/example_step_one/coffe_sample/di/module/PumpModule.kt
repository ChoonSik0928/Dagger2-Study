package com.choonsik.dagger2_example.example_step_one.coffe_sample.di.module

import com.choonsik.dagger2_example.example_step_one.coffe_sample.model.Thermosiphon
import com.choonsik.dagger2_example.example_step_one.coffe_sample.model.Pump
import dagger.Binds
import dagger.Module

@Module
abstract class PumpModule {
    @Binds
    abstract fun providePump(pump: Thermosiphon): Pump
}