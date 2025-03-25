/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionrrhh;

/* En la clase departamento se asignan los metodos agregar empleado, eliminacion, actualizacion y listado tal y como se ve en el diagrama de clases propuesto en la primera actividad*/

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        empleado.asignarDepartamento(this);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public List<Empleado> listarEmpleados() {
        return new ArrayList<>(empleados);
    }

    public void actualizarEmpleado(Empleado empleadoActualizado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == empleadoActualizado.getId()) {
                empleados.set(i, empleadoActualizado);
                empleadoActualizado.asignarDepartamento(this);
                break;
            }
        }
    }
}

