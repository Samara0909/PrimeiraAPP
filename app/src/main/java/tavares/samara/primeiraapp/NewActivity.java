package tavares.samara.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent i = getIntent();
        String textoDigitado = i.getStringExtra("texto");
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(textoDigitado);
    }
}