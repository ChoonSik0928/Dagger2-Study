package com.choonsik.dagger2_example.example_step_two.cafe_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.choonsik.dagger2_example.example_step_two.cafe_app.component.CafeCoffeeComponent
import com.choonsik.dagger2_example.example_step_two.cafe_app.component.CafeComponent
import com.choonsik.dagger2_example.example_step_two.cafe_app.component.DaggerCafeComponent
import kotlinx.android.synthetic.main.activity_cafe.*
import com.choonsik.dagger2_example.example_step_two.cafe_app.module.CafeModule
import android.util.Log
import com.choonsik.dagger2_example.R

class CafeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe)

        val cafeComponent = DaggerCafeComponent.create()
//        showWithSingletonScope(cafeComponent)
//        showWithCoffeeScope(cafeComponent)
//        showNonScopeResult(cafeComponent)
//        showWithBinder()
//        showEncapsulate(cafeComponent)
        showWithInfoMap(cafeComponent)
    }


    /**
     * 코드 참고
     * @see javax.inject.Scope @Scope
     */
    private fun showWithSingletonScope(cafeComponent: CafeComponent) {
        val cafeInfo1 = cafeComponent.cafeInfo()
        val cafeInfo2 = cafeComponent.cafeInfo()

        output.text = "Singleton scope CafeInfo is equal : " + (cafeInfo1 == cafeInfo2)
    }

    private fun showWithCoffeeScope(cafeComponent: CafeComponent) {
        var outputData = ""

        val coffeeComponent1: CafeCoffeeComponent = cafeComponent.coffeeComponent().build()
        val coffeeComponent2: CafeCoffeeComponent = cafeComponent.coffeeComponent().build()

        val coffeeMaker1 = coffeeComponent1.cafeCoffeeMaker()
        val coffeeMaker2 = coffeeComponent1.cafeCoffeeMaker()

        outputData =
            "Maker scope / same component coffeeMaker is equal : " + (coffeeMaker1 == coffeeMaker2)

        val coffeeMaker3 = coffeeComponent2.cafeCoffeeMaker()

        outputData += "\nMaker scope / different component coffeeMaker is equal : " + (coffeeMaker1 == coffeeMaker3)

        output.text = outputData
    }

    private fun showNonScopeResult(cafeComponent: CafeComponent) {
        val coffeeComponent: CafeCoffeeComponent = cafeComponent.coffeeComponent().build()
        val coffeeBean1 = coffeeComponent.coffeeBean()
        val coffeeBean2 = coffeeComponent.coffeeBean()

        output.text = "Non-scoped coffeeBean is equal : " + (coffeeBean1 == coffeeBean2)
    }

    private fun showWithBinder() {
        val cafeComponent = DaggerCafeComponent.builder()
            .cafeModule(CafeModule("example cafe"))
            .build()
        output.text = cafeComponent.cafeInfo().welcome()
    }

    private fun showEncapsulate(cafeComponent: CafeComponent) {
        val coffeeComponent = cafeComponent.coffeeComponent().build()

        output.text = coffeeComponent.cafeCoffeeMaker().brew(coffeeComponent.coffeeBean())
    }

    private fun showWithInfoMap(cafeComponent: CafeComponent) {
        val coffeeComponent = cafeComponent.coffeeComponent().build()
        output.text = coffeeComponent.coffeeBeanMap()["guatemala"]!!.name()
    }
}