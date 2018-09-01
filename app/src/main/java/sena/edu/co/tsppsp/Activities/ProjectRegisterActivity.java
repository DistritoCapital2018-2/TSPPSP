package sena.edu.co.tsppsp.Activities;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import sena.edu.co.tsppsp.R;
import sena.edu.co.tsppsp.slqLiteOpenHelper.ConexionSQLiteOpenHelper;
import sena.edu.co.tsppsp.tabla.Tablas;

public class ProjectRegisterActivity extends AppCompatActivity implements View.OnClickListener{

    TextView etTitleCP;
    EditText etNombreProyectoCP;
    Button btnCrearProyectoCP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        etTitleCP = findViewById(R.id.etTitleCP);
        etNombreProyectoCP = findViewById(R.id.etNombreProyectoCP);
        btnCrearProyectoCP = findViewById(R.id.btnCrearProyectoCP);

        btnCrearProyectoCP.setOnClickListener(this);


    }

    // Creacion de Toolbar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_empty,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
        return  true;
    }


    // Metodo OnClick
    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnCrearProyectoCP:
                validarRegistro();
                break;

        }

    }


    // Metodo encargado de validar que no haya campos vacios en el Registro
    private void validarRegistro() {

        if (etNombreProyectoCP.getText().toString().equals(""))
        {
            Toast.makeText(this,"Debes nombrar tu proyecto", Toast.LENGTH_SHORT).show();
        } else {
            registrarProyecto();
        }

    }


    // Metodo que registra el proyecto a la Base de Datos
    private void registrarProyecto() {
        ConexionSQLiteOpenHelper conexion = new ConexionSQLiteOpenHelper(this, Tablas.DATABASE, null,1);

        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues datosProyecto = new ContentValues();
        String nombreProyecto = etNombreProyectoCP.getText().toString();

        datosProyecto.put(Tablas.CAMPO_NOMBRE_PROYECTO,nombreProyecto );

        db.insert(Tablas.TABLA_PROYECTO,null,datosProyecto);

        db.close();

        Toast.makeText(this,"¡Proyecto Creado!",Toast.LENGTH_SHORT).show();

    }
}
