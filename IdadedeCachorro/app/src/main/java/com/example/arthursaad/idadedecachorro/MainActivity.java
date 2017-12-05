package com.example.arthursaad.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText valorIdade;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorIdade = (EditText) findViewById(R.id.editInsere);
        botaoIdade = (Button) findViewById(R.id.botaoIdade);
        resultadoIdade = (TextView) findViewById(R.id.textResultado);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que a pessoa digitou no EditText
                String idade = valorIdade.getText().toString();
                if(idade.isEmpty()){
                    //String vazia(mensagem de erro)
                    resultadoIdade.setText("Nenhum número digitado");

                }
                else{
                    int valorDigitado = Integer.parseInt(idade);
                    int resultadoFinal = valorDigitado * 7;
                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + "anos");
                }

            }
        });
    }
}
