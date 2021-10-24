
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author miller vargas mola 87223
 */
public class Ejecutar extends JFrame {
 
    private JPanel panel;
    private JLabel etiResultado;
    private JButton btnAceptar;
    private JList lstColores;
    private JScrollPane scroll;
    

 public Ejecutar(String titulo){
 String[] colores = {"Rojo","Verde","Azul"};
 
 this.setTitle(titulo);
 this.setLayout(null);
 
 lstColores = new JList(colores);


 scroll = new JScrollPane();
 scroll.setViewportView(lstColores);
 scroll.setBounds(30,30,150,100);
 
 btnAceptar = new JButton("Aceptar");
 btnAceptar.setBounds(30,137,90,25);
 
 etiResultado = new JLabel();
 etiResultado.setBorder(BorderFactory.createLineBorder(Color.black));
 etiResultado.setBounds(30,180,250,40);
 
 btnAceptar.addActionListener(new ActionListener(){
 @Override
 public void actionPerformed(ActionEvent e){
 
 String mensaje;
  if(lstColores.getSelectedIndex() < 0){
 mensaje = "No hay numero seleccionado";

 }else{
         
 mensaje = "El color selecionado es: " + lstColores.getSelectedValue().toString();

         
 }
   etiResultado.setText(mensaje);
 }
 
 });
 
 
 this.add(scroll);
 this.add(btnAceptar);
 this.add(etiResultado);
 this.setBounds(0,0,400,300);
 }

}
