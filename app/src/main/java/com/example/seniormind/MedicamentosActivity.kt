package com.example.seniormind // Replace with your package name

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity // Import AppCompatActivity

class MedicamentosActivity : AppCompatActivity() { // Use AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medicamentos) // Replace with your layout

        // Get references to UI elements
        val nomeMedicamentoEditText = findViewById<EditText>(R.id.nomeMedicamentoEditText)
        val horarioMedicamentoEditText = findViewById<EditText>(R.id.horarioMedicamentoEditText)
        val adicionarMedicamentoButton = findViewById<Button>(R.id.adicionarMedicamentoButton)

        // Set click listener for Adicionar Medicamento button
        adicionarMedicamentoButton.setOnClickListener {
            val nomeMedicamento = nomeMedicamentoEditText.text.toString()
            val horarioMedicamento = horarioMedicamentoEditText.text.toString()

            if (nomeMedicamento.isEmpty() || horarioMedicamento.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                // Save medication data (e.g., to a database or shared preferences)
                // Display a message indicating successful addition
            }
        }
    }
}
