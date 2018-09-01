package sena.edu.co.tsppsp.slqLiteOpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import sena.edu.co.tsppsp.tabla.Tablas;

public class ConexionSQLiteOpenHelper extends SQLiteOpenHelper {

    public ConexionSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Tablas.CREAR_TABLA_PROYECTO);
        db.execSQL(Tablas.CREAR_TABLA_TIME_LOG);
        db.execSQL(Tablas.CREAR_TABLA_DEFECT_LOG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_PROYECTO);
        db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_TIME_LOG);
        db.execSQL("DROP TABLE IF EXISTS "+Tablas.TABLA_DEFECT_LOG);
        onCreate(db);
    }
}
