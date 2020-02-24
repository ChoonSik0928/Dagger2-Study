package com.choonsik.dagger2_example.example_step_one.coffe_sample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.choonsik.dagger2_example.R
import com.choonsik.dagger2_example.example_step_one.coffe_sample.component.DaggerCoffeeShopComponent

class CoffeeMakerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee_maker)
        var coffeeShop = DaggerCoffeeShopComponent.builder().build()

        var outPutTextView = findViewById<TextView>(R.id.output)
        outPutTextView.text = coffeeShop.maker().brew()
    }
}