package com.uvg.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        btnDivision.setOnClickListener {
            val divi1 = div1.text.toString()

            val divi2 = div2.text.toString()

            val calc =  Calcu()

            val resultado = calc.calculo(divi1, divi2, 4)

            val resp = "El resultado es: " + resultado

            txtres4.text = resp
        }

        btnreg4.setOnClickListener {
            finish()
        }
    }
}