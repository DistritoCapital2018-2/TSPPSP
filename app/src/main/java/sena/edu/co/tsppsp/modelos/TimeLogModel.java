package sena.edu.co.tsppsp.modelos;

public class TimeLogModel {

    private int id_time_log;
    private String fase_tl;
    private String tiempo_inicial_tl;
    private String tiempo_final_tl;
    private int interrupcion_tl;
    private String comentarios_tl;

    public TimeLogModel() {
    }

    public TimeLogModel(int id_time_log, String fase_tl, String tiempo_inicial_tl, String tiempo_final_tl, int interrupcion_tl, String comentarios_tl) {
        this.id_time_log = id_time_log;
        this.fase_tl = fase_tl;
        this.tiempo_inicial_tl = tiempo_inicial_tl;
        this.tiempo_final_tl = tiempo_final_tl;
        this.interrupcion_tl = interrupcion_tl;
        this.comentarios_tl = comentarios_tl;
    }

    public int getId_time_log() {
        return id_time_log;
    }

    public void setId_time_log(int id_time_log) {
        this.id_time_log = id_time_log;
    }

    public String getFase_tl() {
        return fase_tl;
    }

    public void setFase_tl(String fase_tl) {
        this.fase_tl = fase_tl;
    }

    public String getTiempo_inicial_tl() {
        return tiempo_inicial_tl;
    }

    public void setTiempo_inicial_tl(String tiempo_inicial_tl) {
        this.tiempo_inicial_tl = tiempo_inicial_tl;
    }

    public String getTiempo_final_tl() {
        return tiempo_final_tl;
    }

    public void setTiempo_final_tl(String tiempo_final_tl) {
        this.tiempo_final_tl = tiempo_final_tl;
    }

    public int getInterrupcion_tl() {
        return interrupcion_tl;
    }

    public void setInterrupcion_tl(int interrupcion_tl) {
        this.interrupcion_tl = interrupcion_tl;
    }

    public String getComentarios_tl() {
        return comentarios_tl;
    }

    public void setComentarios_tl(String comentarios_tl) {
        this.comentarios_tl = comentarios_tl;
    }
}
