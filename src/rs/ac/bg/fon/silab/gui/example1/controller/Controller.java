/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.silab.gui.example1.controller;

import java.beans.Introspector;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import rs.ac.bg.fon.silab.gui.example1.session.Session;
import rs.ac.bg.fon.silab.jdbc.example1.domen.IDomainEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.KupacEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.MestoEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.PorudzbinaEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.ProizvodEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.RadnikEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.StavkaPorudzbineEntity;
import rs.ac.bg.fon.silab.jdbc.example1.domen.TipProizvodaEntity;
import transfer.request.RequestObject;
import transfer.response.ResponseObject;
import transfer.util.IOperation;
import transfer.util.IStatus;

/**
 *
 * @author FON
 */
public class Controller {
    
     public static List<KupacEntity> ucitajKupce() throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE_KUPCE);
        request.setData(new KupacEntity());
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<KupacEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<ProizvodEntity> ucitajProizvode() throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE_PROIZVODE);
        request.setData(new ProizvodEntity());
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<ProizvodEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<TipProizvodaEntity> ucitajListuTipovaProizvoda() throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE_TIPOVE_PROIZVODA);
        request.setData(new TipProizvodaEntity());
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<TipProizvodaEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<MestoEntity> ucitajListuMesta() throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVA_MESTA);
        request.setData(new MestoEntity());
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<MestoEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }
    

    public static KupacEntity nadjiKupcaPoJMBGu(String kupacJMBG) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_KUPCA_JMBG);
        request.setData(kupacJMBG);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (KupacEntity) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }
    
    public static RadnikEntity logovanje(RadnikEntity r) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.logovanje);
        request.setData(r);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (RadnikEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }
//***
//    public static List<IDomainEntity> vratiSve(IDomainEntity ide) throws Exception{
//        RequestObject request = new RequestObject();
//        request.setOperation(IOperation.VRATI_SVE);
//        request.setData(ide);
//        Socket socket = Session.getInstance().getSocket();
//        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//        out.writeObject(request);
//        out.flush();
//        
//        //Sacekaj odgovor
//        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//        ResponseObject response = (ResponseObject) in.readObject();
//        int code = response.getCode();
//        if(code == IStatus.OK){
//            return (List<IDomainEntity>) response.getData();
//        }else{
//            throw new Exception("Greska u komunikaciji!");
//        }
//    }
//***
    public static PorudzbinaEntity zapamtiPorudzbinu(PorudzbinaEntity porudzbina) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.ZAPAMTI_PORUDZBINU);
        request.setData(porudzbina);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (PorudzbinaEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static KupacEntity zapamtiKupca(KupacEntity kupac) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.ZAPAMTI_KUPCA);
        request.setData(kupac);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (KupacEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static ProizvodEntity zapamtiProizvod(ProizvodEntity proizvod) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.ZAPAMTI_PROIZVOD);
        request.setData(proizvod);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (ProizvodEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }
    
//    public static IDomainEntity sacuvaj(IDomainEntity ide) throws Exception{
//        RequestObject request = new RequestObject();
//        request.setOperation(IOperation.SACUVAJ);
//        request.setData(ide);
//        Socket socket = Session.getInstance().getSocket();
//        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
//        out.writeObject(request);
//        out.flush();
//        
//        //Sacekaj odgovor
//        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
//        ResponseObject response = (ResponseObject) in.readObject();
//        int code = response.getCode();
//        if(code == IStatus.OK){
//            return (IDomainEntity) response.getData();
//        }else{
//            throw new Exception("Greska u komunikaciji!");
//        }
//    }

    public static RadnikEntity odjava(RadnikEntity radnik) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.odjava);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (RadnikEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static ProizvodEntity nadjiProizvodPoIDu(Long prID) throws Exception{
         RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_PROIZVOD_ID);
        request.setData(prID);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (ProizvodEntity) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static PorudzbinaEntity nadjiPorudzbinuPoIDu(Long id) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_PORUDZBINU_ID);
        request.setData(id);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (PorudzbinaEntity) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<StavkaPorudzbineEntity> vratiStavkeZaPorudzbinu(Long id) throws Exception{
        RequestObject request = new RequestObject();
        System.out.println("AAAA "+id);
        request.setOperation(IOperation.VRATI_STAVKE_ZA_PORUDZBINU);
        request.setData(id);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (List<StavkaPorudzbineEntity>) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }
    
     public static KupacEntity izmeniKupca(KupacEntity kupac) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.IZMENI_KUPCA);
        request.setData(kupac);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (KupacEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }
     public static ProizvodEntity izmeniProizvod(ProizvodEntity proizvod) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.IZMENI_PROIZVOD);
        request.setData(proizvod);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (ProizvodEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }
     public static PorudzbinaEntity izmeniPorudzbinu(PorudzbinaEntity porudzbina) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.IZMENI_PORUDZBINU);
        request.setData(porudzbina);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (PorudzbinaEntity) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

     public static boolean obrisiKupca(KupacEntity kupac) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.OBRISI_KUPCA);
        request.setData(kupac);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (boolean) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static boolean obrisiProizvod(ProizvodEntity proizvod) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.OBRISI_PROIZVOD);
        request.setData(proizvod);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (boolean) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }
    
    public static boolean obrisiPorudzbinu(PorudzbinaEntity porudzbina) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.OBRISI_PORUDZBINU);
        request.setData(porudzbina);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (boolean) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static MestoEntity pronadjiMestoPrekoPtta(Long ptt) throws Exception{
         RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_MESTO_PTT);
        request.setData(ptt);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (MestoEntity) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static void zapamtiStavku(StavkaPorudzbineEntity stavka) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.ZAPAMTI_STAVKU);
        request.setData(stavka);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code != IStatus.OK) {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<PorudzbinaEntity> ucitajPorudzbine() throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE_PORUDZBINE);
        request.setData(new PorudzbinaEntity());
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<PorudzbinaEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<RadnikEntity> ucitajRadnike() throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE_RADNIKE);
        request.setData(new RadnikEntity());
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<RadnikEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static void izmeniStavke(List<StavkaPorudzbineEntity> stavke) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.IZMENI_STAVKE);
        request.setData(stavke);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code != IStatus.OK) {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static List<PorudzbinaEntity> ucitajPorudzbineZaKupca(String kupacJMBG) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE_PORUDZBINE_ZA_KUPCA);
        request.setData(kupacJMBG);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (List<PorudzbinaEntity>) response.getData();
        } else {
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static TipProizvodaEntity vratiTipProizvodaPoIDu(Long id) throws Exception{
         RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_TIPOVE_PROIZVODA_PO_ID);
        request.setData(id);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();

        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if (code == IStatus.OK) {
            return (TipProizvodaEntity) response.getData();
        } else {
            throw new Exception("Error in communication!");
        }
    }
     
     
}
