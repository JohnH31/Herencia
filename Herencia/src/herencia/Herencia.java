/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Scanner;

/**
 *
 * @author Usuario Local
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        Empleado empleado = new Empleado();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. Agregar Cliente");
            System.out.println("2. Modificar Cliente");
            System.out.println("3. Eliminar Cliente");
            System.out.println("4. Mostrar Clientes");
            System.out.println("5. Agregar Empleado");
            System.out.println("6. Modificar Empleado");
            System.out.println("7. Eliminar Empleado");
            System.out.println("8. Mostrar Empleado");
            System.out.println("9. Salir");

            System.out.print("Escribe una de las opciones: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    cliente.Ingresar();
                    break;
                case 2:
                    cliente.Modificar();
                    break;
                case 3:
                    cliente.Eliminar();
                    break;
                case 4:
                    cliente.Mostrar();
                    break;
                    case 5:
                    empleado.Ingresar();
                    break;
                case 6:
                    empleado.Modificar();
                    break;
                case 7:
                    empleado.Eliminar();
                    break;
                case 8:
                    empleado.Mostrar();
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 9");
            }

        }

    }

}
