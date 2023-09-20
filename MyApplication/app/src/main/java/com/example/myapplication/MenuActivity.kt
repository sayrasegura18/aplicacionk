package com.example.myapplication
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_menu)

        val buttonCalculadora = findViewById<ImageButton>(R.id.buttonCalculadora)
        val buttonBanco = findViewById<ImageButton>(R.id.buttonBanco)
        val buttonAdivinaPalabra = findViewById<ImageButton>(R.id.buttonAdivinaPalabra)

        buttonCalculadora.setOnClickListener {
            val intent = Intent(this, Calculadora::class.java)
            startActivity(intent)
        }

        buttonBanco.setOnClickListener {

            val intent = Intent(this, Banco::class.java)
            startActivity(intent)
        }

        buttonAdivinaPalabra.setOnClickListener {

            val intent = Intent(this, AdivinaLaPalabraActivity::class.java)
            startActivity(intent)
        }
    }
}

