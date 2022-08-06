/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import controlador.ControladorC;
import controlador.ControladorE;
import controlador.ControladorMenu;
import modelo.Cliente;
import vista.Frm_InsertarC;
import vista.Frm_InsertarE;
import vista.Menu;

/**
 *
 * @author Usuario Local
 */
public class Herencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Frm_InsertarC fic = new Frm_InsertarC();
       Frm_InsertarE fie = new Frm_InsertarE();
        Menu men = new Menu();
//        Cliente cli = new Cliente();
//        
//        ControladorInsertarC ci = new ControladorInsertarC(fic, cli);
        ControladorMenu cm = new ControladorMenu(men, fic,fie);
//        ControladorMostrar cmo = new ControladorMostrar(fmo, cli);
    ControladorC com = new ControladorC(fic);
    ControladorE comm = new ControladorE(fie);
        
        men.setVisible(true);
        men.setLocationRelativeTo(null);
    }
    
}
