package com.uvg.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMult.setOnClickListener {
            val multiplicacion:Intent = Intent(this, MainActivity2::class.java)
            startActivity(multiplicacion)
        }

        btnSum.setOnClickListener {
            val suma:Intent = Intent(this, MainActivity3::class.java)
            startActivity(suma)
        }

        btnRes.setOnClickListener {
            val resta:Intent = Intent(this, MainActivity4::class.java)
            startActivity(resta)
        }

        btnDiv.setOnClickListener {
            val division:Intent = Intent(this, MainActivity5::class.java)
            startActivity(division)
        }

    }
}