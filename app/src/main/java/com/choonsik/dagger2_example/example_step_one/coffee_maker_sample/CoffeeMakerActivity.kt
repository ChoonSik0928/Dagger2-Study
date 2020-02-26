package com.choonsik.dagger2_example.example_step_one.coffee_maker_sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.choonsik.dagger2_example.R
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.component.DaggerCoffeeShopComponent
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.CoffeeMaker
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.ElectricHeater
import com.choonsik.dagger2_example.example_step_one.coffee_maker_sample.model.Thermosiphon

class CoffeeMakerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_maker)

        val outPutTextView = findViewById<TextView>(R.id.output)
//        showWithDagger(outPutTextView)
        showWithoutDagger(outPutTextView)
//        showWithCustomInjection(outPutTextView)
    }

    private fun showWithDagger(textView: TextView){
        val coffeeShop = DaggerCoffeeShopComponent.builder().build()
        textView.text = coffeeShop.maker().brew()
    }

    fun showWithoutDagger(textView: TextView){
        val heater = ElectricHeater()
        val pump = Thermosiphon(heater)
        val coffeeMaker = CoffeeMaker(heater, pump)
        textView.text = coffeeMaker.brew()
    }

    fun showWithCustomInjection(textView: TextView){
        val coffeeMaker = WithoutDaggerInjection.provideCoffeeMaker()
        textView.text = coffeeMaker.brew()
    }
}