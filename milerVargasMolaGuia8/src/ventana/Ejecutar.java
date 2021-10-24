
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Miler vargas mola 87223
 */

public class Ejecutar extends JFrame{
    
private JSlider slDeslizador;
private JLabel etiValor;

public Ejecutar(String titulo){

this.setLayout(null);
this.setTitle(titulo);
    
slDeslizador = new JSlider();
slDeslizador.setMaximum(500);
slDeslizador.setMinimum(100);
slDeslizador.setValue(400);
slDeslizador.setPaintTicks(true);
slDeslizador.setPaintTrack(true);
slDeslizador.setPaintLabels(true);
slDeslizador.setMajorTickSpacing(50);
slDeslizador.setMinorTickSpacing(10);
slDeslizador.setFont(new Font("FreeMono",Font.BOLD,10));
slDeslizador.setForeground(Color.black);
slDeslizador.setBackground(new Color(0,194,255));
slDeslizador.setBounds(20,40,450,70);


etiValor = new JLabel();
etiValor.setBorder(BorderFactory.createLineBorder(new Color(0,194,255)));
etiValor.setBounds(20,120,450,30);
etiValor.setHorizontalAlignment(JLabel.CENTER);
etiValor.setText("El valor es: " + slDeslizador.getValue());

slDeslizador.addChangeListener(new ChangeListener(){
public void stateChanged(ChangeEvent evt){


etiValor.setText("El valor es: " + slDeslizador.getValue());

} });

this.add(slDeslizador);
this.add(etiValor);

this.setSize(500,250);
this.setLocationRelativeTo(null);
this.setResizable(false);
this.setVisible(true);
}
        
}
