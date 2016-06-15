package com.saidmar.ingresardatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    public TextView outName;
    public TextView outDate;
    public TextView outPhone;
    public TextView outEmail;
    public TextView outDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        outName = (TextView)findViewById(R.id.nombre);
        outDate = (TextView)findViewById(R.id.fecha);
        outPhone = (TextView)findViewById(R.id.telefono);
        outEmail = (TextView) findViewById(R.id.email);
        outDescription = (TextView)findViewById(R.id.descripcion);

        outName.setText(Estaticas.staticName);
       outDate.setText("Fecha de Nacimiento: "+Estaticas.staticDay+"/"+Estaticas.staticMonth+"/"+Estaticas.staticYear);
        outPhone.setText("Telefono: "+Estaticas.staticTelefono);
        outEmail.setText("Email: "+Estaticas.staticEmail);
        outDescription.setText("Descripción: "+Estaticas.staticDescripcion);

    }
}
