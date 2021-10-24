
package ventana;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Miler Vargas Mola 87223
 */

public class Ejecutar extends JFrame{
    
private JMenuBar menu;
    
public Ejecutar(String titulo){
    
this.setLayout(null);
this.setTitle(titulo);

JMenu archivo = new JMenu("Archivo");
JMenuItem abrir = new JMenuItem("Abrir");
JMenuItem guardar = new JMenuItem("Guardar");
JMenuItem salir = new JMenuItem("Salir");
archivo.add(abrir);
archivo.add(guardar);
archivo.add(salir);


JMenu edicion = new JMenu("Edición");
JMenu colores = new JMenu("Colores");

JMenuItem rojo = new JMenuItem("Rojo");
JMenuItem verde = new JMenuItem("Verde");
JMenuItem azul = new JMenuItem("Azul");
colores.add(rojo);
colores.add(verde);
colores.add(azul);
edicion.add(colores);

JMenu inertsar = new JMenu("Insertar");

menu  = new JMenuBar();
menu.add(archivo);
menu.add(edicion);
menu.add(inertsar);

menu.setBounds(0,0,200,30);


rojo.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

    getContentPane().setBackground(Color.red);

}

});

verde.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

getContentPane().setBackground(Color.green);
    
}

});

azul.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

getContentPane().setBackground(Color.blue);
    
}

});

this.add(menu);
this.setSize(350,400);
this.setLocationRelativeTo(null);
this.setResizable(false);
this.setVisible(true);

}


}
