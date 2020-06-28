package com.example.aplicaciongeometrica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //AGREGA ELEMENTOS PARA CONECTARNOS A LA VISTA
    private EditText txtX1;
    private EditText txtX2;
    private EditText txtY1;
    private EditText txtY2;
    private EditText txtResDistancia;
    private EditText txtResPendiente;
    private Button btnCalcularDistancia;
    private Button btnCalcularPendiente;
    private Button btnLimpiarCampos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }


    //METODO PARA LAS RESPUESTAS DY CONTENEDORES NUMERICOS
    private void iniciar(){
        txtX1 =(EditText)findViewById(R.id.txtX1);
        txtX2 =(EditText)findViewById(R.id.txtX2);
        txtY1 =(EditText)findViewById(R.id.txtY1);
        txtY2 =(EditText)findViewById(R.id.txtY2);
        txtResDistancia = (EditText)findViewById(R.id.txtResDistancia);
        txtResPendiente = (EditText)findViewById(R.id.txtResPendiente);

        //inicilaizar los botones
        btnCalcularDistancia = (Button)findViewById(R.id.btnCalcularDistancia);
        btnCalcularPendiente = (Button)findViewById(R.id.btnCalcularPendiente);
        //METODO PARA CALCULAR LA DISTANCIA
        btnCalcularDistancia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {CalcularDistancia();
            }
        });
        //METODO PARA CALCULAR LA PENDIENTE
        btnCalcularPendiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {CalcularPendiente();
            }
        });
        //METODO PARA LIMPIAR LOS CAMPOS
        btnLimpiarCampos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LimpiarCampos();
            }
        });

    }


    private void CalcularDistancia(){
        double X1 = Double.parseDouble(txtX1.getText().toString());
        double X2 = Double.parseDouble(txtX2.getText().toString());
        double Y1 = Double.parseDouble(txtY1.getText().toString());
        double Y2 = Double.parseDouble(txtY2.getText().toString());
        //FORMULA
        double Distancia = Math.sqrt(Math.pow(X2-X1,2) + Math.pow(Y2-Y1,2));
        txtResDistancia.setText(String.valueOf(Distancia));
    }
    private void CalcularPendiente(){

        double X1 = Double.parseDouble(txtX1.getText().toString());
        double X2 = Double.parseDouble(txtX2.getText().toString());
        double Y1 = Double.parseDouble(txtY1.getText().toString());
        double Y2 = Double.parseDouble(txtY2.getText().toString());
        //FORMULA
        double Pendiente = ((Y2) - (Y1)) / ((X2) - (X1));
        txtResPendiente.setText(String.valueOf(Pendiente));
    }
    private void LimpiarCampos(){
        txtX1.setText("");
        txtX2.setText("");
        txtY1.setText("");
        txtY2.setText("");
        txtResDistancia.setText("0");
        txtResPendiente.setText("0");
    }


}