package com.example.contador

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private var contador = 0 // Variável para armazenar o valor do contador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val btnAumentar = findViewById<FloatingActionButton>(R.id.floatingActionButton1)
        val btnDiminuir = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

        btnAumentar.setOnClickListener {
            if (contador < 10) {
                contador++
                textView.text = contador.toString()
            }
        }

        btnDiminuir.setOnClickListener {
            if (contador > 0) {
                contador--
                textView.text = contador.toString()
            }
        }
    }
}