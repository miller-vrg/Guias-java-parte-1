
package unisinu.desarrollo1.mvg.guia35;

import javax.swing.ImageIcon;

/**
 *
 * @author Miler vargas mola
 */

public class VentanaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaInterna
     */
    public VentanaInterna() {
        initComponents();
    }

    public void setImagen(String camino){
    ImageIcon imagen = new ImageIcon(camino);
    etiImagen.setIcon(imagen);
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiImagen = new javax.swing.JLabel();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiImagen;
    // End of variables declaration//GEN-END:variables
}