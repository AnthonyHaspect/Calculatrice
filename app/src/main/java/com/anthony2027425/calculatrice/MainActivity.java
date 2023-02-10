package com.anthony2027425.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    EditText etCalculCurrent;
    TextView tvcalculHistorique;
    TextView CalculHistorique2;
    EditText CalculHistorique3;
    Button btnSupp;
    Button btnBack;
    Button btnEgal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCalculCurrent = findViewById(R.id.etCalulCurrent);
        tvcalculHistorique = findViewById(R.id.tvcalulHistorique);
    }


        public void AjouterLigne(View v){
            String TexteBouton = ((Button) v).getText().toString();
            Toast.makeText(MainActivity.this, TexteBouton, Toast.LENGTH_LONG).show();
            etCalculCurrent.setText(etCalculCurrent.getText().toString()+TexteBouton);
        };

}