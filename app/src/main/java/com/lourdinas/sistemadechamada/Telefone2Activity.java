package com.lourdinas.sistemadechamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Telefone2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefone2);
        final TextView displayConta = (TextView) findViewById(R.id.chamada);

        final Button btn0 = (Button) findViewById(R.id.btn_zero);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnasterisco = (Button) findViewById(R.id.btn_asterisco);
        final Button btnjdv = (Button) findViewById(R.id.btn_jdv);
        final Button btnlimpar = (Button) findViewById(R.id.btnclear);

    }

}
