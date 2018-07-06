/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.form;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import rs.ac.bg.fon.silab.gui.example1.components.table.model.PorudzbinaTableModel;
import rs.ac.bg.fon.silab.gui.example1.controller.Controller;
import rs.ac.bg.fon.silab.gui.example1.session.Session;
import rs.ac.bg.fon.silab.jdbc.example1.domen.IDomainEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.KupacEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.MestoEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.PorudzbinaEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.ProizvodEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.RadnikEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.StavkaPorudzbineEntity;

/**
 *
 * @author user
 */
public class FPorudzbina extends javax.swing.JDialog {
    RadnikEntity radnik;
    /**
     * Creates new form FBill
     */
    public FPorudzbina(java.awt.Frame parent, boolean modal, RadnikEntity radnik) {
        super(parent, modal);
        this.radnik = radnik;
        initComponents();
        postaviModel();
        centrirajFormu();
        popuniComboZaKupca();
        jPanel1.setVisible(false);
    }
    public FPorudzbina(java.awt.Frame parent, boolean modal,Long id) {
        super(parent, modal);
        initComponents();
//        postaviModel();
        centrirajFormu();
//        popuniComboZaKupca();
        pripremiZaPregled(id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabelUkIznos = new javax.swing.JLabel();
        jtxtUkupanIznos = new javax.swing.JTextField();
        jLabelKupac = new javax.swing.JLabel();
        jbtnIzaberiKupca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavkePorudzbine = new javax.swing.JTable();
        jbtnObrisiStavku = new javax.swing.JButton();
        jbtnDodajStavku = new javax.swing.JButton();
        jbtnSacuvaj = new javax.swing.JButton();
        jComboBoxKupac = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRadnik = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDatumPor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create new bill");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabelUkIznos.setText("Ukupan iznos:");

        jtxtUkupanIznos.setEnabled(false);

        jLabelKupac.setText("Kupac:");

        jbtnIzaberiKupca.setText("Izaberi");
        jbtnIzaberiKupca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIzaberiKupcaActionPerformed(evt);
            }
        });

        jtblStavkePorudzbine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtblStavkePorudzbine.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtblStavkePorudzbineFocusLost(evt);
            }
        });
        jtblStavkePorudzbine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblStavkePorudzbineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblStavkePorudzbine);

        jbtnObrisiStavku.setText("-");
        jbtnObrisiStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnObrisiStavkuActionPerformed(evt);
            }
        });

        jbtnDodajStavku.setText("+");
        jbtnDodajStavku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDodajStavkuActionPerformed(evt);
            }
        });

        jbtnSacuvaj.setText("Sacuvaj");
        jbtnSacuvaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSacuvajActionPerformed(evt);
            }
        });

        jLabel1.setText("Radnik:");

        jLabel2.setText("Datum porudzbine:");

        jLabel3.setText("Status:");

        jTextFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jComboBoxRadnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldDatumPor, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jTextFieldStatus))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDatumPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbtnSacuvaj))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnObrisiStavku, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnDodajStavku)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelKupac)
                                            .addComponent(jLabelUkIznos))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxKupac, 0, 426, Short.MAX_VALUE)
                                            .addComponent(jtxtUkupanIznos)))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(81, 81, 81)
                                .addComponent(jbtnIzaberiKupca)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUkIznos)
                    .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKupac)
                    .addComponent(jbtnIzaberiKupca)
                    .addComponent(jComboBoxKupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnDodajStavku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnObrisiStavku)
                        .addGap(87, 87, 87)))
                .addComponent(jbtnSacuvaj)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIzaberiKupcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIzaberiKupcaActionPerformed
//        JDialog selectCompanyForm = new FSelectCompany(null, true);
//        selectCompanyForm.setVisible(true);
    }//GEN-LAST:event_jbtnIzaberiKupcaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        if (Session.getInstance().getMap().containsKey("selected_company")) {
