package tavares.samara.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//a classe main activity é a main pricipal da aplicacao

public class MainActivity extends AppCompatActivity {

    @Override //No método onCreate(), o layout definido em activity_main.xml é inflado usando setContentView()
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Constroi os elementos de interface
        Button btnEnviar = findViewById(R.id.btnEnviar);//Obtem o botao atraves do is do botao enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { //define o que acontece quando se pressiona o botao
           @Override
            public void onClick(View v) { //E executado quando o botao e pressionado
               EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i =new Intent(MainActivity.this,NewActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);
            }
        });
    }
}