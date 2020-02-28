package com.choonsik.dagger2_example.example_step_two.cafe_app.module

import com.choonsik.dagger2_example.example_step_two.cafe_app.model.GuatemalaBean
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CoffeeBean
import dagger.multibindings.StringKey
import dagger.multibindings.IntoMap
import dagger.Binds
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.EthiopiaBean
import dagger.Module


@Module
abstract class CoffeeBeanModule {

    @Binds
    internal abstract fun provideCoffeeBean(ethiopiaBean: EthiopiaBean): CoffeeBean

    @Binds
    @IntoMap
    @StringKey("ethiopia")
    internal abstract fun provideEthiopiaBean(ethiopiaBean: EthiopiaBean): CoffeeBean


    @Binds
    @IntoMap
    @StringKey("guatemala")
    internal abstract fun provideGuatemalaBean(guatemalaBean: GuatemalaBean): CoffeeBean
    // EthiopiaBean 처럼 @Provide method 를 제공하지 않아도 @Inject annotation을 이용해 Injectable 한 객체로 정의해도 bind 가능.

}