package sistemagestionrrhh;

import java.util.Date;

public class EmpleadoTemporal extends Empleado {
    private Date fechaFinContrato;
    private double valorHora;

    public EmpleadoTemporal(String nombre, String apellido, String email, String telefono, double salario, Date fechaFinContrato, double valorHora) {
        super(nombre, apellido, email, telefono, salario, "Temporal");
        this.fechaFinContrato = fechaFinContrato;
        this.valorHora = valorHora;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}

