/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanager;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maciej
 */
public class Usun extends javax.swing.JFrame {

    /**
     * Creates new form Usun
     */
    public Usun() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        peselField = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(360, 232));
        setMinimumSize(new java.awt.Dimension(360, 232));
        getContentPane().setLayout(null);

        jLabel1.setText("PESEL:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 50, 14);

        peselField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peselFieldActionPerformed(evt);
            }
        });
        getContentPane().add(peselField);
        peselField.setBounds(110, 90, 150, 30);

        jToggleButton1.setText("Usuń");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(146, 158, 90, 33);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 153));
        jLabel2.setText("Usuwanie pacjenta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 5, 233, 36);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background (1).png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 360, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            try {                                               
                // TODO add your handling code here:
                
                
                String pesel, nazw;
                pesel = peselField.getText();
            
                
                DataBaseConnection data = new DataBaseConnection();
                DataBaseConnection.s = "DELETE FROM Pacjen WHERE PESEL="+pesel+"";
                try {
                    data.Connection();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Dodaj.class.getName()).log(Level.SEVERE, null, ex);
                }
                Menu frame = new Menu();
                this.setVisible(false);
                
                frame.zaladuj();
                // frame.setVisible(false);
                frame.setVisible(true);
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Usun.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void peselFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peselFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peselFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField peselField;
    // End of variables declaration//GEN-END:variables
}