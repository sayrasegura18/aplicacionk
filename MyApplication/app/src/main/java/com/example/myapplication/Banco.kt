package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Banco : AppCompatActivity() {

    private lateinit var textViewSaldo: TextView
    private lateinit var editTextMonto: EditText
    private var saldo = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewSaldo = findViewById(R.id.textViewSaldo)
        editTextMonto = findViewById(R.id.editTextMonto)

        val buttonRetirar = findViewById<Button>(R.id.buttonRetirar)
        val buttonConsignar = findViewById<Button>(R.id.buttonConsignar)

        actualizarSaldo()

        buttonRetirar.setOnClickListener { realizarRetiro() }
        buttonConsignar.setOnClickListener { realizarConsignacion() }
    }

    private fun realizarRetiro() {
        val monto = editTextMonto.text.toString().toDoubleOrNull()
        if (monto != null && monto > 0 && saldo >= monto) {
            saldo -= monto
            actualizarSaldo()
            editTextMonto.text.clear()
        } else {

        }
    }

    private fun realizarConsignacion() {
        val monto = editTextMonto.text.toString().toDoubleOrNull()
        if (monto != null && monto > 0) {
            saldo += monto
            actualizarSaldo()
            editTextMonto.text.clear()
        } else {

        }
    }

    private fun actualizarSaldo() {
        textViewSaldo.text = "Saldo Actual: $$saldo"
    }
}
