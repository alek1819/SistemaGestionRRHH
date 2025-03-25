/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionrrhh;

import java.util.Date;
import java.util.List;

//clase ReporteDesempeno y sus atributos
public class ReporteDesempeno {
    private int id;
    private Empleado empleado;
    private double calificacion;
    private String comentarios;
    private Date fechaEvaluacion;

    //Constructor
    public ReporteDesempeno(int id, Empleado empleado, double calificacion, String comentarios, Date fechaEvaluacion) {
        this.id = id;
        this.empleado = empleado;
        this.calificacion = calificacion;
        this.comentarios = comentarios;
        this.fechaEvaluacion = fechaEvaluacion;
        }

        //Getters y Setters
        public int getId() {
        return id;
        }

        public void setId(int id) {
        this.id = id;
        }

        public Empleado getEmpleado() {
        return empleado;
        }

        public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
        }

        public double getCalificacion() {
        return calificacion;
        }

        public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
        }

        public String getComentarios() {
        return comentarios;
        }

        public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
        }

        public Date getFechaEvaluacion() {
        return fechaEvaluacion;
        }

        public void setFechaEvaluacion(Date fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
        }
        
        //metodo para generar reporte de desempeño individual
        public String generarReporte() {
        return "Reporte ID: " + id + " - Empleado: " + empleado.obtenerInformacion() + 
            " - Calificación: " + calificacion + " - Comentarios: " + comentarios;
    }

    // Método estático para generar un reporte general de todos los empleados evaluados
    public static String generarReporteGeneral(List<ReporteDesempeno> reportes) {
        if (reportes.isEmpty()) {
            return "No hay reportes disponibles.";
        }

        StringBuilder reporteGeneral = new StringBuilder("===== REPORTE GENERAL DE DESEMPEÑO =====\n");

        double sumaCalificaciones = 0;
        int totalReportes = reportes.size();

        for (ReporteDesempeno reporte : reportes) {
            reporteGeneral.append(reporte.generarReporte()).append("\n");
            sumaCalificaciones += reporte.getCalificacion();
        }

        double promedioCalificacion = sumaCalificaciones / totalReportes;
        reporteGeneral.append("\nPromedio General de Calificaciones: ").append(String.format("%.2f", promedioCalificacion));

        return reporteGeneral.toString();
    }
}
