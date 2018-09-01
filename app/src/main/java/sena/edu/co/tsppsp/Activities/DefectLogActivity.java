package sena.edu.co.tsppsp.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import sena.edu.co.tsppsp.R;

public class DefectLogActivity extends AppCompatActivity implements View.OnClickListener {

    //Instancio los componentes
    View view;
    Spinner spinnerTypeDefectLog, spinnerInjectedDefectLog, spinnerRemovedDefectLog;
    Button obtenerFecha;
    TextView etFechaDefectLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defect_log);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Adjunto los componentes con el xml
        obtenerFecha = findViewById(R.id.btnFechaDefectLog);
        etFechaDefectLog = findViewById(R.id.etFechaDefectLog);

        //Spinners

        spinnerTypeDefectLog = findViewById(R.id.spinnerTypeDefectLog);
        spinnerInjectedDefectLog = findViewById(R.id.spinnerInjectedDefectLog);
        spinnerRemovedDefectLog = findViewById(R.id.spinnerRemovedDefectLog);


        //Adaptor de Spinners
        //Type_List
        ArrayAdapter arrayAdapter1 = ArrayAdapter.createFromResource(this, R.array.type_list, R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTypeDefectLog.setAdapter(arrayAdapter1);
        //Phase_List
        ArrayAdapter arrayAdapter2 = ArrayAdapter.createFromResource(this, R.array.phase_list, R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerInjectedDefectLog.setAdapter(arrayAdapter2);
        spinnerRemovedDefectLog.setAdapter(arrayAdapter2);
        //camposInhabilitados();

    }




    private void camposInhabilitados() {
        etFechaDefectLog.setEnabled(false);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFechaDefectLog:
                //obtenerFechaHora();
                break;

        }
    }


    private void obtenerFechaHora() {
        /*
        myString = DateFormat.getDateInstance().format(myDate);
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        myDate = df.parse(myString);
        */

    }



}
