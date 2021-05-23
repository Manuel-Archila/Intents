package com.uvg.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnMulti.setOnClickListener {
            val multiplicando1 = mult1.text.toString()

            val multiplicando2 = mult2.text.toString()

            val calc =  Calcu()

            val resultado = calc.calculo(multiplicando1, multiplicando2, 1)

            val resp = "El resultado es: " + resultado

            txtres.text = resp
        }

        btnreg1.setOnClickListener {
            finish()
        }
    }

}