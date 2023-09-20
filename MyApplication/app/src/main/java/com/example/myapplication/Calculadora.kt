package com.example.myapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

class Calculadora : AppCompatActivity() {

    private lateinit var editTextTextNum: EditText
    private lateinit var SegundoNumero: EditText
    private lateinit var textViewResultado: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextTextNum = findViewById(R.id.editTextTextNum)
        SegundoNumero = findViewById(R.id.SegundoNumero)
        textViewResultado = findViewById(R.id.textViewResultado)

        val buttonSuma = findViewById<Button>(R.id.buttonSuma)
        val buttonResta = findViewById<Button>(R.id.buttonResta)
        val buttonMultiplicacion = findViewById<Button>(R.id.buttonMultiplicacion)
        val buttonDivision = findViewById<Button>(R.id.buttonDivision)
        val buttonCoseno = findViewById<Button>(R.id.buttoncoseno)
        val buttonSeno = findViewById<Button>(R.id.buttonseno)
        val buttonTangente = findViewById<Button>(R.id.buttonTangente)

        buttonSuma.setOnClickListener { realizarOperacion("+") }
        buttonResta.setOnClickListener { realizarOperacion("-") }
        buttonMultiplicacion.setOnClickListener { realizarOperacion("*") }
        buttonDivision.setOnClickListener { realizarOperacion("/") }
        buttonCoseno.setOnClickListener { realizarOperacion("cos") }
        buttonSeno.setOnClickListener { realizarOperacion("sin") }
        buttonTangente.setOnClickListener { realizarOperacion("tan") }
    }

    private fun realizarOperacion(operacion: String) {
        val numero1 = editTextTextNum.text.toString().toDouble()
        val numero2 = SegundoNumero.text.toString().toDouble()
        var resultado = 0.0

        when (operacion) {
            "+" -> resultado = numero1 + numero2
            "-" -> resultado = numero1 - numero2
            "*" -> resultado = numero1 * numero2
            "/" -> resultado = numero1 / numero2
            "cos" -> resultado = cos(numero1)
            "sin" -> resultado = sin(numero1)
            "tan" -> resultado = tan(numero1)
        }

        textViewResultado.text = "Resultado: $resultado"
    }
}

