package com.example.apsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mesColheita = new ArrayList<String>();
    ArrayList<Fruta> listaFrutas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mesColheita.add("");
        mesColheita.add("JANEIRO");
        mesColheita.add("FEVEREIRO");
        mesColheita.add("MARÇO");
        mesColheita.add("ABRIL");
        mesColheita.add("MAIO");
        mesColheita.add("JUNHO");
        mesColheita.add("JULHO");
        mesColheita.add("AGOSTO");
        mesColheita.add("SETEMBRO");
        mesColheita.add("OUTUBRO");
        mesColheita.add("NOVEMBRO");
        mesColheita.add("DEZEMBRO");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,mesColheita);//simple_spinner_item: renderiza o spinner
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        Spinner spinner = findViewById(R.id.spinnerMesColheita);
        spinner.setAdapter(adapter);
    }

    public void salvarFruta(View view) {

        Fruta frutaCadastrada = new Fruta();

        EditText editNome = findViewById(R.id.editTextNomeFruta);
        frutaCadastrada.setNomeFruta(editNome.getText().toString());

        EditText editPreco = findViewById(R.id.editTextPrecoFruta);
        frutaCadastrada.setPrecoFruta(editPreco.getText().toString());

        Spinner mesSelecionado = findViewById(R.id.spinnerMesColheita);
        frutaCadastrada.setMesColheita(mesSelecionado.getSelectedItem().toString());

        if(frutaCadastrada.getNomeFruta().equals("") || frutaCadastrada.getPrecoFruta().equals("") || frutaCadastrada.getMesColheita().equals("")){

            Toast aviso = Toast.makeText(this,"ERRO!!! PRENCHA TODOS OS CAMPOS",Toast.LENGTH_LONG);
            aviso.show();
        }else{

            listaFrutas.add(frutaCadastrada);
            Bundle parametros = new Bundle();
            parametros.putSerializable("LISTA_FRUTAS",listaFrutas);//putSerializable ou putParcelable é para passar objs

            Intent intent = new Intent(this, ListaFrutasCadastradasActivity.class);
            intent.putExtras(parametros);
            startActivity(intent);

        }
    }
}