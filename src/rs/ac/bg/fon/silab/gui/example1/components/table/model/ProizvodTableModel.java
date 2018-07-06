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
import rs.ac.bg.fon.silab.jdbc.example1.domen.ProizvodEntity;

/**
 *
 * @author FON
 */
public class ProizvodTableModel extends AbstractTableModel {

    private final List<ProizvodEntity> proizvodi;
    private String [] columnNames = new String[]{"Id proizvoda","Naziv proizvoda","Cena","Tip proizvoda"};

    public ProizvodTableModel(List<ProizvodEntity> proizvodi) {
        this.proizvodi = proizvodi;
    }

    @Override
    public int getRowCount() {
        //ternarni operator
        return proizvodi == null ? 0 : proizvodi.size();
        
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProizvodEntity proizvod = proizvodi.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return proizvod.getIdProizvoda();
            case 1:
                return proizvod.getNazivProizvoda();
            case 2:
                return proizvod.getCena();
            case 3:
                return proizvod.getTipProizvoda().getNazivTipaProizvoda();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    
}
