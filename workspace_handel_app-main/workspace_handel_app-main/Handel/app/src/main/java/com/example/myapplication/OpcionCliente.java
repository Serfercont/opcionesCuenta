package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.conectiondb.R;

public class OpcionCliente extends AppCompatActivity {

    Button btnEliminarCuenta;
    Button btnDatosPago;
    Button btnModificarDatos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion_cliente);

        btnDatosPago=(Button) findViewById(R.id.btnDatosPago);
        btnEliminarCuenta=(Button) findViewById(R.id.btnDeleteAccountCl);
        btnModificarDatos= (Button) findViewById(R.id.btnModifyLeerDatos);


        btnDatosPago.setOnClickListener(DatosPago);
        btnModificarDatos.setOnClickListener(DatosCuenta);
    }


    private View.OnClickListener DatosPago = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            Intent pantallaCreate = new Intent(getApplicationContext(), CambioDatosPago.class);
            startActivity(pantallaCreate);
        }
    };

    private View.OnClickListener DatosCuenta= new View.OnClickListener(){
        public void onClick(View v){
            Intent newPantalla= new Intent(getApplicationContext(), ModificarDatosCL.class);
            startActivity(newPantalla);
        }
    };
}