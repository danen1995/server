/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.form;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import rs.ac.bg.fon.silab.gui.example1.components.table.model.KupacTableModel;
import rs.ac.bg.fon.silab.gui.example1.components.table.model.ProizvodTableModel;
import rs.ac.bg.fon.silab.gui.example1.controller.Controller;
import rs.ac.bg.fon.silab.jdbc.example1.domen.IDomainEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.KupacEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.ProizvodEntity;

/**
 *
 * @author Antic
 */
public class FPretragaProizvoda extends javax.swing.JDialog {

    /**
     * Creates new form FPretragaKupaca
     */
    public FPretragaProizvoda(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniTabeluProizvoda();
        pripremiZaPretragu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProizvodi = new javax.swing.JTable();
        jButtonDetalji = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldKriterijum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableProizvodi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProizvodi);

        jButtonDetalji.setText("Detalji");
        jButtonDetalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetaljiActionPerformed(evt);
            }
        });

        jLabel1.setText("Unesi kriterijum pretrage:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonDetalji))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jTextFieldKriterijum, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldKriterijum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDetalji)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDetaljiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetaljiActionPerformed
        int selectedRow = jTableProizvodi.getSelectedRow();
        if (selectedRow >= 0) {
            Long id = (Long) jTableProizvodi.getValueAt(selectedRow, 0);
            JOptionPane.showMessageDialog(null, "Sistem je nasao podatke o izabranom proizvodu. Izabrani proizvod ima id: " + id);

            JDialog fPr = new FProizvod(null, true, id);
            fPr.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sistem ne moze da nadje podatke o izabranom proizvodu.");
        }
    }//GEN-LAST:event_jButtonDetaljiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetalji;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProizvodi;
    private javax.swing.JTextField jTextFieldKriterijum;
    // End of variables declaration//GEN-END:variables

     private void popuniTabeluProizvoda() {
        try {
            List<ProizvodEntity> proizvodiLista=new ArrayList<>();
            List<ProizvodEntity> proizvodi = Controller.ucitajProizvode();
            for (IDomainEntity iDomainEntity : proizvodi) {
                proizvodiLista.add((ProizvodEntity)iDomainEntity);
            }
            TableModel tm = new ProizvodTableModel(proizvodiLista);
            jTableProizvodi.setModel(tm);
        } catch (Exception ex) {
            Logger.getLogger(FPretragaProizvoda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     private void pripremiZaPretragu() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTableProizvodi.getModel());
        jTableProizvodi.setRowSorter(rowSorter);

        jTextFieldKriterijum.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                String filterCity = jTextFieldKriterijum.getText();

                if (filterCity.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + filterCity));
                }
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                String text = jTextFieldKriterijum.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    
    
}
