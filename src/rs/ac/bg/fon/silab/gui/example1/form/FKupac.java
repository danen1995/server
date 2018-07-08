/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.form;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import rs.ac.bg.fon.silab.gui.example1.components.table.model.PorudzbineTableModel;
import rs.ac.bg.fon.silab.gui.example1.controller.Controller;
import rs.ac.bg.fon.silab.gui.example1.session.Session;
import rs.ac.bg.fon.silab.jdbc.example1.domen.IDomainEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.KupacEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.MestoEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.PorudzbinaEntity;

/**
 *
 * @author FON
 */
public class FKupac extends javax.swing.JDialog {

    /**
     * Creates new form FCompany
     */
    public FKupac(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniComboZaMesto();
        pripremiZaKreiranje();
        centrirajFormu();
    }
    
    public FKupac(java.awt.Frame parent, boolean modal, String kupacJMBG) {
        super(parent, modal);
        initComponents();
        popuniComboZaMesto();
        System.out.println(kupacJMBG);
        pripremiZaPregled(kupacJMBG);
        postaviModel(kupacJMBG);
        centrirajFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelIme = new javax.swing.JLabel();
        jTxtIme = new javax.swing.JTextField();
        jLabelPrezime = new javax.swing.JLabel();
        jTxtPrezime = new javax.swing.JTextField();
        jLabelDatumRodj = new javax.swing.JLabel();
        jTxtDatumRodj = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabelMesto = new javax.swing.JLabel();
        jComboMesto = new javax.swing.JComboBox<>();
        jBtnIzaberi = new javax.swing.JButton();
        jLabelJMBG = new javax.swing.JLabel();
        jTxtJMBG = new javax.swing.JTextField();
        jLabelBrTel = new javax.swing.JLabel();
        jTxtBrojTelefona = new javax.swing.JTextField();
        jLabelAdresa = new javax.swing.JLabel();
        jTxtAdresa = new javax.swing.JTextField();
        jBtnSacuvaj = new javax.swing.JButton();
        jBtnAzuriraj = new javax.swing.JButton();
        jBtnIzmeni = new javax.swing.JButton();
        jBtnOtkazi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePorudzbineZaKupca = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novi kupac");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Podaci o kupcu:"));

        jLabelIme.setText("Ime:");

        jTxtIme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtImeActionPerformed(evt);
            }
        });

        jLabelPrezime.setText("Prezime:");

        jTxtPrezime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPrezimeActionPerformed(evt);
            }
        });

        jLabelDatumRodj.setText("Datum rodjenja:");

        jLabelEmail.setText("Email:");

        jLabelMesto.setText("Mesto:");

        jBtnIzaberi.setText("Izaberi");
        jBtnIzaberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIzaberiActionPerformed(evt);
            }
        });

        jLabelJMBG.setText("Jmbg:");

        jLabelBrTel.setText("Broj telefona:");

        jTxtBrojTelefona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtBrojTelefonaActionPerformed(evt);
            }
        });

        jLabelAdresa.setText("Adresa:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPrezime)
                    .addComponent(jLabelIme)
                    .addComponent(jLabelDatumRodj)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelMesto)
                    .addComponent(jLabelJMBG)
                    .addComponent(jLabelBrTel)
                    .addComponent(jLabelAdresa))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtEmail)
                    .addComponent(jTxtDatumRodj)
                    .addComponent(jTxtIme)
                    .addComponent(jTxtPrezime)
                    .addComponent(jTxtJMBG)
                    .addComponent(jTxtBrojTelefona)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboMesto, 0, 452, Short.MAX_VALUE)
                            .addComponent(jTxtAdresa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIzaberi)
                        .addGap(139, 139, 139)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJMBG)
                    .addComponent(jTxtJMBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIme)
                    .addComponent(jTxtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrezime)
                    .addComponent(jTxtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDatumRodj)
                    .addComponent(jTxtDatumRodj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBrTel)
                    .addComponent(jTxtBrojTelefona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAdresa)
                            .addComponent(jTxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelMesto)
                            .addComponent(jComboMesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnIzaberi)
                        .addContainerGap())))
        );

        jBtnSacuvaj.setText("Sacuvaj");
        jBtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSacuvajActionPerformed(evt);
            }
        });

        jBtnAzuriraj.setText("Azuriraj");
        jBtnAzuriraj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAzurirajActionPerformed(evt);
            }
        });

        jBtnIzmeni.setText("Izmeni");
        jBtnIzmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIzmeniActionPerformed(evt);
            }
        });

        jBtnOtkazi.setText("Otkazi");
        jBtnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOtkaziActionPerformed(evt);
            }
        });

        jTablePorudzbineZaKupca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTablePorudzbineZaKupca);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnOtkazi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAzuriraj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnIzmeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnSacuvaj)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnOtkazi)
                            .addComponent(jBtnAzuriraj)
                            .addComponent(jBtnIzmeni)
                            .addComponent(jBtnSacuvaj))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSacuvajActionPerformed
        try {
            String jmbg = jTxtJMBG.getText().trim();
            String ime   = jTxtIme.getText().trim();
            String prezime   = jTxtPrezime.getText().trim();
            String dat = jTxtDatumRodj.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            Date datumRodj = sdf.parse(dat);
            String email = jTxtEmail.getText().trim();
            String brTel = jTxtBrojTelefona.getText().trim();
            String adresa = jTxtAdresa.getText().trim();
            MestoEntity mesto = (MestoEntity) jComboMesto.getSelectedItem();
            KupacEntity kupac = new KupacEntity(jmbg, ime, prezime, datumRodj, email, brTel, adresa, mesto);
            System.out.println("AvA: "+kupac.toString());
//            kupac = Controller.sacuvajKupca(kupac);
            kupac = (KupacEntity) Controller.zapamtiKupca(kupac);
            JOptionPane.showMessageDialog(this, "Uspesno je sacuvan kupac!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kupac nije uspesno sacuvan!");
        }
    }//GEN-LAST:event_jBtnSacuvajActionPerformed

    private void jBtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIzmeniActionPerformed
        pripremiFormu(FormMode.IZMENA);
    }//GEN-LAST:event_jBtnIzmeniActionPerformed

    private void jBtnIzaberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIzaberiActionPerformed
        JDialog fIzaberiMesto = new FIzaberiMesto(null, true);
        fIzaberiMesto.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jBtnIzaberiActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (Session.getInstance().getMap().containsKey("izabrano_mesto")) {
            MestoEntity mesto = (MestoEntity) Session.getInstance().getMap().get("izabrano_mesto");
            jComboMesto.setSelectedItem(mesto);
        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        if (Session.getInstance().getMap().containsKey("izabrano_mesto")){
            Session.getInstance().getMap().remove("izabrano_mesto");
        }
    }//GEN-LAST:event_formWindowClosed

    private void jBtnAzurirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAzurirajActionPerformed
        try {
            String JMBG = jTxtJMBG.getText().trim();
            String ime = jTxtIme.getText().trim();
            String prezime = jTxtPrezime.getText().trim();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date datum = sdf.parse(jTxtDatumRodj.getText());
            String email = jTxtEmail.getText().trim();
            String brojTelefona = jTxtBrojTelefona.getText().trim();
            String adresa = jTxtAdresa.getText().trim();
            MestoEntity mesto = (MestoEntity) jComboMesto.getSelectedItem();
            KupacEntity kupac = new KupacEntity(JMBG, ime, prezime, datum, email, brojTelefona, adresa, mesto);
            kupac = (KupacEntity) Controller.izmeniKupca(kupac);
            JOptionPane.showMessageDialog(this, "Sistem je azurirao kupca");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da azurira kupca");
            Logger.getLogger(FKupac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnAzurirajActionPerformed

    private void jBtnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOtkaziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnOtkaziActionPerformed

    private void jTxtImeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtImeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtImeActionPerformed

    private void jTxtPrezimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPrezimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPrezimeActionPerformed

    private void jTxtBrojTelefonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtBrojTelefonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtBrojTelefonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAzuriraj;
    private javax.swing.JButton jBtnIzaberi;
    private javax.swing.JButton jBtnIzmeni;
    private javax.swing.JButton jBtnOtkazi;
    private javax.swing.JButton jBtnSacuvaj;
    private javax.swing.JComboBox<rs.ac.bg.fon.silab.jdbc.example1.domen.MestoEntity> jComboMesto;
    private javax.swing.JLabel jLabelAdresa;
    private javax.swing.JLabel jLabelBrTel;
    private javax.swing.JLabel jLabelDatumRodj;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIme;
    private javax.swing.JLabel jLabelJMBG;
    private javax.swing.JLabel jLabelMesto;
    private javax.swing.JLabel jLabelPrezime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePorudzbineZaKupca;
    private javax.swing.JTextField jTxtAdresa;
    private javax.swing.JTextField jTxtBrojTelefona;
    private javax.swing.JTextField jTxtDatumRodj;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtIme;
    private javax.swing.JTextField jTxtJMBG;
    private javax.swing.JTextField jTxtPrezime;
    // End of variables declaration//GEN-END:variables

    private void popuniComboZaMesto() {
        try {
            jComboMesto.removeAllItems();
            List<MestoEntity> mesta = Controller.ucitajListuMesta();
            
            for (IDomainEntity mesto : mesta) {
                if(mesto instanceof MestoEntity)
                    jComboMesto.addItem((MestoEntity) mesto);
            }
        } catch (Exception ex) {
            Logger.getLogger(FKupac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void pripremiZaPregled(String kupacJMBG) {
        System.out.println(kupacJMBG);
        pripremiFormu(FormMode.PREGLED);
        try {
            System.out.println("aaaaaaaaaa");
            KupacEntity kupac = Controller.nadjiKupcaPoJMBGu(kupacJMBG);
            setTitle("Pregled kupca: " + kupac.getImeKupca());
            
            jTxtJMBG.setText(kupac.getJmbgKupca());
            jTxtIme.setText(kupac.getImeKupca());
            jTxtPrezime.setText(kupac.getPrezimeKupca());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String datumRodjenja = sdf.format(kupac.getDatumRodjenja());
            jTxtDatumRodj.setText(datumRodjenja);
            jTxtEmail.setText(kupac.getEmail());
            jTxtBrojTelefona.setText(kupac.getBrojTelefona());
            jTxtAdresa.setText(kupac.getAdresa());
            jComboMesto.setSelectedItem(kupac.getMesto());
        } catch (Exception ex) {
            Logger.getLogger(FKupac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void pripremiZaIzmenu() {
        pripremiFormu(FormMode.IZMENA);
    }
    
    private void pripremiZaKreiranje() {
        pripremiFormu(FormMode.KREIRANJE);
    }
    
    void pripremiFormu(FormMode mode) {
        switch (mode) {
            case IZMENA:
                jPanel2.setVisible(false);
                jBtnAzuriraj.setEnabled(true);
                jBtnIzmeni.setEnabled(false);
                jBtnSacuvaj.setEnabled(false);
                jBtnOtkazi.setEnabled(false);
                jBtnIzaberi.setEnabled(true);
                
                jTxtJMBG.setVisible(true);
                jLabelJMBG.setVisible(true);
                jLabelJMBG.setEnabled(false);
                
                jComboMesto.setEnabled(true);
                jTxtEmail.setEnabled(true);
                jTxtPrezime.setEnabled(true);
                jTxtIme.setEnabled(true);
                jTxtDatumRodj.setEnabled(true);
                jTxtAdresa.setEnabled(true);
                jTxtBrojTelefona.setEnabled(true);
                
                break;
            case KREIRANJE:
                jPanel2.setVisible(false);
                jBtnAzuriraj.setEnabled(false);
                jBtnIzmeni.setEnabled(false);
                jBtnSacuvaj.setEnabled(true);
                jBtnOtkazi.setEnabled(false);
                jBtnIzaberi.setEnabled(true);
                
                jTxtJMBG.setVisible(true);
                jLabelJMBG.setVisible(true);
                
                jComboMesto.setEnabled(true);
                jTxtEmail.setEnabled(true);
                jTxtPrezime.setEnabled(true);
                jTxtIme.setEnabled(true);
                jTxtDatumRodj.setEnabled(true);
                jTxtAdresa.setEnabled(true);
                jTxtBrojTelefona.setEnabled(true);
                
                break;
            case PREGLED:
                jPanel2.setVisible(true);
                jBtnAzuriraj.setEnabled(false);
                
                jBtnIzmeni.setEnabled(true);
                jBtnSacuvaj.setEnabled(false);
                jBtnOtkazi.setEnabled(false);
                jBtnIzaberi.setEnabled(false);
                
                jTxtJMBG.setVisible(true);
                jLabelJMBG.setVisible(true);
                jTxtJMBG.setEnabled(false);
                jTxtJMBG.setDisabledTextColor(Color.DARK_GRAY);
                
                jComboMesto.setEnabled(false);
                jComboMesto.setForeground(Color.DARK_GRAY);
                jTxtEmail.setEnabled(false);
                jTxtEmail.setDisabledTextColor(Color.DARK_GRAY);
                jTxtPrezime.setEnabled(false);
                jTxtPrezime.setDisabledTextColor(Color.DARK_GRAY);
                jTxtIme.setDisabledTextColor(Color.DARK_GRAY);
                jTxtIme.setEnabled(false);
                jTxtDatumRodj.setEnabled(false);
                jTxtDatumRodj.setDisabledTextColor(Color.DARK_GRAY);
                jTxtAdresa.setEnabled(false);
                jTxtAdresa.setDisabledTextColor(Color.DARK_GRAY);
                jTxtBrojTelefona.setEnabled(false);
                jTxtBrojTelefona.setDisabledTextColor(Color.DARK_GRAY);
                break;
        }
    }
    
    private void centrirajFormu() {
        setLocationRelativeTo(null);
    }

    private void postaviModel(String kupacJMBG) {
        try {
            List<PorudzbinaEntity> porudzbinaLista=new ArrayList<>();
            List<PorudzbinaEntity> porudzbine = Controller.ucitajPorudzbineZaKupca(kupacJMBG);
            for (IDomainEntity iDomainEntity : porudzbine) {
                porudzbinaLista.add((PorudzbinaEntity)iDomainEntity);
            }
            TableModel tm = new PorudzbineTableModel(porudzbinaLista);
            jTablePorudzbineZaKupca.setModel(tm);
        } catch (Exception ex) {
            Logger.getLogger(FPretragaPorudzbina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
