package tavares.samara.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Método onCreate que é chamado quando a atividade é criada
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent i = getIntent(); // Obtém o Intent do começo
        String textoDigitado = i.getStringExtra("texto"); //Obtém o texto extra passado pelo Intent
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(textoDigitado); //seta o texto no campo de texto
    }
}