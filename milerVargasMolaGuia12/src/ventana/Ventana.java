
package ventana;

import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Miller vargas mola
 */

public class Ventana extends JFrame{

    private JMenuBar menuBar;
    private JMenu menu;
    private JToolBar toolBar;
    private JButton btn1,btn2,btn3,btn4;
    private ImageIcon whatssap,telegram,git,facebook;
    
public  Ventana (String titulo) {

this.setLayout(null);
this.setTitle(titulo);

whatssap = new ImageIcon(getClass().getResource("/img/whatsapp.png"));
telegram = new ImageIcon(getClass().getResource("/img/telegrama.png"));
git = new ImageIcon(getClass().getResource("/img/github.png"));
facebook = new ImageIcon(getClass().getResource("/img/facebook.png"));

menu = new JMenu("Menu");
menuBar = new JMenuBar();
menuBar.add(menu);
menuBar.setBounds(0,0,320,30);

btn1 = new JButton();
btn1.setIcon(whatssap);

btn2 = new JButton();
btn2.setIcon(telegram);

btn3 = new JButton();
btn3.setIcon(git);

btn4 = new JButton();
btn4.setIcon(facebook);

toolBar = new JToolBar();
toolBar.add(btn1);
toolBar.add(btn2);
toolBar.add(btn3);
toolBar.add(btn4);
toolBar.setBounds(0,31,320,40);

btn1.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

JOptionPane.showMessageDialog(null, "Activaste el boton Uno");

}
});

btn2.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

JOptionPane.showMessageDialog(null, "Activaste el boton Dos");

}
});

btn3.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

JOptionPane.showMessageDialog(null, "Activaste el boton Tres");

}
});

btn4.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evt){

JOptionPane.showMessageDialog(null, "Activaste el boton Cuatro");

}
});


this.add(menuBar);
this.add(toolBar);
this.setSize(320,200);
this.setLocationRelativeTo(null);
this.setResizable(false);
this.setVisible(true);
}    
}
