package com.example.apsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaFrutasCadastradasActivity extends AppCompatActivity {

    private ListView listFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_frutas_cadastradas);

        listFrutas = findViewById(R.id.listFrutas);

        ArrayList<Fruta> lista_frutas = (ArrayList<Fruta>) getIntent().getSerializableExtra("LISTA_FRUTAS");


        ArrayAdapter<Fruta> adapter = new ArrayAdapter<Fruta>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                lista_frutas
        );
        listFrutas.setAdapter(adapter);
    }
}