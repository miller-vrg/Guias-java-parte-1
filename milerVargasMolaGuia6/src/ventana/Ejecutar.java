
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Miller vargas mola 87223
 */

public class Ejecutar extends JFrame {

private JComboBox cboNumeros;
private JButton btnPares,btnImpares,btnVaciar;
private JLabel etiResultado;

public Ejecutar(String titulo){

this.setLayout(null);
this.setSize(500,400);

cboNumeros = new JComboBox();
cboNumeros.setBounds(10, 20, 180, 25);

btnPares = new JButton("Pares");
btnPares.setBounds(200,20,100,25);

btnImpares = new JButton("Impares");
btnImpares.setBounds(310,20,100,25);

btnVaciar = new JButton("Vaciar");
btnVaciar.setBounds(331,200,100,30);

etiResultado =  new JLabel();
etiResultado.setBorder(BorderFactory.createLineBorder(Color.black));
etiResultado.setBounds(10,200,320,30);



btnPares.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){

DefaultComboBoxModel modelo = new DefaultComboBoxModel();

for(int i = 0; i < 10; i += 2){

modelo.addElement("N° " + i);

}
cboNumeros.setModel(modelo); 

}
});

btnImpares.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){

DefaultComboBoxModel modelo = new DefaultComboBoxModel();

for(int i = 1; i < 10; i += 2){

modelo.addElement("N° " + i);

}
cboNumeros.setModel(modelo); 

}
});

cboNumeros.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){

etiResultado.setText(cboNumeros.getSelectedItem().toString());

}
});

btnVaciar.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){

etiResultado.setText("");

}
});

this.add(cboNumeros);
this.add(btnPares);
this.add(btnImpares);
this.add(etiResultado);
this.add(btnVaciar);


}    
}
