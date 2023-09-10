
package actempresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Empresa  {
   String razonSocial;
    int cuit;
    ArrayList<Empleado> empleados;

    public Empresa() {
    }
    
    public Empresa(String razonSocial, int cuit) {
    this.razonSocial = razonSocial;
    this.cuit = cuit;
    empleados = new ArrayList<Empleado>();
}

    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}