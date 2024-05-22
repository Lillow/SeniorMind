package com.example.seniormind // Replace with your package name

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity // Import AppCompatActivity

class TarefasActivity : AppCompatActivity() { // Use AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarefas) // Replace with your layout

        // Get references to UI elements
        val nomeTarefaEditText = findViewById<EditText>(R.id.nomeTarefaEditText)
        val descricaoTarefaEditText = findViewById<EditText>(R.id.descricaoTarefaEditText)
        val adicionarTarefaButton = findViewById<Button>(R.id.adicionarTarefaButton)

        // Set click listener for Adicionar Tarefa button
        adicionarTarefaButton.setOnClickListener {
            val nomeTarefa = nomeTarefaEditText.text.toString()
            val descricaoTarefa = descricaoTarefaEditText.text.toString()

            if (nomeTarefa.isEmpty() || descricaoTarefa.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
            } else {
                // Save task data (e.g., to a database or shared preferences)
                // Display a message indicating successful addition
            }
        }
    }
}
