package com.example.patipan.traininglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
