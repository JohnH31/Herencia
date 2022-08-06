/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import vista.Frm_InsertarC;

/**
 *
 * @author Usuario Local
 */
public class ControladorC implements ActionListener, WindowListener,MouseListener {

    Frm_InsertarC fic = new Frm_InsertarC();
    ArrayList<Cliente> cliente;

    public ControladorC(Frm_InsertarC fic) {
        this.fic = fic;
        cliente = new ArrayList<Cliente>();

        fic.btnInsertarC.addActionListener(this);
        fic.btnCancelarC.addActionListener(this);
        fic.btnModificarC.addActionListener(this);
        fic.addWindowListener(this);
        fic.tblMostrar.addMouseListener(this);
    }

    public void insetar() {
        try {
            cliente.add(new Cliente(fic.txtNombres.getText(), fic.txtApellidos.getText(), fic.txtDireccion.getText(), 
                    Integer.parseInt(fic.txtTelefono.getText()), fic.txtFechaN.getText(), Integer.parseInt(fic.txtNit.getText())));
            JOptionPane.showMessageDialog(null, "Registro Ingresado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Datos para guardar registro");
        }
        this.limpiar();
    }

    public void mostrar() {
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnCount(0);
        m.addColumn("Nombres");
        m.addColumn("Apellidos");
        m.addColumn("Direccion");
        m.addColumn("Telefono");
        m.addColumn("Fecha de Nacimiento");
        m.addColumn("Nit");
        m.addColumn("Edad");
        fic.tblMostrar.setModel(m);
        Object[] info = new Object[7];
        Cliente cli;
        for (int i = 0; i < cliente.size(); i++) {
            cli = cliente.get(i);
            info[0] = cli.getNombres();
            info[1] = cli.getApellidos();
            info[2] = cli.getDireccion();
            info[3] = Integer.toString(cli.getTelefono());
            info[4] = cli.getFecha_naci();
            info[5] = Integer.toString(cli.getNit());
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(cli.getFecha_naci(), fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
            info[6] = String.valueOf(periodo.getYears());
            m.addRow(info);
        }
    }

    public void limpiar() {
        fic.txtNombres.setText("");
        fic.txtApellidos.setText("");
        fic.txtDireccion.setText("");
        fic.txtTelefono.setText("");
        fic.txtFechaN.setText("");
        fic.txtNit.setText("");
    }
    
        public void datos() {
        int row;
        row = fic.tblMostrar.getSelectedRow();
        fic.txtNombres.setText(String.valueOf(fic.tblMostrar.getValueAt(row, 0)));
        fic.txtApellidos.setText(String.valueOf(fic.tblMostrar.getValueAt(row, 1)));
        fic.txtDireccion.setText(String.valueOf(fic.tblMostrar.getValueAt(row, 2)));
        fic.txtTelefono.setText(String.valueOf(fic.tblMostrar.getValueAt(row, 3)));
        fic.txtFechaN.setText(String.valueOf(fic.tblMostrar.getValueAt(row, 4)));
        fic.txtNit.setText(String.valueOf(fic.tblMostrar.getValueAt(row, 5)));

    }

    public void modi() {
        Cliente aux;
        try {
            int c = fic.tblMostrar.getSelectedRow();
            aux = cliente.get(c);
            aux.setNombres(fic.txtNombres.getText());
            aux.setApellidos(fic.txtApellidos.getText());
            aux.setDireccion(fic.txtDireccion.getText());
            aux.setTelefono(Integer.parseInt(fic.txtTelefono.getText()));
            aux.setFecha_naci(fic.txtFechaN.getText());
            aux.setNit(Integer.parseInt(fic.txtNit.getText()));
            JOptionPane.showMessageDialog(null,"Registro Modificado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Debe ingresar Datos para Modificar registro");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fic.btnInsertarC) {
            this.insetar();
            //fic.dispose();
        }
        if (e.getSource() == fic.btnCancelarC) {
            fic.dispose();
        }
        if (e.getSource() == fic.btnModificarC) {
            this.modi();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (cliente.size()!=0) {
            this.mostrar();
        }

    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        if (cliente.size()!=0) {
            this.mostrar();
        }
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.datos();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
