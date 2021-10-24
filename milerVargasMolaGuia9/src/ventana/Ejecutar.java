
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
    
    private JSpinner spiValor;
    private JLabel etiValor;
    
public Ejecutar(String titulo){
 
this.setTitle(titulo);
this.setLayout(null);


SpinnerNumberModel nm = new SpinnerNumberModel();
nm.setMaximum(10);
nm.setMinimum(0);
nm.setStepSize(2);

spiValor = new JSpinner();
spiValor.setModel(nm);
spiValor.setValue(5);
spiValor.setBounds(140,10,110,20);
 
etiValor = new JLabel();
etiValor.setBorder(BorderFactory.createLineBorder(new Color(0,194,255)));
etiValor.setText("El valor es: " + spiValor.getValue());
etiValor.setBounds(140,40,110,20);


spiValor.addChangeListener(new ChangeListener(){
public void stateChanged(ChangeEvent evt){
    
 etiValor.setText("El valor es: " + spiValor.getValue());
    
}
});

this.add(spiValor);
this.add(etiValor);

this.setSize(400,100);
this.setLocationRelativeTo(null);
this.setVisible(true);

 }
}
