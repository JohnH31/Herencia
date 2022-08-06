/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario Local
 */
public class Empleado extends Persona{
    int codigo_empleado;
    String puesto;
    int Sueldo;

    public Empleado(String nombres, String apellidos, String direccion, int telefono, String fecha_naci,int codigo_empleado, String puesto, int Sueldo) {
        super(nombres, apellidos, direccion, telefono, fecha_naci);
        this.codigo_empleado = codigo_empleado;
        this.puesto = puesto;
        this.Sueldo = Sueldo;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
    
    
    
}
