package com.example.loginwpozo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class ventanaDos extends AppCompatActivity {

    CheckBox cb1, cb2, cb3;
    RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_dos);
        cb1 = findViewById(R.id.cbSistemas);
        cb2 = findViewById(R.id.cbAdministracion);
        cb3 = findViewById(R.id.cbDiseño);

        rb1 = findViewById(R.id.rbSi);
        rb2 = findViewById(R.id.rbNo);
    }

    public void resultado(View v){
        if (cb1.isChecked()==true){
            Toast.makeText(getApplicationContext(), "Esta En " + cb1.getText(), Toast.LENGTH_LONG).show();
            Toast.makeText(getApplicationContext(), "SI" + rb1.getText(), Toast.LENGTH_LONG).show();
        }
    }
}
