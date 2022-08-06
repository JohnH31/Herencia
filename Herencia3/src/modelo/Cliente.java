/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario Local
 */
public class Cliente extends Persona{
    public int nit;

    public Cliente(String nombres, String apellidos, String direccion, int telefono, String fecha_naci,int nit) {
        super(nombres, apellidos, direccion, telefono, fecha_naci);
        this.nit = nit;
    }
    
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
}
