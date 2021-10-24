
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author MIler vargas mola
 */

public class Ejecutar extends JFrame {
    
    private JComboBox cboColores;
    private JLabel etiResultado;
    private String mensaje;
    
  public Ejecutar(String titulo){
 
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setTitle(titulo);
      this.setLayout(null);
      this.setBounds(0,0,450,200);
      
   String[] colores = {"Rojo","Verde","Azul"};
   
   cboColores = new JComboBox(colores);       
   cboColores.setBounds(10,20,90,20);
   cboColores.setEditable(true);
    
   etiResultado = new JLabel();
   etiResultado.setBorder(BorderFactory.createLineBorder(Color.black));
   etiResultado.setBounds(10,110,400,30);
   
   cboColores.addActionListener(new ActionListener(){
   @Override
   public void actionPerformed(ActionEvent evento){
   
   mensaje = "El color elejido es: ";
   mensaje += cboColores.getSelectedItem().toString();
   etiResultado.setText(mensaje);
   
   }});
   
    this.add(cboColores);
    this.add(etiResultado);
    
  }
}
