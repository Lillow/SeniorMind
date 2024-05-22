package com.example.seniormind

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)


        val nomeEditText = findViewById<EditText>(R.id.nomeEditText)
        val idadeEditText = findViewById<EditText>(R.id.idadeEditText)
        val cadastrarButton = findViewById<Button>(R.id.cadastrarButton)


        cadastrarButton.setOnClickListener {
            val nome = nomeEditText.text.toString()
            val idade = idadeEditText.text.toString().toIntOrNull()

            if (nome.isEmpty() || idade == null) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
            }
        }
    }
}