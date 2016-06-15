package com.saidmar.ingresardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public static String CLASS_TAG = MainActivity.class.getName();
    public DatePicker datePicker;

    public int day, month, year;
    public EditText inputName;
    public EditText inputTelefono;
    public EditText inputEmail;
    public EditText inputDescripcion;
    public String nameSaved, telefonoSaved, emailSaved, descripcionSaved;
    public Button siguiente;
    public Intent ir;
    public Datos datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* datePicker = (DatePicker) findViewById(R.id.dp_fecha);
        //final Calendar calendar = Calendar.getInstance();
        year = datePicker.getYear();
        month = datePicker.getMonth();
        day = datePicker.getDayOfMonth();*/

        inputName = (EditText) findViewById(R.id.et_nombre);
        inputTelefono = (EditText) findViewById(R.id.et_telefono);
        inputEmail = (EditText) findViewById(R.id.et_email);
        inputDescripcion = (EditText) findViewById(R.id.et_contacto);


        //boton
        siguiente = (Button) findViewById(R.id.button_siguiente);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameSaved = inputName.getText().toString();
                telefonoSaved = inputTelefono.getText().toString();
                emailSaved = inputEmail.getText().toString();
                descripcionSaved = inputDescripcion.getText().toString();

                datos.setNombre(nameSaved);
                datos.setTelefono(telefonoSaved);
                datos.setEmail(emailSaved);
                datos.setDescripcion(descripcionSaved);
                datos.setDay(day);
                datos.setMonth(month);
                datos.setYear(year);

                Estaticas.staticName = nameSaved;
                Estaticas.staticTelefono = telefonoSaved;
                Estaticas.staticEmail = emailSaved;
                Estaticas.staticDescripcion = descripcionSaved;
                Estaticas.staticDay = day;
                Estaticas.staticMonth = month;
                Estaticas.staticYear = year;

                ir = new Intent(MainActivity.this, ConfirmarDatos.class);
                startActivity(ir);

            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

    }
}