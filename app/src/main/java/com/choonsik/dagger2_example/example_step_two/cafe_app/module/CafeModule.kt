package com.choonsik.dagger2_example.example_step_two.cafe_app.module

import com.choonsik.dagger2_example.example_step_two.cafe_app.component.CafeCoffeeComponent
import com.choonsik.dagger2_example.example_step_two.cafe_app.model.CafeInfo
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CafeCoffeeComponent::class])
class CafeModule {

    var name: String

    constructor(){
        name = ""
    }
    constructor(name: String){
        this.name =  name
    }

    @Singleton
    @Provides
    fun provideCafeInfo(): CafeInfo {
        return if (name.isEmpty())
            CafeInfo()
        else
            CafeInfo(name)
    }
}
