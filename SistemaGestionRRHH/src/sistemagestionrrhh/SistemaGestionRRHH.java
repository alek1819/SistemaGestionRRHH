/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagestionrrhh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaGestionRRHH {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();

        Departamento ventas = new Departamento(1, "Ventas");
        Departamento tecnologia = new Departamento(2, "Tecnología");

        sistema.crearDepartamento(ventas);
        sistema.crearDepartamento(tecnologia);

        EmpleadoPermanente empleado1 = new EmpleadoPermanente("Carlos", "Gómez", "carlos@gmail.com", "123456789", 2500, "Seguro médico, Bonos", "Indefinido");
        EmpleadoTemporal empleado2 = new EmpleadoTemporal("Ana", "Martínez", "ana@gmail.com", "987654321", 1800, new Date(), 20.5);

        ventas.agregarEmpleado(empleado1);
        tecnologia.agregarEmpleado(empleado2);

        sistema.agregarEmpleado(empleado1);
        sistema.agregarEmpleado(empleado2);

        // Crear reportes
        List<ReporteDesempeno> reportes = new ArrayList<>();
        reportes.add(new ReporteDesempeno(1, empleado1, 9.5, "Excelente rendimiento", new Date()));
        reportes.add(new ReporteDesempeno(2, empleado2, 8.0, "Buen desempeño, pero mejorar puntualidad", new Date()));

        // Mostrar reportes individuales
        System.out.println("\nReportes individuales:");
        for (ReporteDesempeno reporte : reportes) {
            System.out.println(reporte.generarReporte());
        }

        // Mostrar reporte general
        System.out.println("\n" + ReporteDesempeno.generarReporteGeneral(reportes));
    }
}

