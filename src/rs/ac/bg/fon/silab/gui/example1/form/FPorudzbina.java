/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.form;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
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
        pripremiFormu(FormMode.KREIRANJE);
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
        jbtnIzaberiKupca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblStavkePorudzbine = new javax.swing.JTable();
        jbtnObrisiStavku = new javax.swing.JButton();
        jbtnDodajStavku = new javax.swing.JButton();
        jbtnSacuvaj = new javax.swing.JButton();
        jBtnOtkazi = new javax.swing.JButton();
        jBtnAzuriraj = new javax.swing.JButton();
        jBtnIzmeni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxRadnik = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDatumPor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabelKupac = new javax.swing.JLabel();
        jComboBoxKupac = new javax.swing.JComboBox();
        jLabelUkIznos = new javax.swing.JLabel();
        jtxtUkupanIznos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jTextFieldIdPorudzbine = new javax.swing.JTextField();

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
        setMaximumSize(new java.awt.Dimension(2147483, 2147483));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

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

        jBtnOtkazi.setText("Otkazi");
        jBtnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOtkaziActionPerformed(evt);
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

        jLabel1.setText("Radnik:");

        jLabel2.setText("Datum porudzbine:");

        jLabel3.setText("Status:");

        jTextFieldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStatusActionPerformed(evt);
            }
        });

        jLabelKupac.setText("Kupac:");

        jLabelUkIznos.setText("Ukupan iznos:");

        jtxtUkupanIznos.setEnabled(false);

        jLabelID.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldIdPorudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldIdPorudzbine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jBtnOtkazi)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnAzuriraj)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnIzmeni)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSacuvaj)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldDatumPor, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUkIznos)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabelKupac))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jComboBoxKupac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxRadnik, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnIzaberiKupca)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDodajStavku)
                    .addComponent(jbtnObrisiStavku, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUkIznos)
                    .addComponent(jtxtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbtnDodajStavku)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnObrisiStavku)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelKupac)
                            .addComponent(jComboBoxKupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnIzaberiKupca))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxRadnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDatumPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnAzuriraj)
                    .addComponent(jBtnIzmeni)
                    .addComponent(jbtnSacuvaj)
                    .addComponent(jBtnOtkazi))
                .addGap(42, 42, 42))
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
                IDomainEntity ide = Controller.zapamtiPorudzbinu(porudzbina);
                porudzbina = (PorudzbinaEntity) ide;
                for (StavkaPorudzbineEntity stavka : porudzbina.getStavke()) {
                    stavka.setPorudzbina(porudzbina);
                    System.out.println(porudzbina);
                    Controller.zapamtiStavku(stavka);
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

    private void jBtnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOtkaziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnOtkaziActionPerformed

    private void jBtnAzurirajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAzurirajActionPerformed
        try {
            Long idPor = Long.parseLong(jTextFieldIdPorudzbine.getText().trim());
            Double ukIznos = Double.parseDouble(jtxtUkupanIznos.getText().trim());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date datumPor = sdf.parse(jTextFieldDatumPor.getText());
            String status = jTextFieldStatus.getText().trim();
            KupacEntity kupac = (KupacEntity) jComboBoxKupac.getSelectedItem();
            RadnikEntity radnik = (RadnikEntity) jComboBoxRadnik.getSelectedItem();
            PorudzbinaEntity porudzbina = new PorudzbinaEntity(idPor, datumPor, status, ukIznos, kupac, radnik);
            porudzbina = (PorudzbinaEntity) Controller.izmeniPorudzbinu(porudzbina);
            JOptionPane.showMessageDialog(this, "Sistem je azurirao porudzbinu");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Sistem ne moze da azurira porudzbinu");
            Logger.getLogger(FKupac.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnAzurirajActionPerformed

    private void jBtnIzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIzmeniActionPerformed
        pripremiFormu(FormMode.IZMENA);
    }//GEN-LAST:event_jBtnIzmeniActionPerformed

    private void centrirajFormu() {
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAzuriraj;
    private javax.swing.JButton jBtnIzmeni;
    private javax.swing.JButton jBtnOtkazi;
    private javax.swing.JComboBox jComboBoxKupac;
    private javax.swing.JComboBox jComboBoxRadnik;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelKupac;
    private javax.swing.JLabel jLabelUkIznos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDatumPor;
    private javax.swing.JTextField jTextFieldIdPorudzbine;
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

            List<ProizvodEntity> proizvodi = Controller.ucitajProizvode();
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
            List<KupacEntity> kupci = Controller.ucitajKupce();
            
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
//            System.out.println("----------------------------");
//            for (StavkaPorudzbineEntity stavkaPorudzbineEntity : por.getStavke()) {
//                System.out.println(stavkaPorudzbineEntity);
//            }
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
        switch (mode) {
            case IZMENA:
                jBtnAzuriraj.setEnabled(true);
                jBtnIzmeni.setEnabled(false);
                jbtnSacuvaj.setEnabled(false);
                jBtnOtkazi.setEnabled(false);
                jbtnIzaberiKupca.setEnabled(true);
                jPanel1.setVisible(true);
                jPanel1.setEnabled(false);
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
                break;
            case KREIRANJE:
                java.util.Date date = java.sql.Date.valueOf(LocalDate.now());
                jTextFieldDatumPor.setText(date.toString());
                jTextFieldStatus.setText("U pripremi");
                jTextFieldStatus.setEnabled(false);
                jTextFieldDatumPor.setEnabled(false);
                jTextFieldIdPorudzbine.setEnabled(false);
                jPanel1.setVisible(false);
                jBtnAzuriraj.setEnabled(false);
                jBtnIzmeni.setEnabled(false);
                jbtnSacuvaj.setEnabled(true);
                jBtnOtkazi.setEnabled(false);
                jbtnIzaberiKupca.setEnabled(true);
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
                break;
            case PREGLED:
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
                  jBtnAzuriraj.setEnabled(false);
                  jbtnSacuvaj.setEnabled(false);
                  jbtnDodajStavku.setEnabled(false);
                  jbtnObrisiStavku.setEnabled(false);
                  jbtnIzaberiKupca.setEnabled(false);
                  jPanel1.setVisible(true);
                break;
        }
    }
}
