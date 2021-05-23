package com.uvg.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btnSuma.setOnClickListener {
            val sumando1 = sum1.text.toString()

            val sumando2 = sum2.text.toString()

            val calc =  Calcu()

            val resultado = calc.calculo(sumando1, sumando2, 2)

            val resp = "El resultado es: " + resultado

            txtres2.text = resp
        }

        btnreg2.setOnClickListener {
            finish()
        }
    }
}