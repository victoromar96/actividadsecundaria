package com.example.actividadsecundaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.editText); // traer el contenido de la variable edittex y lo pone en et1
    }


    public void acercaDe(View view){
        Intent i = new Intent(this, AcercaDe.class); //cuando hago clic en acercaDe hago un objeto de la clase, crea
        i.putExtra("nombre", et1.getText().toString()); //lo que envia
        startActivity(i);
    }
}
