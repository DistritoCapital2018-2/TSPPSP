package sena.edu.co.tsppsp.Activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import sena.edu.co.tsppsp.R;
import sena.edu.co.tsppsp.slqLiteOpenHelper.ConexionSQLiteOpenHelper;
import sena.edu.co.tsppsp.tabla.Tablas;

public class DetalleProyectoActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvNombreProyectoD;
    Button btnTimelogD, btnDefectlogD, btnSummaryD;
    int idProyecto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_proyecto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvNombreProyectoD = findViewById(R.id.tvNombreProyectoD);
        btnTimelogD = findViewById(R.id.btnTimelogD);
        btnDefectlogD = findViewById(R.id.btnDefectlogD);
        btnSummaryD = findViewById(R.id.btnSummaryD);

        btnTimelogD.setOnClickListener(this);
        btnDefectlogD.setOnClickListener(this);
        btnSummaryD.setOnClickListener(this);

        obtenerDatosProyecto();

    }

    // Metodo que recibe los datos del Item seleccionado en la Actividad MainActivity

    private void obtenerDatosProyecto() {
        Bundle bundle = getIntent().getExtras();
        idProyecto = bundle.getInt("id_proyecto");
        idProyecto++;

        consultarProyecto();

    }

    // Metodo de Consulta de datos del Item Sleccionado

    private void consultarProyecto() {

        ConexionSQLiteOpenHelper conexion = new ConexionSQLiteOpenHelper(this, Tablas.DATABASE,null,1);
        SQLiteDatabase db = conexion.getReadableDatabase();
        Cursor datosProyecto = db.rawQuery("SELECT * FROM "+Tablas.TABLA_PROYECTO+" WHERE "+Tablas.CAMPO_ID_PROYECTO +" = "+idProyecto,null);
        try {

            tvNombreProyectoD.setText(datosProyecto.getString(1));

            btnTimelogD.setEnabled(true);
            btnDefectlogD.setEnabled(true);
            btnSummaryD.setEnabled(true);

        } catch (Exception e) {

            tvNombreProyectoD.setText("Proyecto No encontrado");
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
            btnTimelogD.setEnabled(false);
            btnDefectlogD.setEnabled(false);
            btnSummaryD.setEnabled(false);
        }
        db.close();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnTimelogD:
                Intent timeLogIntent = new Intent(this, TimeLogActivity.class);
                timeLogIntent.putExtra("id_proyecto_tl",idProyecto);
                startActivity(timeLogIntent);
                break;
            case R.id.btnDefectlogD:
                Intent defectLogIntent = new Intent(this, DefectLogActivity.class);
                defectLogIntent.putExtra("id_proyecto_tl",idProyecto);
                startActivity(defectLogIntent);
                break;
            case R.id.btnSummaryD:

                break;
        }

    }
}
