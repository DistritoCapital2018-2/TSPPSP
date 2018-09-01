package sena.edu.co.tsppsp.tabla;

public class Tablas  {

    public static final String DATABASE = "tsppsp";

    // Creacion de variables estaticas para la tabla PROYECTO
    public static final String TABLA_PROYECTO = "proyecto";
    public static final String CAMPO_ID_PROYECTO = "id_proyecto";
    public static final String CAMPO_NOMBRE_PROYECTO = "nombre_proyecto";
    public static final String CAMPO_ID_TIME_LOG_PRO = "time_log_id";
    public static final String CAMPO_ID_DEFECT_LOG_PRO = "defect_log_id";

    public static final String CREAR_TABLA_PROYECTO = "CREATE TABLE "+TABLA_PROYECTO+" ("+CAMPO_ID_PROYECTO+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPO_NOMBRE_PROYECTO+" TEXT, "+ CAMPO_ID_TIME_LOG_PRO+" INTEGER, "+CAMPO_ID_DEFECT_LOG_PRO+" INTEGER)";

    // Creacion de variables estaticas para la tabla TIME_LOG
    public static final String TABLA_TIME_LOG = "time_log";
    public static final String CAMPO_ID_TL = "id_time_log";
    public static final String CAMPO_FASE_TL = "fase_tl";
    public static final String CAMPO_TIEMO_INICIAL_TL= "tiempo_inicial_tl";
    public static final String CAMPO_TIEMO_FINAL_TL = "tiempo_final_tl";
    public static final String CAMPO_INTERRUPCION_TL = "interrupcion_tl";
    public static final String CAMPO_COMENTARIOS_TL = "comentarios_tl";

    public static final String CREAR_TABLA_TIME_LOG = "CREATE TABLE "+TABLA_TIME_LOG+ " ("+CAMPO_ID_TL+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPO_FASE_TL+" TEXT, "+CAMPO_TIEMO_INICIAL_TL+" TEXT, "+CAMPO_TIEMO_FINAL_TL+" TEXT, "+CAMPO_INTERRUPCION_TL +" INTEGER, "
            +CAMPO_COMENTARIOS_TL+ " TEXT)";

    // Creacion de variables estaticas para la tabla DEFECT_LOG

    public static final String TABLA_DEFECT_LOG = "defect_log";
    public static final String CAMPO_ID_DL = "id_defect_log";
    public static final String CAMPO_FECHA_DL = "fecha_dl";
    public static final String CAMPO_TIPO_DOC_DL = "tipo_doc_dl";
    public static final String CAMPO_FASE_INJECTED_DL = "fase_injected_dl";
    public static final String CAMPO_FASE_REMOVED_DL = "fase_removed_dl";
    public static final String CAMPO_FIX_TIME_DL = "fix_time_dl";
    public static final String CAMPO_DESCRIPCION_DL = "descripcion_dl";

    public static final String CREAR_TABLA_DEFECT_LOG = "CREATE TABLE "+TABLA_DEFECT_LOG+ " ("+CAMPO_ID_DL+" INTEGER PRIMARY KEY AUTOINCREMENT, "
            +CAMPO_FECHA_DL+ " TEXT, "+CAMPO_TIPO_DOC_DL+" TEXT, "+CAMPO_FASE_INJECTED_DL+" TEXT, "+CAMPO_FASE_REMOVED_DL+ " TEXT, "
            +CAMPO_FIX_TIME_DL+" TEXT, "+ CAMPO_DESCRIPCION_DL+" TEXT)";

}
