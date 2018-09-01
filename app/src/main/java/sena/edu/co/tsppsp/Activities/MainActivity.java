package sena.edu.co.tsppsp.Activities;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import sena.edu.co.tsppsp.R;
import sena.edu.co.tsppsp.modelos.ProyectoModel;
import sena.edu.co.tsppsp.slqLiteOpenHelper.ConexionSQLiteOpenHelper;
import sena.edu.co.tsppsp.tabla.Tablas;

public class MainActivity extends AppCompatActivity  {
    
    TextView tvTitleM;
    ListView lvProyectosM;
    Typeface typeface;
    ConexionSQLiteOpenHelper conexion;
    ArrayList<ProyectoModel> listaProyectos;
    ArrayList<String> listaProyectosString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vistas Base
        tvTitleM = findViewById(R.id.tvTitleM);
        lvProyectosM = findViewById(R.id.lvProyectosM);

        // Tipografia
        typeface = Typeface.createFromAsset(getAssets(),"fonts/poorich.ttf");

        tvTitleM.setTypeface(typeface);

        conexion = new ConexionSQLiteOpenHelper(this, Tablas.DATABASE,null,1);


        // Floating
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fbAgregarProyecto);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //abrirAlertRegistroNuevoProyecto();
                abrirActivityRegisto();
            }});

        lvProyectosM.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
                Toast.makeText(getApplicationContext(),""+adapterView.getItemAtPosition(posicion),Toast.LENGTH_SHORT).show();
                //TODO: Crear Intent de DetalleProyecto y pasar la posicion
            }
        });

        consultarProyectos();
        

    }


    // Metodo Encargado de consultar los Proyectos en la BD
    private void consultarProyectos() {
        SQLiteDatabase db = conexion.getReadableDatabase();

        ProyectoModel proyectoModel = null;
        listaProyectos = new ArrayList<ProyectoModel>();
        Cursor proyectosCursor = db.rawQuery("SELECT * FROM "+Tablas.TABLA_PROYECTO,null);
        while (proyectosCursor.moveToNext())
        {
            proyectoModel = new ProyectoModel();
            proyectoModel.setId(proyectosCursor.getInt(0));
            proyectoModel.setNombre_p(proyectosCursor.getString(1));

            // TODO: Terminar el relleno del objeto y crear el adapter


            listaProyectos.add(proyectoModel);
        }

        try {

            adatarLista(listaProyectos);
        }catch (Exception e) {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_LONG).show();
        }

    }

    private void adatarLista(ArrayList<ProyectoModel> listaProyectos) {

        listaProyectosString = new ArrayList<String>();
        for (int i = 0; i < listaProyectos.size();i++)
        {
            listaProyectosString.add(listaProyectos.get(i).getId()+" - "+ listaProyectos.get(i).getNombre_p());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_style, listaProyectosString);
        lvProyectosM.setAdapter(adapter);
    }


    // Metodo encargado de abrir la actividad de ProjectRegisterActivity para crear un Proyecto nuevo
    private void abrirActivityRegisto() {
        startActivity(new Intent(this, ProjectRegisterActivity.class));
    }

}
