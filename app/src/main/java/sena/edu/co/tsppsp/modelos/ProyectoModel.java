package sena.edu.co.tsppsp.modelos;

public class ProyectoModel {

    private int id;
    private String nombre_p;
    private int id_time_log_p;
    private int id_defect_log_p;

    public ProyectoModel() {
    }

    public ProyectoModel(int id, String nombre_p, int id_time_log_p, int id_defect_log_p) {
        this.id = id;
        this.nombre_p = nombre_p;
        this.id_time_log_p = id_time_log_p;
        this.id_defect_log_p = id_defect_log_p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public int getId_time_log_p() {
        return id_time_log_p;
    }

    public void setId_time_log_p(int id_time_log_p) {
        this.id_time_log_p = id_time_log_p;
    }

    public int getId_defect_log_p() {
        return id_defect_log_p;
    }

    public void setId_defect_log_p(int id_defect_log_p) {
        this.id_defect_log_p = id_defect_log_p;
    }
}
