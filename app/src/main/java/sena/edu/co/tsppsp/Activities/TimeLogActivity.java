package sena.edu.co.tsppsp.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import sena.edu.co.tsppsp.R;

public class TimeLogActivity extends AppCompatActivity implements View.OnClickListener{

    Typeface typeface;
    Spinner spPhaseTL;
    EditText etFechaInicioTL, tvInterrupcionesTL, tvFechaFinalTL, tvComentariosTL;
    Button btnIniciarTL, btnPararTL, btnRegistrarTL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_log);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        spPhaseTL = findViewById(R.id.spPhaseTL);
        etFechaInicioTL = findViewById(R.id.etFechaInicioTL);
        tvInterrupcionesTL = findViewById(R.id.etInterrupcionesTL);
        tvFechaFinalTL = findViewById(R.id.etFechaFinalTL);
        tvComentariosTL = findViewById(R.id.etComentariosTL);
        btnIniciarTL = findViewById(R.id.btnIniciarTL);
        btnPararTL = findViewById(R.id.btnPararTL);
        btnRegistrarTL = findViewById(R.id.btnRegistrarTL);

        btnIniciarTL.setOnClickListener(this);
        btnPararTL.setOnClickListener(this);
        btnRegistrarTL.setOnClickListener(this);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.phase_list, R.layout.spinner_style);

        spPhaseTL.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_empty,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:

                startActivity(new Intent(this,MainActivity.class));
                break;
        }

        return true;
    }

    @Override
    public void onClick(View view) {

    }
}
