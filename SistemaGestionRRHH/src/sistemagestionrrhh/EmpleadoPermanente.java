/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionrrhh;

public class EmpleadoPermanente extends Empleado {
    private String beneficios;
    private String tipoContrato;

    public EmpleadoPermanente(String nombre, String apellido, String email, String telefono, double salario, String beneficios, String tipoContrato) {
        super(nombre, apellido, email, telefono, salario, "Permanente");
        this.beneficios = beneficios;
        this.tipoContrato = tipoContrato;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}

