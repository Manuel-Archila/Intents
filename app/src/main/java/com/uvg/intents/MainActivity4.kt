package com.uvg.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        btnResta.setOnClickListener {
            val sust1 = sus1.text.toString()

            val sust2 = sus2.text.toString()

            val calc =  Calcu()

            val resultado = calc.calculo(sust1, sust2, 3)

            val resp = "El resultado es: " + resultado

            txtres3.text = resp
        }
    }
}