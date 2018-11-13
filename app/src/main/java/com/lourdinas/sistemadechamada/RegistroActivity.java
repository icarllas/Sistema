package com.lourdinas.sistemadechamada;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText novoEmail = findViewById(R.id.edt_newEmail);
        final EditText novaSenha = findViewById(R.id.edt_novasenha);
        final EditText confirmaSenha = findViewById(R.id.confirmarSenha);
        Button cadastrar = findViewById(R.id.btn_novo_cadastro);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (novaSenha.getText()toString().equals(confirmaSenha.getText().toString())) {

                    SharedPreferences.Editor editor = meusDados.edit();
                    editor.putString("email", novoEmail.getText().toString());
                    editor.putString("senha", novaSenha.getText().toString());

                    editor.commit();

                    Toast.makeText(getApplicationContext(),
                            "Dados salvos com sucesso!", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(RegistroActivity.this, MainActivity.class);
                    startActivity(Intent);
                    finish();

                } else {
                    Toast.makeText(getApplicationContext(),
                            "aS SENHAS NÃO CONFEREM", Toast.LENGTH_LONG);
                }
            }
        });

    }
}