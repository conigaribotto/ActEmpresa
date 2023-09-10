
package actempresa;


public class Empleado implements Comparable<Empleado>{
    int dni;
    String nombre;
    String apellido;
    String categoria;
    double sueldo;
    Empresa empresa;

 Empleado(int dni, String nombre, String apellido, Empresa empresa, String categoria, double sueldo) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.categoria = categoria;
    this.sueldo = sueldo;
    this.empresa = empresa;
}


    Empleado(int dni2, String nombre, String apellido, String empresa, String categoria, double sueldo1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Empleado() {
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;

}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public int compareTo(Empleado t) {
         return Integer.compare(this.dni, empresa.cuit);

    }
}
