/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.form;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import rs.ac.bg.fon.silab.gui.example1.controller.Controller;
import rs.ac.bg.fon.silab.jdbc.example1.domen.RadnikEntity;

/**
 *
 * @author Antic
 */
public class FMain1 extends javax.swing.JDialog {
  RadnikEntity radnik;
    /**
     * Creates new form FMain1
     */
    public FMain1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
     public FMain1(java.awt.Frame parent, boolean modal, RadnikEntity radnik) {
        super(parent, modal);
        initComponents();
        this.radnik = radnik;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuKupac = new javax.swing.JMenu();
        jMenuItemKreirajKupca = new javax.swing.JMenuItem();
        jMenuItemPretraziKupce = new javax.swing.JMenuItem();
        jMenuMesto = new javax.swing.JMenu();
        jMenuItemKreirajMesto = new javax.swing.JMenuItem();
        jMenuItemPretraziMesta = new javax.swing.JMenuItem();
        jMenuProizvod = new javax.swing.JMenu();
        jMenuItemKreirajProizvod = new javax.swing.JMenuItem();
        jMenuItemPretraziProizvode = new javax.swing.JMenuItem();
        jMenuPorudzbina = new javax.swing.JMenu();
        jMenuItemKreirajPorudzbinu = new javax.swing.JMenuItem();
        jMenuItemPretraziPorudzbine = new javax.swing.JMenuItem();
        jMenuAbout = new javax.swing.JMenu();
        jMenuItemAuthor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenuKupac.setText("Kupac");

        jMenuItemKreirajKupca.setText("Kreiraj");
        jMenuItemKreirajKupca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKreirajKupcaActionPerformed(evt);
            }
        });
        jMenuKupac.add(jMenuItemKreirajKupca);

        jMenuItemPretraziKupce.setText("Pretrazi");
        jMenuItemPretraziKupce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPretraziKupceActionPerformed(evt);
            }
        });
        jMenuKupac.add(jMenuItemPretraziKupce);

        jMenuBar1.add(jMenuKupac);

        jMenuMesto.setText("Mesto");

        jMenuItemKreirajMesto.setText("Kreiraj");
        jMenuItemKreirajMesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKreirajMestoActionPerformed(evt);
            }
        });
        jMenuMesto.add(jMenuItemKreirajMesto);

        jMenuItemPretraziMesta.setText("Pretrazi");
        jMenuMesto.add(jMenuItemPretraziMesta);

        jMenuBar1.add(jMenuMesto);

        jMenuProizvod.setText("Proizvod");

        jMenuItemKreirajProizvod.setText("Kreiraj");
        jMenuItemKreirajProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKreirajProizvodActionPerformed(evt);
            }
        });
        jMenuProizvod.add(jMenuItemKreirajProizvod);

        jMenuItemPretraziProizvode.setText("Pretrazi");
        jMenuItemPretraziProizvode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPretraziProizvodeActionPerformed(evt);
            }
        });
        jMenuProizvod.add(jMenuItemPretraziProizvode);

        jMenuBar1.add(jMenuProizvod);

        jMenuPorudzbina.setText("Porudzbina");

        jMenuItemKreirajPorudzbinu.setText(" Kreiraj");
        jMenuItemKreirajPorudzbinu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemKreirajPorudzbinuActionPerformed(evt);
            }
        });
        jMenuPorudzbina.add(jMenuItemKreirajPorudzbinu);

        jMenuItemPretraziPorudzbine.setText("Pretrazi");
        jMenuItemPretraziPorudzbine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPretraziPorudzbineActionPerformed(evt);
            }
        });
        jMenuPorudzbina.add(jMenuItemPretraziPorudzbine);

        jMenuBar1.add(jMenuPorudzbina);

        jMenuAbout.setText("O nama");

        jMenuItemAuthor.setText("Autor");
        jMenuItemAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAuthorActionPerformed(evt);
            }
        });
        jMenuAbout.add(jMenuItemAuthor);

        jMenuBar1.add(jMenuAbout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemKreirajKupcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKreirajKupcaActionPerformed
                JDialog fKupac = new FKupac(this, true);
                fKupac.setVisible(true);
    }//GEN-LAST:event_jMenuItemKreirajKupcaActionPerformed

    private void jMenuItemPretraziKupceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPretraziKupceActionPerformed
        //        statusLabel.setText("Use case: Search company");
                JDialog fpretragaKupaca = new FPretragaKupaca(this, true);
                fpretragaKupaca.setVisible(true);
    }//GEN-LAST:event_jMenuItemPretraziKupceActionPerformed

    private void jMenuItemKreirajPorudzbinuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKreirajPorudzbinuActionPerformed
                JDialog fPorudzbina = new FPorudzbina(null,true,radnik);
                fPorudzbina.setVisible(true);
    }//GEN-LAST:event_jMenuItemKreirajPorudzbinuActionPerformed

    private void jMenuItemAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAuthorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        odjava();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItemKreirajMestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKreirajMestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemKreirajMestoActionPerformed

    private void jMenuItemKreirajProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemKreirajProizvodActionPerformed
        JDialog fProizvod = new FProizvod(this, true);
        fProizvod.setVisible(true);
    }//GEN-LAST:event_jMenuItemKreirajProizvodActionPerformed

    private void jMenuItemPretraziProizvodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPretraziProizvodeActionPerformed
       JDialog fpretragaProizvoda = new FPretragaProizvoda(this, true);
                fpretragaProizvoda.setVisible(true);
    }//GEN-LAST:event_jMenuItemPretraziProizvodeActionPerformed

    private void jMenuItemPretraziPorudzbineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPretraziPorudzbineActionPerformed
        JDialog fpretragaPorudzbina = new FPretragaPorudzbina(this, true);
                fpretragaPorudzbina.setVisible(true);
    }//GEN-LAST:event_jMenuItemPretraziPorudzbineActionPerformed
   
    private void odjava() {
        try {
            Controller.odjava(radnik);
        } catch (Exception ex) {
            Logger.getLogger(FMain1.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Odjavili ste se!");
        dispose();
        FLogovanje log = new FLogovanje();
        log.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAuthor;
    private javax.swing.JMenuItem jMenuItemKreirajKupca;
    private javax.swing.JMenuItem jMenuItemKreirajMesto;
    private javax.swing.JMenuItem jMenuItemKreirajPorudzbinu;
    private javax.swing.JMenuItem jMenuItemKreirajProizvod;
    private javax.swing.JMenuItem jMenuItemPretraziKupce;
    private javax.swing.JMenuItem jMenuItemPretraziMesta;
    private javax.swing.JMenuItem jMenuItemPretraziPorudzbine;
    private javax.swing.JMenuItem jMenuItemPretraziProizvode;
    private javax.swing.JMenu jMenuKupac;
    private javax.swing.JMenu jMenuMesto;
    private javax.swing.JMenu jMenuPorudzbina;
    private javax.swing.JMenu jMenuProizvod;
    // End of variables declaration//GEN-END:variables
}