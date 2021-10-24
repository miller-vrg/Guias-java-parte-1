
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Miler vargas mola 87223
 */

public class Ejecutar extends JFrame {
    
   private JLabel etiPrecio,etiTotal,etiInstalacion;
   private JLabel etiAlimentacion, etiFormacion;
   private JTextField txtPrecio;
   private JButton btnCalcular;
   private JToggleButton tbtnInstalacion, tbtnFormacion, tbtnAlimentacionBD;

   
public Ejecutar(String titulo){
    
this.setLayout(null);
this.setTitle(titulo);

etiPrecio = new JLabel("Precio Base");
etiPrecio.setFont(new Font("FreeMono",Font.BOLD,12));
etiPrecio.setBounds(10,10,160,30);

txtPrecio = new JTextField();
txtPrecio.setFont(new Font("FreeMono",Font.BOLD,12));
txtPrecio.setBorder(BorderFactory.createLineBorder(new Color(0,191,255)));
txtPrecio.setBounds(10,40,160,30);

tbtnInstalacion = new JToggleButton ("Instalación");
tbtnInstalacion.setFont(new Font("FreeMono",Font.BOLD,12));
tbtnInstalacion.setBackground(Color.white);
tbtnInstalacion.setBorder(BorderFactory.createLineBorder(new Color(0,191,255)));
tbtnInstalacion.setSelected(true);
tbtnInstalacion.setBounds(10,150,160,30);

etiInstalacion = new JLabel("40");
etiInstalacion.setFont(new Font("FreeMono",Font.BOLD,12));
etiInstalacion.setBounds(180,150,100,30);

tbtnFormacion = new JToggleButton("Formación");
tbtnFormacion.setFont(new Font("FreeMono",Font.BOLD,12));
tbtnFormacion.setBackground(Color.white);
tbtnFormacion.setBorder(BorderFactory.createLineBorder(new Color(0,191,255)));
tbtnFormacion.setBounds(10,190,160,30);

etiFormacion = new JLabel("200");
etiFormacion.setFont(new Font("FreeMono",Font.BOLD,12));
etiFormacion.setBounds(180,190,100,30);

tbtnAlimentacionBD = new JToggleButton("Alimentacion BD");
tbtnAlimentacionBD.setFont(new Font("FreeMono",Font.BOLD,12));
tbtnAlimentacionBD.setBackground(Color.white);
tbtnAlimentacionBD.setBorder(BorderFactory.createLineBorder(new Color(0,191,255)));
tbtnAlimentacionBD.setBounds(10,230,160,30);

etiAlimentacion = new JLabel("200");
etiAlimentacion.setFont(new Font("FreeMono",Font.BOLD,12));
etiAlimentacion.setBounds(180,230,100,30);

btnCalcular = new JButton ("Calcular");
btnCalcular.setFont(new Font("FreeMono",Font.BOLD,12));
btnCalcular.setBackground(Color.white);
btnCalcular.setBorder(BorderFactory.createLineBorder(new Color(0,191,255)));
btnCalcular.setBounds(10,340,160,30);

etiTotal = new JLabel();
etiTotal.setFont(new Font("FreeMono",Font.BOLD,12));
etiTotal.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
etiTotal.setBounds(10,378,160,50);

this.add(etiPrecio);
this.add(txtPrecio);

this.add(tbtnAlimentacionBD);
this.add(etiInstalacion);

this.add(tbtnFormacion);
this.add(etiFormacion);

this.add(tbtnInstalacion);
this.add(etiAlimentacion);

this.add(btnCalcular);
this.add(etiTotal);

btnCalcular.addActionListener(new ActionListener(){
@Override 
public void actionPerformed(ActionEvent evento){

try{
    
Double total = Double.parseDouble(txtPrecio.getText());

total += (tbtnInstalacion.isSelected())? 40 : 0;
total += (tbtnFormacion.isSelected())? 200 : 0;
total += (tbtnAlimentacionBD.isSelected())? 200 : 0;

etiTotal.setHorizontalAlignment(JLabel.CENTER);
etiTotal.setText("Precio Total: $" + total);

}catch(NumberFormatException error){

JOptionPane.showMessageDialog(null,"Por favor solo valores numericos","ERROR!",JOptionPane.ERROR_MESSAGE);
}
}
});

int total;



this.setSize(320,520);
this.setLocationRelativeTo(null);
this.setResizable(false);
}
    
}
