package com.choonsik.dagger2_example.example_step_two.cafe_app

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.choonsik.dagger2_example.R
import com.choonsik.dagger2_example.example_step_two.cafe_app.component.DaggerCafeComponent

class CafeActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafe)
        showUseScope()
//        val cafeComponent =
    }

    fun showUseScope(){
        val cafeComponent = DaggerCafeComponent.create()
        val cafeInfo1 = cafeComponent.cafeInfo()
        val cafeInfo2 = cafeComponent.cafeInfo()

        val output = findViewById<TextView>(R.id.test)
        output.text = "Singleton scope CafeInfo is equal : " + (cafeInfo1 == cafeInfo2)

    }
}