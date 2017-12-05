package com.example.arthursaad.gasolinaoulcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText)findViewById(R.id.inputAlcool);
        precoGasolina = (EditText)findViewById(R.id.inputGasolina);
        verificar = (Button)findViewById(R.id.botaoVerificar);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Casting para valores as strings recuperadas dos editText
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //alcool/gasolina
                double resultado = valorAlcool/valorGasolina;
                if(resultado >= 0.7){
                    //Compensa usar gasolina
                    Toast.makeText(MainActivity.this,"É melhor usar gasolina",Toast.LENGTH_LONG).show();
                }
                else{
                    //Compensa usar Álcool
                    Toast.makeText(MainActivity.this,"É melhor usar Álcool",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
