package br.com.projetogoogleandroid.manipula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class BemVindoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);

        // Recebe o nome enviado por parametro
        Bundle args = getIntent().getExtras();
        String nome = args.getString("nome");

        //Vamos atualizar o Texto do TextView com uma msg de bem vindo...
        TextView text = (TextView) findViewById(R.id.label);
        text.setText(nome + " Seja Bem vindo.");

        // Adiciona o Botao "up navigation"...
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == android.R.id.home) {
            // o metodo finish() vai encerrar essa activity...
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
