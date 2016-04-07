/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanager;

import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maciej
 */
public class Dodaj extends javax.swing.JFrame {

    /**
     * Creates new form Dodaj
     */
    public Dodaj() {

        initComponents();

        Generator token1 = new Generator();

        Tokenfield.setText(token1.nextSessionId());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typbox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PESELpole = new javax.swing.JTextField();
        NazwiskoPole = new javax.swing.JTextField();
        ImiePole = new javax.swing.JTextField();
        WiekPole = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ChorobaPole = new javax.swing.JTextArea();
        PlecPole = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Tokenfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Typbox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tytulf = new javax.swing.JTextField();
        Stanf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        typbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lekarz", "pacjent" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(675, 395));
        setMinimumSize(new java.awt.Dimension(675, 395));
        setPreferredSize(new java.awt.Dimension(675, 395));
        getContentPane().setLayout(null);

        jLabel1.setText("PESEL:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 70, 50, 20);

        jLabel2.setText("Nazwisko:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 100, 60, 20);

        jLabel3.setText("Imię:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 130, 40, 14);

        jLabel4.setText("Wiek:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 160, 40, 20);

        PESELpole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PESELpoleActionPerformed(evt);
            }
        });
        getContentPane().add(PESELpole);
        PESELpole.setBounds(350, 70, 110, 30);

        NazwiskoPole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NazwiskoPoleActionPerformed(evt);
            }
        });
        getContentPane().add(NazwiskoPole);
        NazwiskoPole.setBounds(350, 100, 110, 30);
        getContentPane().add(ImiePole);
        ImiePole.setBounds(350, 130, 100, 30);

        WiekPole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WiekPoleActionPerformed(evt);
            }
        });
        getContentPane().add(WiekPole);
        WiekPole.setBounds(350, 160, 70, 30);

        jLabel5.setText("Płeć:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 190, 30, 14);

        jLabel6.setText("Choroby:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(103, 263, 60, 14);

        ChorobaPole.setColumns(20);
        ChorobaPole.setRows(5);
        jScrollPane1.setViewportView(ChorobaPole);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(166, 263, 230, 81);
        getContentPane().add(PlecPole);
        PlecPole.setBounds(350, 190, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 153));
        jLabel7.setText("Dodawanie pacjenta/lekarza:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 26, 260, 22);

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(581, 326, 61, 23);

        Tokenfield.setEditable(false);
        Tokenfield.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Tokenfield.setForeground(new java.awt.Color(0, 255, 0));
        Tokenfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TokenfieldActionPerformed(evt);
            }
        });
        getContentPane().add(Tokenfield);
        Tokenfield.setBounds(517, 62, 110, 60);

        jLabel8.setText("Token:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(470, 60, 50, 14);

        Typbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "lekarz", "pacjent" }));
        Typbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Typbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypboxActionPerformed(evt);
            }
        });
        getContentPane().add(Typbox);
        Typbox.setBounds(310, 10, 70, 30);

        jLabel9.setText("Typ:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(280, 10, 30, 20);

        jLabel10.setText("Stanowisko:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 130, 70, 14);

        jLabel11.setText("Tytuł:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 100, 40, 14);
        getContentPane().add(tytulf);
        tytulf.setBounds(90, 100, 100, 30);
        getContentPane().add(Stanf);
        Stanf.setBounds(90, 130, 70, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background (1).png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 660, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NazwiskoPoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NazwiskoPoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NazwiskoPoleActionPerformed

    private void PESELpoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PESELpoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PESELpoleActionPerformed

    private void WiekPoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WiekPoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WiekPoleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String pesel, nazw, imie, wiek, plec, chor, token, typ, tyt, stan;
        pesel = PESELpole.getText();
        nazw = NazwiskoPole.getText();
        imie = ImiePole.getText();
        wiek = WiekPole.getText();
        plec = PlecPole.getText();
        chor = ChorobaPole.getText();
        token = Tokenfield.getText();
        tyt = tytulf.getText();
        stan = Stanf.getText();
        if (pesel.length() == 11) {
            try {
                // TODO add your handling code here:

               
                DataBaseConnection data = new DataBaseConnection();
                int index = Typbox.getSelectedIndex();

                if (index == 1) {
                    DataBaseConnection.s = "INSERT INTO Pacjen (PESEL, Nazwisko, Imie, Wiek, Płeć, [Choroby Przewlekłe],Token) VALUES (" + pesel + ", '" + nazw + "', '" + imie + "', '" + wiek + "','" + plec + "', '" + chor + "', '" + token + "')";
                }
                if (index == 0) {
                    DataBaseConnection.s = "INSERT INTO Praco (PESEL, Tytuł, Stanowisko, Token) VALUES (" + pesel + ", '" + tyt + "', '" + stan + "', '" + token + "')";
                }
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
                Logger.getLogger(Dodaj.class.getName()).log(Level.SEVERE, null, ex);
            }


    }//GEN-LAST:event_jButton1ActionPerformed
         if (pesel.length() != 11) {
            System.err.println("blad");
        
       JOptionPane.showMessageDialog(null, "Cos poszło ni tak :<. Sprawdź wprowadzone dane .", "Error",
                                    JOptionPane.ERROR_MESSAGE);
         }
    }
    
    private void TokenfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TokenfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TokenfieldActionPerformed

    private void TypboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypboxActionPerformed
        // TODO add your handling code here:

        int index = Typbox.getSelectedIndex();
        if (index == 0) {
            tytulf.setEnabled(true);
            Stanf.setEnabled(true);
            PESELpole.setEnabled(true);

            NazwiskoPole.setEnabled(false);
            ImiePole.setEnabled(false);
            WiekPole.setEnabled(false);
            PlecPole.setEnabled(false);
            ChorobaPole.setEnabled(false);

        } else if (index == 1) {
            tytulf.setEnabled(false);
            Stanf.setEnabled(false);

            PESELpole.setEnabled(true);
            NazwiskoPole.setEnabled(true);
            ImiePole.setEnabled(true);
            WiekPole.setEnabled(true);
            PlecPole.setEnabled(true);
            ChorobaPole.setEnabled(true);

        }
    }//GEN-LAST:event_TypboxActionPerformed
    public final class SessionIdentifierGenerator {

        private SecureRandom random = new SecureRandom();

        public String nextSessionId() {
            return new BigInteger(130, random).toString(32);
        }
    }

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
            java.util.logging.Logger.getLogger(Dodaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodaj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodaj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ChorobaPole;
    private javax.swing.JTextField ImiePole;
    private javax.swing.JTextField NazwiskoPole;
    private javax.swing.JTextField PESELpole;
    private javax.swing.JTextField PlecPole;
    private javax.swing.JTextField Stanf;
    private javax.swing.JTextField Tokenfield;
    private javax.swing.JComboBox Typbox;
    private javax.swing.JTextField WiekPole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox typbox;
    private javax.swing.JTextField tytulf;
    // End of variables declaration//GEN-END:variables
}
