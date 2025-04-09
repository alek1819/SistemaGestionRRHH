/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestionrrhh;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestion {
    private List<Empleado> empleados;
    private List<Departamento> departamentos;

    public SistemaGestion() {
        empleados = new ArrayList<>();
        departamentos = new ArrayList<>();
    }

    //metodos para agregar, eliminar, actualizar y obtener empleados 

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public boolean eliminarEmpleado(int id) {
        return empleados.removeIf(e -> e.getId() == id);
    }

    public Empleado obtenerEmpleado(int id) {
        return empleados.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public boolean actualizarEmpleado(int id, Empleado nuevoEmpleado) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                empleados.set(i, nuevoEmpleado);
                return true;
            }
        }
        return false;
    }

    //metodos para agregar, eliminar, actualizar obtener departamentos
    public void crearDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
    
    public boolean eliminarDepartamento(int id) {
        return departamentos.removeIf(d -> d.getId() == id);
    }

    public Departamento obtenerDepartamento(int id) {
        return departamentos.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    public List<Departamento> listarDepartamentos() {
        return new ArrayList<>(departamentos);
    }

    public boolean actualizarDepartamento(int id, Departamento nuevoDepartamento) {
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getId() == id) {
                departamentos.set(i, nuevoDepartamento);
                return true;
            }
        }
        return false;
    }

    public Iterable<Empleado> getEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Iterable<Empleado> getListaEmpleados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

