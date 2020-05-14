package com.example.loginwpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etUsuario);
        et2 = findViewById(R.id.etContraseña);
        btnAceptar = findViewById(R.id.btnAceptar);
    }
    public void Aceptar (View v){

        String  usuario = et1.getText().toString();
        String  contraseña = et2.getText().toString();

        Intent intentUisrael = new Intent(MainActivity.this, ventanaDos.class);
        startActivity(intentUisrael);

        switch (v.getId()){
            case R.id.btnAceptar:
                if (usuario.equals("uisrael")&&contraseña.equals("uisrael.20")){
                    Toast.makeText(this, "DATO CORRECTO", Toast.LENGTH_LONG).show();

                }

                else {
                    Toast.makeText(this, "DATO INCORRECTO", Toast.LENGTH_LONG).show();

                }
                }
        }

    }


