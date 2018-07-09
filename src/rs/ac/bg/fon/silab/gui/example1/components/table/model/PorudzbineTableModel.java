/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.components.table.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.silab.jdbc.example1.domen.MestoEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.PorudzbinaEntity;


/**
 *
 * @author FON
 */
public class PorudzbineTableModel extends AbstractTableModel {

    private final List<PorudzbinaEntity> porudzbine;
    private String [] columnNames = new String[]{"ID","Datum","Status","Ukupan iznos","Kupac","Radnik"};

    public PorudzbineTableModel(List<PorudzbinaEntity> porudzbine) {
        this.porudzbine = porudzbine;
    }

   

    @Override
    public int getRowCount() {        
        return porudzbine == null ? 0 : porudzbine.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         PorudzbinaEntity porudzbina = porudzbine.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return porudzbina.getIdPorudzbine();
            case 1:
                return porudzbina.getDatumPorudzbine();            
            case 2:
                return porudzbina.getStatus();
            case 3:
                return porudzbina.getUkupanIznos();            
            case 4:
                return porudzbina.getKupac().getImeKupca()+" "+porudzbina.getKupac().getPrezimeKupca();
            case 5:
                return porudzbina.getRadnik().getImeRadnika()+" "+porudzbina.getRadnik().getPrezimeRadnika();            
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    
}
