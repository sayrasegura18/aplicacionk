package com.example.myapplication
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AdivinaLaPalabraActivity : AppCompatActivity() {

    private lateinit var textViewLetras: TextView
    private lateinit var editTextLetra: EditText
    private lateinit var buttonAdivinar: Button

    private val palabraSecreta = "ANDROID"
    private val letraInicial = palabraSecreta[0]
    private val letraFinal = palabraSecreta[palabraSecreta.length - 1]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiry_adivinapalabra)

        textViewLetras = findViewById(R.id.textViewLetras)
        editTextLetra = findViewById(R.id.editTextLetra)
        buttonAdivinar = findViewById(R.id.buttonAdivinar)

        val letrasMostradas = "Letra inicial: $letraInicial, Letra final: $letraFinal"
        textViewLetras.text = letrasMostradas

        buttonAdivinar.setOnClickListener {
            val letra = editTextLetra.text.toString().uppercase().getOrNull(0)
            if (letra != null) {
                adivinarLetra(letra)
                editTextLetra.text.clear()
            }
        }
    }

    private fun adivinarLetra(letra: Char) {
        if (letra == letraInicial && letra == letraFinal) {
            textViewLetras.text = "¡Has ganado! La palabra es '$palabraSecreta'"
            editTextLetra.isEnabled = false
            buttonAdivinar.isEnabled = false
        } else {
            // Letra incorrecta
            textViewLetras.text = "¡Inténtalo de nuevo! Letra inicial: $letraInicial, Letra final: $letraFinal"
        }
    }
}

