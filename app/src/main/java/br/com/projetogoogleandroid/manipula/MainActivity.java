package br.com.projetogoogleandroid.manipula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Buscando o Widget Btn no XML
        Button botaoLogar = (Button) findViewById(R.id.btLogar);

        //Evento do Botao Logar...
        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Buscando os Widgets no XML
                EditText tNome = (EditText) findViewById(R.id.edNome);
                EditText tSenha = (EditText) findViewById(R.id.edSenha);


                // Passando para variaveis...
                String nome = tNome.getText().toString();
                String senha = tSenha.getText().toString();

                if ("Heitor".equals(nome) && "123".equals(senha)) {

                    Toast.makeText(getApplicationContext(), "Acesso Permitido", Toast.LENGTH_SHORT).show();

                    Intent it = new Intent(getApplicationContext(), BemVindoActivity.class);
                    Bundle params = new Bundle();
                    params.putString("nome", "Heitor Silva de Oliveira ");
                    it.putExtras(params);
                    startActivity(it);

                } else
                    Toast.makeText(getApplicationContext(), "Acesso Negado", Toast.LENGTH_SHORT).show();

            }
        });


    }
}
