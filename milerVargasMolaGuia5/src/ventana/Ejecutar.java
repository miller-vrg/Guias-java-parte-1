
package ventana;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Miller vargas Mola 87223
 */

public class Ejecutar extends JFrame{
    
private JLabel etiResultado;
private JList lstNombres;
private JScrollPane scroll;
private JButton btnCurso1, btnCurso2,btnBorrar;

public Ejecutar(String title){

this.setTitle(title);
this.setLayout(null);

lstNombres = new JList();

scroll = new JScrollPane(lstNombres);
scroll.setBounds(10,10,150,190);

etiResultado = new JLabel();
etiResultado.setBorder(BorderFactory.createLineBorder(Color.black));
etiResultado.setBounds(180,10,300,40);

btnCurso1 = new JButton("Curso 1");
btnCurso1.setBounds(10,210,90,28);

btnCurso2 = new JButton("Curso 2");
btnCurso2.setBounds(10,250,90,28);

btnBorrar = new JButton("Borrar");
btnBorrar.setBounds(10,298,90,28);

btnBorrar.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){
etiResultado.setText("");
DefaultListModel modelo = new DefaultListModel();
modelo.addElement("");
modelo.addElement("");
modelo.addElement("");
lstNombres.setModel(modelo);
}

});

btnCurso1.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){

etiResultado.setText("");

DefaultListModel modelo = new DefaultListModel();
modelo.addElement("Juan");
modelo.addElement("Maria");
modelo.addElement("Luis");

lstNombres.setModel(modelo);

}

});

btnCurso2.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent evento){

DefaultListModel modelo = new DefaultListModel();
modelo.addElement("Ana");
modelo.addElement("Marta");
modelo.addElement("Jose");
lstNombres.setModel(modelo);
}

});

lstNombres.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent evt) {
    etiResultado.setText(lstNombres.getSelectedValue().toString());
    }
});



this.add(scroll);
this.add(etiResultado);
this.add(btnCurso1);
this.add(btnCurso2);
this.add(btnBorrar);
this.setSize(500,400);
this.setLocationRelativeTo(null);

}

}
