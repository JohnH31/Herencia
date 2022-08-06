/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario Local
 */
public class Empleado extends Persona {
    int codigo_empleado;
    String puesto;
    
    List<String> lis = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    int conteo=0;
    
    public void años(){
        
    }

    public void Ingresar() {
        conteo++;
        lis.add(String.valueOf(conteo));
        System.out.println("Ingrese nombres: ");
        nombres = sc.next();
        lis.add(nombres);
        System.out.println("Ingrese Apellidos: ");
        apellidos = sc.next();
        lis.add(apellidos);
        System.out.println("Ingrese Direccion: ");
        direccion = sc.next();
        lis.add(direccion);
        System.out.println("Ingrese Fecha de Nacimiento dd/MM/yyyy: ");
        fecha_nacimiento = sc.next();
        lis.add(fecha_nacimiento);
        System.out.println("Ingrese Telefono: ");
        telefono = sc.nextInt();
        lis.add(String.valueOf(telefono));
        System.out.println("Ingrese codigo de empleado: ");
        codigo_empleado = sc.nextInt();
        lis.add(String.valueOf(codigo_empleado));
        System.out.println("Ingrese puesto: ");
        puesto = sc.next();
        lis.add(puesto);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(fecha_nacimiento, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        lis.add(String.valueOf(periodo.getYears()));
        System.out.println();

    }

    public void Mostrar() {
        if (!lis.isEmpty()) {
            System.out.println("Datos ingresados Empleados");
            System.out.println("Empleado: "+lis.get(0));
            System.out.println("Nombres: "+lis.get(1));
            System.out.println("Apellidos: "+lis.get(2));
            System.out.println("Direccion: "+lis.get(3));
            System.out.println("Fecha de Nacimiento: "+lis.get(4));
            System.out.println("Telefono: "+lis.get(5));
            System.out.println("Codigo Empleado: "+lis.get(6));
            System.out.println("Puesto: "+lis.get(7));
            System.out.println("Edad: "+lis.get(8));
            
        }else{
                System.out.println("No hay valores que mostrar");
                }
        System.out.println();
    }

    public void Modificar() {
        String valor1, valor2;
        int indice;
        System.out.println("Valor a modificar:");
        valor1 = sc.next();
        indice = lis.indexOf(valor1);
        if (indice != -1) {
            System.out.println("Nuevo Valor: ");
            valor2 = sc.next();
            lis.set(indice, valor2);
        } else {
            System.out.println("Dato no encontrado");
        }
        System.out.println();
    }
    
        public void Eliminar() {
        String valor1;
        int indice;
        System.out.println("Valor a eliminar:");
        valor1 = sc.next();
        indice = lis.indexOf(valor1);
        if (indice != -1) {
            lis.remove(indice);
            System.out.println("Dato Eliminado");
        } else {
            System.out.println("Dato no encontrado");
        }
            System.out.println();
    }
}
