/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.components.table.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.silab.jdbc.example1.domen.IDomainEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.KupacEntity;

/**
 *
 * @author FON
 */
public class KupacTableModel extends AbstractTableModel {

    private final List<KupacEntity> kupci;
    private String [] columnNames = new String[]{"Jmbg","Ime","Prezime","Datum rodjenja","Email","Broj telefona","Adresa","Mesto"};

    public KupacTableModel(List<KupacEntity> kupci) {
        this.kupci = kupci;
    }

    @Override
    public int getRowCount() {
        //ternarni operator
        return kupci == null ? 0 : kupci.size();
        
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        KupacEntity kupac = kupci.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return kupac.getJmbgKupca();
            case 1:
                return kupac.getImeKupca();
            case 2:
                return kupac.getPrezimeKupca();
            case 3:
                return kupac.getDatumRodjenja();
            case 4:
                return kupac.getEmail();
            case 5:
                return kupac.getBrojTelefona();
            case 6:
                return kupac.getAdresa();
            case 7:
                return kupac.getMesto().getNaziv();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

     public void osvezi() {
        fireTableDataChanged();
    }
     public void obrisi(int selektovaniRed) {
        kupci.remove(selektovaniRed);
        fireTableDataChanged();
    }
     
     public KupacEntity vrati(int red) {
        return kupci.get(red);
    }
}
