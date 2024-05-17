import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.seniormind.CadastroActivity
import com.example.seniormind.MedicamentosActivity
import com.example.seniormind.R
import com.example.seniormind.TarefasActivity



class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referências dos botões
        val buttonCadastro = findViewById<Button>(R.id.button_cadastro)
        val buttonMedicamentos = findViewById<Button>(R.id.button_medicamentos)
        val buttonTarefas = findViewById<Button>(R.id.button_tarefas)

        // Botões (clique)
        buttonCadastro.setOnClickListener {
            // Activity de Cadastro
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        buttonMedicamentos.setOnClickListener {
            // Activity de Medicamentos
            val intent = Intent(this, MedicamentosActivity::class.java)
            startActivity(intent)
        }

        buttonTarefas.setOnClickListener {
            // Activity de Tarefas
            val intent = Intent(this, TarefasActivity::class.java)
            startActivity(intent)
        }
    }
}