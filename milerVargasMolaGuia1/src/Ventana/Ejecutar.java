
package Ventana;

/**
 *
 * @author miler vargas mola
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejecutar {
    
    private JFrame ventana;
    private JCheckBox  chkPerro;
    private JCheckBox chkGato;
    private JCheckBox chkRaton;
    private JButton btnAceptar;
    private JLabel etiResultado;
    private JPanel panelEtiResultado;
    private JPanel panel;
    
public void iniciar(){


this.ventana = new JFrame("Miler vargas Guia 1");

this.chkPerro = new JCheckBox("Perro");
this.chkGato = new JCheckBox("Gato");
this.chkRaton = new JCheckBox("Ratón");

this.btnAceptar = new JButton("Aceptar");
this.etiResultado = new JLabel("Aqui va el resultado");
this.etiResultado.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

this.panelEtiResultado = new JPanel();
this.panelEtiResultado.add(this.etiResultado,BorderLayout.CENTER);

this.panel = new JPanel();
this.panel.setLayout(new GridLayout(4,1));
this.panel.add(this.chkPerro);
this.panel.add(this.chkGato);
this.panel.add(this.chkRaton);
this.panel.add(this.btnAceptar);

this.ventana.getContentPane().add(this.panel,BorderLayout.WEST);
this.ventana.getContentPane().add(this.etiResultado,BorderLayout.SOUTH);

this.ventana.setSize(390,300);
this.ventana.setResizable(false);
this.ventana.setLocationRelativeTo(null);
this.ventana.setVisible(true);

this.btnAceptar.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent evento){
String mensaje = "Animales elegidos ";

if(chkPerro.isSelected()){
    
mensaje += " Perro";
}

if(chkGato.isSelected()){
    
mensaje += " Gato";
}

if(chkRaton.isSelected()){
    
mensaje += " Ratón";
}

etiResultado.setText(mensaje);
}
});
}
}