//            CompanyEntity companyEntity = (CompanyEntity) Session.getInstance().getMap().get("selected_company");
//            jtxtCompany.setText(companyEntity.getName() + ", " + companyEntity.getAddress());
//        }
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
//        if (Session.getInstance().getMap().containsKey("selected_company")) {
//            Session.getInstance().getMap().remove("selected_company");
//        }
    }//GEN-LAST:event_formWindowClosed

    private void jbtnDodajStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDodajStavkuActionPerformed
        PorudzbinaTableModel ptm = (PorudzbinaTableModel) jtblStavkePorudzbine.getModel();
        ptm.dodajNovuStavkuPorudzbine();
        jtxtUkupanIznos.setText(ptm.uzmiTrenutniIznosPorudzbine()+ "");
    }//GEN-LAST:event_jbtnDodajStavkuActionPerformed

    private void jbtnObrisiStavkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnObrisiStavkuActionPerformed
        // TODO add your handling code here:
        int selectedItem = jtblStavkePorudzbine.getSelectedRow();
        if (selectedItem >= 0) {
            PorudzbinaTableModel tableModel = (PorudzbinaTableModel) jtblStavkePorudzbine.getModel();
            tableModel.ukloniStavku(selectedItem);
            jtxtUkupanIznos.setText(tableModel.uzmiTrenutniIznosPorudzbine()+ "");
        }
    }//GEN-LAST:event_jbtnObrisiStavkuActionPerformed

    private void jbtnSacuvajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSacuvajActionPerformed
        // TODO add your handling code here:
        try {
            PorudzbinaTableModel ptm = (PorudzbinaTableModel) jtblStavkePorudzbine.getModel();
            PorudzbinaEntity porudzbina = ptm.vratiPorudzbinu();
            java.util.Date date = java.sql.Date.valueOf(LocalDate.now());
            porudzbina.setDatumPorudzbine(date);
            porudzbina.setRadnik(radnik);
            porudzbina.setStatus("U pripremi");
            porudzbina.setUkupanIznos(Double.parseDouble(jtxtUkupanIznos.getText().toString()));
            porudzbina.setKupac((KupacEntity)jComboBoxKupac.getSelectedItem());
//            if (Session.getInstance().getMap().containsKey("selected_company")) {
//                billEntity.setCompanyEntity((CompanyEntity) 
//                        Session.getInstance().getMap().get("selected_company")
//                );
                IDomainEntity ide = Controller.sacuvaj(porudzbina);
                porudzbina = (PorudzbinaEntity) ide;
                for (StavkaPorudzbineEntity stavka : porudzbina.getStavke()) {
                    stavka.setPorudzbina(porudzbina);
                    System.out.println(porudzbina);
                    Controller.sacuvaj(stavka);
                }
                JOptionPane.showMessageDialog(this, "Porudzbina je sacuvana.");
//            } else {
//                throw new Exception("Please select company");
//            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Greska: " + e.getMessage());
        }

    }//GEN-LAST:event_jbtnSacuvajActionPerformed

    private void jtblStavkePorudzbineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtblStavkePorudzbineFocusLost
        PorudzbinaTableModel ptm = (PorudzbinaTableModel) jtblStavkePorudzbine.getModel();
        ptm.azurirajIznosPorudzbine();
        jtxtUkupanIznos.setText(ptm.uzmiTrenutniIznosPorudzbine()+ "");
    }//GEN-LAST:event_jtblStavkePorudzbineFocusLost

    private void jtblStavkePorudzbineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblStavkePorudzbineMouseClicked
        PorudzbinaTableModel ptm = (PorudzbinaTableModel) jtblStavkePorudzbine.getModel();
        ptm.azurirajIznosPorudzbine();
        jtxtUkupanIznos.setText(ptm.uzmiTrenutniIznosPorudzbine()+ "");
    }//GEN-LAST:event_jtblStavkePorudzbineMouseClicked

    private void jTextFieldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldStatusActionPerformed

    private void centrirajFormu() {
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxKupac;
    private javax.swing.JComboBox jComboBoxRadnik;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelKupac;
    private javax.swing.JLabel jLabelUkIznos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDatumPor;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JButton jbtnDodajStavku;
    private javax.swing.JButton jbtnIzaberiKupca;
    private javax.swing.JButton jbtnObrisiStavku;
    private javax.swing.JButton jbtnSacuvaj;
    private javax.swing.JTable jtblStavkePorudzbine;
    private javax.swing.JTextField jtxtUkupanIznos;
    // End of variables declaration//GEN-END:variables

    private void postaviModel() {
        try {
            PorudzbinaEntity porudzbina = new PorudzbinaEntity();
//        bill.setCreatedDate(LocalDate.now());
//        bill.setCreatedTime(LocalTime.now());

            TableModel billTableModel = new PorudzbinaTableModel(porudzbina);
            jtblStavkePorudzbine.setModel(billTableModel);

            List<IDomainEntity> proizvodi = Controller.vratiSve(new ProizvodEntity());
            JComboBox comboBox = new JComboBox(new DefaultComboBoxModel(proizvodi.toArray()));

            TableColumn kolonaProizvod = jtblStavkePorudzbine.getColumnModel().getColumn(1);
            kolonaProizvod.setCellEditor(new DefaultCellEditor(comboBox));
        } catch (Exception ex) {
            Logger.getLogger(FPorudzbina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void popuniComboZaKupca() {
        try {
            jComboBoxKupac.removeAllItems();
            List<IDomainEntity> kupci = Controller.vratiSve(new KupacEntity());
            
            for (IDomainEntity kupac : kupci) {
                if(kupac instanceof KupacEntity)
                    jComboBoxKupac.addItem((KupacEntity) kupac);
            }
        } catch (Exception ex) {
            Logger.getLogger(FPorudzbina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void pripremiZaPregled(Long id) {
        pripremiFormu(FormMode.PREGLED);
        try {
            PorudzbinaEntity por = Controller.nadjiPorudzbinuPoIDu(id);
            List<StavkaPorudzbineEntity> stavke = Controller.vratiStavkeZaPorudzbinu(id);
            por.setStavke(stavke);
            setTitle("Pregled porudzbine: " + por.getIdPorudzbine());
            TableModel billTableModel = new PorudzbinaTableModel(por);
            jtblStavkePorudzbine.setModel(billTableModel);
            
            jtxtUkupanIznos.setText(por.getUkupanIznos().toString());
            jComboBoxKupac.setSelectedItem(por.getKupac());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String datumPor = sdf.format(por.getDatumPorudzbine());
            jTextFieldDatumPor.setText(datumPor);
            jTextFieldStatus.setText(por.getStatus());
            jComboBoxRadnik.setSelectedItem(por.getRadnik());
        } catch (Exception ex) {
            Logger.getLogger(FKupac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void pripremiFormu(FormMode mode) {
//        switch (mode) {
//            case IZMENA:
//                jBtnAzuriraj.setEnabled(true);
//                jBtnIzmeni.setEnabled(false);
//                jBtnSacuvaj.setEnabled(false);
//                jBtnOtkazi.setEnabled(false);
//                jBtnIzaberi.setEnabled(true);
//                
//                jTxtJMBG.setVisible(true);
//                jLabelJMBG.setVisible(true);
//                jLabelJMBG.setEnabled(false);
//                
//                jComboMesto.setEnabled(true);
//                jTxtEmail.setEnabled(true);
//                jTxtPrezime.setEnabled(true);
//                jTxtIme.setEnabled(true);
//                jTxtDatumRodj.setEnabled(true);
//                jTxtAdresa.setEnabled(true);
//                jTxtBrojTelefona.setEnabled(true);
//                
//                break;
//            case KREIRANJE:
//                jBtnAzuriraj.setEnabled(false);
//                jBtnIzmeni.setEnabled(false);
//                jBtnSacuvaj.setEnabled(true);
//                jBtnOtkazi.setEnabled(false);
//                jBtnIzaberi.setEnabled(true);
//                
//                jTxtJMBG.setVisible(true);
//                jLabelJMBG.setVisible(true);
//                
//                jComboMesto.setEnabled(true);
//                jTxtEmail.setEnabled(true);
//                jTxtPrezime.setEnabled(true);
//                jTxtIme.setEnabled(true);
//                jTxtDatumRodj.setEnabled(true);
//                jTxtAdresa.setEnabled(true);
//                jTxtBrojTelefona.setEnabled(true);
//                
//                break;
//            case PREGLED:
//                    jPanel1.setVisible(true);
//                jBtnAzuriraj.setEnabled(false);
//                
//                jBtnIzmeni.setEnabled(true);
//                jBtnSacuvaj.setEnabled(false);
//                jBtnOtkazi.setEnabled(false);
//                jBtnIzaberi.setEnabled(false);
//                
//                jTxtJMBG.setVisible(true);
//                jLabelJMBG.setVisible(true);
//                jTxtJMBG.setEnabled(false);
//                
//                jComboMesto.setEnabled(false);
//                jTxtEmail.setEnabled(false);
//                jTxtPrezime.setEnabled(false);
//                jTxtIme.setEnabled(false);
//                jTxtDatumRodj.setEnabled(false);
//                jTxtAdresa.setEnabled(false);
//                jTxtBrojTelefona.setEnabled(false);
//                break;
//        }
    }
}