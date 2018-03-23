package com.hugopinto.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btna1;
    private Button btna2;
    private Button btna3;

    private Button btnb1;
    private Button btnb2;
    private Button btnb3;

    private Button btnr;

    private TextView tva;
    private TextView tvb;

    private int conta;
    private int contb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("basketball counter");

        btna1=(Button)findViewById(R.id.BA1);

        btna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tva=findViewById(R.id.CA);
                conta= Integer.parseInt(tva.getText().toString());
                conta=conta+1;
                tva.setText(conta+"");

            }
        });

        btna2=(Button)findViewById(R.id.BA2);

        btna2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tva=findViewById(R.id.CA);
                conta= Integer.parseInt(tva.getText().toString());
                conta=conta+2;
                tva.setText(conta+"");

            }
        });

        btna3=(Button)findViewById(R.id.BA3);

        btna3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tva=findViewById(R.id.CA);
                conta= Integer.parseInt(tva.getText().toString());
                conta=conta+3;
                tva.setText(conta+"");

            }
        });

        btnb1=(Button)findViewById(R.id.BB1);

        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvb=findViewById(R.id.CB);
                contb= Integer.parseInt(tvb.getText().toString());
                contb=contb+1;
                tvb.setText(contb+"");

            }
        });

        btnb2=(Button)findViewById(R.id.BB2);

        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvb=findViewById(R.id.CB);
                contb= Integer.parseInt(tvb.getText().toString());
                contb=contb+2;
                tvb.setText(contb+"");

            }
        });

        btnb3=(Button)findViewById(R.id.BB3);

        btnb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvb=findViewById(R.id.CB);
                contb= Integer.parseInt(tvb.getText().toString());
                contb=contb+3;
                tvb.setText(contb+"");

            }
        });

        btnr=(Button)findViewById(R.id.BR);

        btnr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvb=findViewById(R.id.CB);
                tva=findViewById(R.id.CA);
                contb= 0;
                conta= 0;
                tvb.setText(contb+"");
                tva.setText(conta+"");


            }
        });


    }
}
