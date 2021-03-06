/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.form;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.silab.gui.example1.controller.Controller;
import rs.ac.bg.fon.silab.gui.example1.session.Session;
import rs.ac.bg.fon.silab.jdbc.example1.domen.RadnikEntity;

/**
 *
 * @author Antic
 */
public class FLogovanje extends javax.swing.JFrame {

    String ip = "localhost";
    int port = 9009;
    /**
     * Creates new form FLogovanje
     */
    public FLogovanje() {
        initComponents();
        setLocationRelativeTo(null);
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
        jTextFieldKorIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldLozinka = new javax.swing.JTextField();
        jButtonLogovanje = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        btnUnesiParametre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Korisnicko ime: ");

        jLabel2.setText(" Lozinka: ");

        jButtonLogovanje.setText("Ulogujte se");
        jButtonLogovanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogovanjeActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("localhost:9009");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton2.setText("Konektujte se");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnUnesiParametre.setText("Unesi parametre za konekciju");
        btnUnesiParametre.setEnabled(false);
        btnUnesiParametre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnesiParametreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldKorIme, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonLogovanje)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUnesiParametre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUnesiParametre)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldKorIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButtonLogovanje)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogovanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogovanjeActionPerformed
        try {
            String korIme = jTextFieldKorIme.getText();
            String loz = jTextFieldLozinka.getText();
            RadnikEntity r = new RadnikEntity(korIme, loz);
            r = Controller.logovanje(r);
            JOptionPane.showMessageDialog(null, "Uspesno ste se ulogovali.");
            JDialog fmain = new FGlavniMeni(this, true,r);
            fmain.setVisible(true);
            this.setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Radnik ne postoji.");
            Logger.getLogger(FLogovanje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLogovanjeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (!jCheckBox1.isSelected()) {
            btnUnesiParametre.setEnabled(true);
        } else {
            btnUnesiParametre.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Socket socket = new Socket(ip, port);
            Session.getInstance().setSocket(socket);
            jButtonLogovanje.setEnabled(true);
            JOptionPane.showMessageDialog(this, "Uspesno ste se konektovali na server!");
            jCheckBox1.setEnabled(false);
            jButton2.setEnabled(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Neuspesna konekcija na server.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUnesiParametreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnesiParametreActionPerformed
        FKonekcija f = new FKonekcija(this, true);
        f.setVisible(true);
    }//GEN-LAST:event_btnUnesiParametreActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUnesiParametre;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLogovanje;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldKorIme;
    private javax.swing.JTextField jTextFieldLozinka;
    // End of variables declaration//GEN-END:variables

//    private void povezivanjeNaServer() {
//        try {
//            Socket socket = new Socket("localhost", 9009);
//            Session.getInstance().setSocket(socket);
//            dispose();
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(null, "Connection unsuccesful");
//        }
//    }
    void promeniParametre(String ip, Integer port) {
        jCheckBox1.setText(ip + ":" + String.valueOf(port));
        jCheckBox1.setSelected(true);
        btnUnesiParametre.setEnabled(false);
        this.ip = ip;
        this.port = port;
    }
}
