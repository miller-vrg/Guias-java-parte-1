package ventana;

/**
 *
 * @author miller vargas mola 87223
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ejecutar extends JFrame{

    private JScrollBar desValor;
    private JLabel etiValor;
    
public Ejecutar(String titulo){

this.setTitle(titulo);
this.setLayout(null);

desValor = new JScrollBar();
desValor.setOrientation(JScrollBar.HORIZONTAL);
desValor.setMaximum(150);
desValor.setMinimum(50);
desValor.setUnitIncrement(2);
desValor.setVisibleAmount(5);//tamaño de visagra
desValor.setBlockIncrement(20);
desValor.setValue(70);
desValor.setBounds(20,20,300,20);


etiValor = new JLabel();
etiValor.setBorder(BorderFactory.createLineBorder(new Color(0,194,255)));
etiValor.setHorizontalAlignment(JLabel.HORIZONTAL);
etiValor.setText("El valor es: " + desValor.getValue());
etiValor.setBounds(20,60,300,30);

desValor.addAdjustmentListener(new AdjustmentListener(){
public void adjustmentValueChanged(AdjustmentEvent evt){

etiValor.setText("El valor es: " + desValor.getValue());
    
}
});

this.add(desValor);
this.add(etiValor);

this.setSize(350,140);
this.setResizable(false);
this.setLocationRelativeTo(null);
this.setVisible(true);

}    

}
