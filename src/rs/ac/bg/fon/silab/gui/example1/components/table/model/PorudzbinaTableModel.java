/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.components.table.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import rs.ac.bg.fon.silab.jdbc.example1.domen.PorudzbinaEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.ProizvodEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.StavkaPorudzbineEntity;

/**
 *
 * @author FON
 */
public class PorudzbinaTableModel extends AbstractTableModel {

    private final PorudzbinaEntity porudzbina;
    private String[] columnNames = new String[]{"RBR stavke", "Proizvod", "Kolicina(kom.)", "Vrednost"};

    public PorudzbinaTableModel(PorudzbinaEntity porudzbina) {
        this.porudzbina = porudzbina;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
//        if(columnIndex == 1 || columnIndex == 3 || columnIndex == 4){
//            return true;
//        }
//        return false;

        return (columnIndex == 1 || columnIndex == 2);
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return porudzbina.getStavke().size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        StavkaPorudzbineEntity stavka = porudzbina.getStavke().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return stavka.getRbrStavke();
            case 1:
                return stavka.getProizvod()!= null ? stavka.getProizvod().getNazivProizvoda() : "-";
            case 2:
                return stavka.getKolicina();
            case 3:
                return stavka.getVrednost();
            default:
                return "N/A";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        StavkaPorudzbineEntity stavka = porudzbina.getStavke().get(rowIndex);

        switch (columnIndex) {
            case 1:
                ProizvodEntity proizvod = (ProizvodEntity) aValue;
                stavka.setProizvod(proizvod);
                azurirajVrednost(stavka);
                break;
            case 2:
                stavka.setKolicina(Integer.parseInt(aValue.toString()));
                azurirajVrednost(stavka);
                break;
        }
    }

    public void dodajNovuStavkuPorudzbine() {
        List<StavkaPorudzbineEntity> stavkePor = porudzbina.getStavke();
        if (stavkePor.isEmpty() || 
                stavkePor.get(stavkePor.size() - 1).getProizvod()!= null) {
            StavkaPorudzbineEntity stavka = new StavkaPorudzbineEntity();
            stavka.setRbrStavke(Long.parseLong(String.valueOf(porudzbina.getStavke().size() + 1)));
            stavka.setKolicina(0);
            porudzbina.getStavke().add(stavka);
            azurirajIznosPorudzbine();
            fireTableDataChanged();
        }
    }

    private void azurirajVrednost(StavkaPorudzbineEntity stavka) {
        if (stavka.getProizvod()!= null && stavka.getKolicina()> 0) {
            stavka.setVrednost(stavka.getProizvod().getCena()* stavka.getKolicina());
            fireTableDataChanged();
        }
    }

    public void ukloniStavku(int izabranaStavka) {
        if (porudzbina != null && izabranaStavka >= 0 && izabranaStavka < porudzbina.getStavke().size()) {
            porudzbina.getStavke().remove(izabranaStavka);
            azurirajStavke();
            azurirajIznosPorudzbine();
            fireTableDataChanged();
        }
    }

    private void azurirajStavke() {
        List<StavkaPorudzbineEntity> stavke = porudzbina.getStavke();
        int brojStavki = stavke.size();
        for (int i = 0; i < brojStavki; i++) {
            stavke.get(i).setRbrStavke(Long.parseLong(String.valueOf(i + 1)));
        }
    }

    public void azurirajIznosPorudzbine() {
        List<StavkaPorudzbineEntity> stavke = porudzbina.getStavke();
        double trenutniIznos = 0.0;
        
        for (StavkaPorudzbineEntity stavka : stavke) {
            if (stavka.getProizvod()!= null) {
                trenutniIznos += 
                    stavka.getProizvod().getCena()* stavka.getKolicina();
            }
            porudzbina.setUkupanIznos(trenutniIznos);
        }
        
        porudzbina.setUkupanIznos(trenutniIznos);
    }

    public double uzmiTrenutniIznosPorudzbine() {
        return porudzbina.getUkupanIznos();
    }

    public PorudzbinaEntity vratiPorudzbinu() {
        return porudzbina;
    }
}
