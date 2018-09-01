package sena.edu.co.tsppsp.modelos;

public class DefectLogModel {

    private int id_defect_log;
    private String fecha_dl;
    private String tipo_doc_dl;
    private String fase_injected_dl;
    private String fase_removed_dl;
    private String fix_time_dl;
    private String descripcion_dl;

    public DefectLogModel() {
    }

    public DefectLogModel(int id_defect_log, String fecha_dl, String tipo_doc_dl, String fase_injected_dl, String fase_removed_dl, String fix_time_dl, String descripcion_dl) {
        this.id_defect_log = id_defect_log;
        this.fecha_dl = fecha_dl;
        this.tipo_doc_dl = tipo_doc_dl;
        this.fase_injected_dl = fase_injected_dl;
        this.fase_removed_dl = fase_removed_dl;
        this.fix_time_dl = fix_time_dl;
        this.descripcion_dl = descripcion_dl;
    }

    public int getId_defect_log() {
        return id_defect_log;
    }

    public void setId_defect_log(int id_defect_log) {
        this.id_defect_log = id_defect_log;
    }

    public String getFecha_dl() {
        return fecha_dl;
    }

    public void setFecha_dl(String fecha_dl) {
        this.fecha_dl = fecha_dl;
    }

    public String getTipo_doc_dl() {
        return tipo_doc_dl;
    }

    public void setTipo_doc_dl(String tipo_doc_dl) {
        this.tipo_doc_dl = tipo_doc_dl;
    }

    public String getFase_injected_dl() {
        return fase_injected_dl;
    }

    public void setFase_injected_dl(String fase_injected_dl) {
        this.fase_injected_dl = fase_injected_dl;
    }

    public String getFase_removed_dl() {
        return fase_removed_dl;
    }

    public void setFase_removed_dl(String fase_removed_dl) {
        this.fase_removed_dl = fase_removed_dl;
    }

    public String getFix_time_dl() {
        return fix_time_dl;
    }

    public void setFix_time_dl(String fix_time_dl) {
        this.fix_time_dl = fix_time_dl;
    }

    public String getDescripcion_dl() {
        return descripcion_dl;
    }

    public void setDescripcion_dl(String descripcion_dl) {
        this.descripcion_dl = descripcion_dl;
    }
}
