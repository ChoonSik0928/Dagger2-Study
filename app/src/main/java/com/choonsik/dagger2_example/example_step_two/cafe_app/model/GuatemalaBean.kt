package com.choonsik.dagger2_example.example_step_two.cafe_app.model

import javax.inject.Inject

class GuatemalaBean @Inject constructor(): CoffeeBean() {


    override fun name(): String {
        return "GuatemalaBean"
    }
}