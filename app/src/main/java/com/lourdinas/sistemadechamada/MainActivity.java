package com.lourdinas.sistemadechamada;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SharedPreferences meusDados;
    public  static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meusDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        Button btnlogin = findViewById(R.id.btn_Login);
        TextView btnregistrar = findViewById(R.id.txt_registrar);
        EditText email = findViewById(R.id.edt_email);
        EditText senha = findViewById(R.id.edt_senha);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}