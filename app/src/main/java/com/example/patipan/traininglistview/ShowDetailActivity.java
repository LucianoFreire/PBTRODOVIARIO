package com.example.patipan.traininglistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetailActivity extends AppCompatActivity {
    private int resId;
    private String modelo;
    private String descricao;
    private ImageView imageView;
    private TextView tvDescricao;
    private TextView tvmodelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        initInstances();

        ImageButton btnCalcular = (ImageButton) findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShowDetailActivity.this,CalcularPBT.class);
                startActivity(i);
            }

        });

    }

    private void initInstances() {

        resId = getIntent().getIntExtra("resId",0);
        modelo = getIntent().getStringExtra("modelo");
        descricao = getIntent().getStringExtra("desc");

        tvDescricao = (TextView) findViewById(R.id.desc);
        tvmodelo = (TextView) findViewById(R.id.title);
        imageView = (ImageView) findViewById(R.id.image);

       tvDescricao.setText(descricao);
       tvmodelo.setText(modelo);
        imageView.setImageResource(resId);
    }
}
