package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNombre = findViewById<EditText>(R.id.editTextNombre)
        val editTextContraseña = findViewById<EditText>(R.id.editTextContraseña)
        val buttonIniciar = findViewById<Button>(R.id.buttonIniciar)
        val textViewNombre = findViewById<TextView>(R.id.textViewNombre)
        val textViewContraseña = findViewById<TextView>(R.id.textViewContraseña)

        buttonIniciar.setOnClickListener {
            val nombre = editTextNombre.text.toString()
            val contraseña = editTextContraseña.text.toString()



            if (nombre == "usuario" && contraseña == "contraseña") {
                val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                textViewNombre.text = "Nombre o contraseña incorrectos"
                textViewContraseña.text = ""
            }
        }
    }
}
