package com.turnos.proyectox.turnoscliente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, Util.getEspecialidades(this));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

          Spinner Especialidades = (Spinner) findViewById(R.id.spnEspecialidades);

        Especialidades.setAdapter(adapter);

    }


    /** Called when the user clicks the activity_reservar button */
    public void Reservar(View view) {
        // TO DO: call to server an reserve turn
        Intent intent = new Intent(this, ReservarActivity.class);
        startActivity(intent);

    }
}
