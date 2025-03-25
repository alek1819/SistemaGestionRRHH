package sistemagestionrrhh;

public class Empleado {
    private static int contadorId = 1;
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;
    private double salario;
    private String tipoEmpleado;
    private Departamento departamento;

    public Empleado(String nombre, String apellido, String email, String telefono, double salario, String tipoEmpleado) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = email;
        this.telefono = telefono;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String obtenerInformacion() {
        return "ID: " + id + ", Nombre: " + getNombreCompleto() +
            ", Email: " + correoElectronico + ", Teléfono: " + telefono +
            ", Salario: " + salario + ", Tipo: " + tipoEmpleado;
    }
}
