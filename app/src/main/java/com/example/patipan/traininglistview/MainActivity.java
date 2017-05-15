package com.example.patipan.traininglistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    List<Veiculos> veiculos = new ArrayList<>();
    int dataSize;
    public Veiculos listVeiculos = new Veiculos();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();


    }

    private void initInstances() {

        prepareData();

        ListAdapter adapter = new ListAdapter(MainActivity.this, listVeiculos);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int resId[] = {
                  R.drawable.img2cc, R.drawable.img2c, R.drawable.img3c, R.drawable.img3cd, R.drawable.img3dc, R.drawable.img4cd, R.drawable.img4dd
                , R.drawable.img4dc, R.drawable.img4c, R.drawable.img2s1, R.drawable.img2s2, R.drawable.img2i2, R.drawable.img2s3, R.drawable.img2i1
                , R.drawable.img2i3, R.drawable.img3s1, R.drawable.img3i2, R.drawable.img3d2, R.drawable.img3s3, R.drawable.img3d3, R.drawable.img3i1
                , R.drawable.img3di, R.drawable.img3i3, R.drawable.img3id, R.drawable.img3d1, R.drawable.img32d, R.drawable.img3s2, R.drawable.img4di
                , R.drawable.img4ds, R.drawable.img4dt, R.drawable.img4d3, R.drawable.img41c, R.drawable.img4d1, R.drawable.img42c, R.drawable.img4d2
                , R.drawable.img4i2, R.drawable.img4id, R.drawable.img2c2, R.drawable.img2c3, R.drawable.img2r4, R.drawable.img3c2, R.drawable.img3c3
                , R.drawable.img3d4, R.drawable.img3dd, R.drawable.img33d, R.drawable.img34d, R.drawable.img4r2

                , R.drawable.img3t4, R.drawable.img2d4, R.drawable.img3d4, R.drawable.img3t6
                , R.drawable.img3m6, R.drawable.img3v5, R.drawable.img3p5

        };

        String modelo[] = {

                "2CC / I-1", "2C / I-2", "3C / I-3", "3CD / I-4", "3DC / I-5", "4CD / I-6", "4DD / I-7", "4DC / I-8", "4C", "2S1 / I-9",
                "2S2 / I-10", "2I2 / I-11", "2S3 / I-12", "2I1 / I-13", "2I3 / I-14", "3S1 / I-15", "3I2 / I-16", "3D2 / I-17", "3S3 / I-18",
                "3D3 / I-19", "3I1 / I-20", "3DI / I-21", "3I3 / I-22", "3ID / I-23", "3D1 / I-24", "32D / I-25", "3S2 / I-26", "4DI / I-27",
                "4DS / I-28", "4DT / I-29", "4D3 / I-30", "41C / I-31", "4D1 / I-32", "42C / I-33", "4D2 / I-34", "4I2 / I-35", "4ID / I-36",
                "2C2 / I-37", "2C3 / I-38", "2R4 / I-39", "3C2 / I-40", "3C3 / I-41", "3D4 / I-42", "3DD / I-43", "33D / I-44", "34D / I-45",
                "4R2 / I-46"


                , "Siberian husky",
                "Great dane", "German shepherd", "Labrador retriever", "Bull dog", "Beagle",
                "Boxer", "Golden retriever", "Poodle", "Pug", "Siberian husky",
                "Great dane", "3M6"
        };

        String descricao[] = {

                  getString(R.string.Veic_2CC_des),getString(R.string.Veic_2C_des), getString(R.string.Veic_3C_des), getString(R.string.Veic_3CD_des)
                , getString(R.string.Veic_3DC_des),getString(R.string.Veic_4CD_des), getString(R.string.Veic_4DD_des), getString(R.string.Veic_4DC_des)
                , getString(R.string.Veic_4C_des), getString(R.string.Veic_2S1_des), getString(R.string.Veic_2S2_des), getString(R.string.Veic_2I2_des)
                , getString(R.string.Veic_2S3_des), getString(R.string.Veic_2I1_des), getString(R.string.Veic_2I3_des), getString(R.string.Veic_3S1_des)
                , getString(R.string.Veic_3I2_des), getString(R.string.Veic_3D2_des), getString(R.string.Veic_3S3_des), getString(R.string.Veic_3D3_des)
                , getString(R.string.Veic_3I1_des), getString(R.string.Veic_3DI_des), getString(R.string.Veic_3ID_des), getString(R.string.Veic_3D1_des)
                , getString(R.string.Veic_3D2_des), getString(R.string.Veic_3S2_des), getString(R.string.Veic_4DI_des), getString(R.string.Veic_4DS_des)
                , getString(R.string.Veic_4DT_des), getString(R.string.Veic_4D3_des), getString(R.string.Veic_41C_des), getString(R.string.Veic_4D1_des)
                , getString(R.string.Veic_42C_des), getString(R.string.Veic_4D2_des), getString(R.string.Veic_4I2_des), getString(R.string.Veic_4ID_des)


                , getString(R.string.Veic_4CD_des)
                , getString(R.string.beagle_des), getString(R.string.boxer_des), getString(R.string.golden_des), getString(R.string.poodle_des)
                , getString(R.string.pug_des), getString(R.string.siberian_des), getString(R.string.greatdane_des), getString(R.string.Veic_2C_des)
                , getString(R.string.Veic_3C_des), getString(R.string.Veic_4CD_des), getString(R.string.beagle_des), getString(R.string.boxer_des)
                , getString(R.string.golden_des), getString(R.string.poodle_des), getString(R.string.pug_des), getString(R.string.siberian_des)
                , getString(R.string.greatdane_des), getString(R.string.m6_des),
                };
        dataSize = resId.length;


        Log.d("khem", "dataSize " + resId.length);
        Log.d("khem", "modelo " + resId.length);
        Log.d("khem", "descricao " + resId.length);


        for (int i = 0; i < dataSize; i++) {
            Log.d("khem", " " + i);
            Veiculos veiculos = new Veiculos(resId[i], modelo[i], descricao[i]);
            this.veiculos.add(veiculos);
        }

        listVeiculos.setVeic(veiculos);

        //Log.d("khem",listVeiculos);
    }

    /**************
     * Listener
     **************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, ShowDetailActivity.class);
            intent.putExtra("resId", listVeiculos.getVeic().get(position).getResId());
            intent.putExtra("modelo", listVeiculos.getVeic().get(position).getModelo());
            intent.putExtra("desc", listVeiculos.getVeic().get(position).getDescricao());

            startActivity(intent);

        }

        //IMPLEMENTAÇÃO DO BOTAO CALCULAR
        /*ImageButton btnCalcular = (ImageButton) findViewById(R.id.btn_calcular);
            btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,CalcularPBT.class);
                startActivity(i);
            }

        });
        */

    };

}
