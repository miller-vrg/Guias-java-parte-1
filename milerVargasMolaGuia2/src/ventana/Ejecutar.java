
package ventana;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author mmiler vargas mola 87223
 */
public class Ejecutar extends JFrame{
    
    private JPanel panel;
    private JRadioButton optRojo;
    private JRadioButton optVerde;
    private JRadioButton optAzul;
    private JButton btnAceptar;
    private JLabel etiResultado;
    private ButtonGroup grupo;
    
public Ejecutar(String titulo){
  
this.setTitle(titulo);
this.setLayout(null);

panel = new JPanel();

TitledBorder borde = new TitledBorder("Colores");
//borde.setTitleColor(new Color(0,0,255));
borde.setTitleFont(new Font("FreeMono",Font.BOLD,14));

panel.setLayout(new GridLayout(3,1));
panel.setBorder(borde);

optRojo = new JRadioButton("Rojo");
//optRojo.setForeground(Color.red);

optRojo.setSelected(true);

optVerde = new JRadioButton("Verde");
//optVerde.setForeground(Color.green);

optAzul = new JRadioButton("Azul");
//optAzul.setForeground(Color.blue);

btnAceptar = new JButton("Aceptar");
        
etiResultado = new JLabel();   
etiResultado.setBorder(BorderFactory.createLineBorder(Color.black));

panel.add(optRojo);
panel.add(optVerde);
panel.add(optAzul);

panel.setBounds(30,30,250,150);
btnAceptar.setBounds(30,185,90,30);

etiResultado.setBounds(30,250,400,30);

grupo = new ButtonGroup();
grupo.add(optRojo);
grupo.add(optVerde);
grupo.add(optAzul);


this.add(panel);
this.add(btnAceptar);
this.add(etiResultado);

btnAceptar.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent e){

String mensaje = "Color elegido: ";

mensaje += (optRojo.isSelected())? " Rojo" : "";
mensaje += (optVerde.isSelected())? " Verde" : "";
mensaje += (optAzul.isSelected())? " Azul" : "";


etiResultado.setText(mensaje);

    
}
});
    
    }
}
