/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Frm_InsertarC;
import vista.Frm_InsertarE;
import vista.Menu;

/**
 *
 * @author Usuario Local
 */
public class ControladorMenu implements ActionListener{
    Menu men = new Menu();
    Frm_InsertarC fic = new Frm_InsertarC();
    Frm_InsertarE fie = new Frm_InsertarE();

    public ControladorMenu(Menu men, Frm_InsertarC fic,Frm_InsertarE fie ) {
        this.men = men;
        this.fic = fic;
        this.fie = fie;

        men.btnInsertar.addActionListener(this);
        men.btnInsertarE.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == men.btnInsertar) {
            fic.setVisible(true);
            fic.setLocationRelativeTo(null);
        }
        if (e.getSource() == men.btnInsertarE) {
            fie.setVisible(true);
            fie.setLocationRelativeTo(null);
        }
    }
}
