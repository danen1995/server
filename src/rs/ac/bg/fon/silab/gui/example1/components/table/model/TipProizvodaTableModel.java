/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.components.table.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.silab.jdbc.example1.domen.TipProizvodaEntity;

/**
 *
 * @author FON
 */
public class TipProizvodaTableModel extends AbstractTableModel {

    private final List<TipProizvodaEntity> lista;
    private String[] columnNames = new String[]{"ID", "Naziv tipa proizvoda"};

    public TipProizvodaTableModel(List<TipProizvodaEntity> lista) {
        this.lista = lista;
    }

    @Override
    public int getRowCount() {
        return lista == null ? 0 : lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipProizvodaEntity city = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return city.getIdTipaProizvoda();
            case 1:
                return city.getNazivTipaProizvoda();
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

}
