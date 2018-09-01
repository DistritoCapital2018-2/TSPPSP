package sena.edu.co.tsppsp.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import sena.edu.co.tsppsp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        try {

            FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fbAgregarProyecto);

            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //abrirAlertRegistroNuevoProyecto();
                    abrirActivityRegisto();
                }
            });
        } catch (Exception e)
        {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

    private void abrirActivityRegisto() {
        startActivity(new Intent(this, DefectLogActivity.class));
    }


    @Nullable
    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        return super.onCreateDialog(id, args);
    }

    // Metodo encargado de abrir AlertDialog de Registro de Nuevo Proyectos
    private void abrirAlertRegistroNuevoProyecto() {

        AlertDialog.Builder alertRegistro = new AlertDialog.Builder(getApplicationContext());
        
        View view = View.inflate(this,R.layout.alert_dialog_registo_nuevo_proyecto,null);

        EditText    et_alert_d_nombre_proyecto = view.findViewById(R.id.et_alert_d_nombre_proyecto);
        Button      btn_alert_d_registrar_proyecto = view.findViewById(R.id.btn_alert_d_registrar_proyecto);
        
        btn_alert_d_registrar_proyecto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Registrado",Toast.LENGTH_SHORT).show();
            }
        });

        alertRegistro.setView(view);

        AlertDialog dialog = alertRegistro.create();
        dialog.show();

        // TODO: Terminar logica AlertDialog
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
