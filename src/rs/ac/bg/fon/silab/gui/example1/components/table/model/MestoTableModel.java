/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.components.table.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.silab.jdbc.example1.domen.MestoEntity;


/**
 *
 * @author FON
 */
public class MestoTableModel extends AbstractTableModel {

    private final List<MestoEntity> mesta;
    private String [] columnNames = new String[]{"PTT","Naziv"};

    public MestoTableModel(List<MestoEntity> mesta) {
        this.mesta = mesta;
    }

   

    @Override
    public int getRowCount() {        
        return mesta == null ? 0 : mesta.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MestoEntity mesto = mesta.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return mesto.getPtt();
            case 1:
                return mesto.getNaziv();            
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    
}
