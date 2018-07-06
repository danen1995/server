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
import transfer.request.RequestObject;
import transfer.response.ResponseObject;
import transfer.util.IOperation;
import transfer.util.IStatus;

/**
 *
 * @author FON
 */
public class Controller {

//    public static List<MestoEntity> vratiSvaMesta() throws Exception {
//        RequestObject request = new RequestObject();
//        request.setOperation(IOperation.VRATI_SVA_MESTA);
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
//            return (List<MestoEntity>) response.getData();
//        }else{
//            throw new Exception("Greska u komunikaciji!");
//        }
//    }

    public static List<ProizvodEntity> vratiSveProizvode() throws Exception {
        throw new UnsupportedOperationException();
    }

    public static MestoEntity pronadjiMestoPrekoPtta(Long cityCode) throws Exception {
        throw new UnsupportedOperationException();
    }

    public static void sacuvajPorudzbinu(PorudzbinaEntity porudzbina) throws Exception {
        throw new UnsupportedOperationException();
    }

    public static KupacEntity sacuvajKupca(KupacEntity kupac) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.SACUVAJ_KUPCA);
        request.setData(kupac);
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
            throw new Exception("Error in communication!");
        }
    }

    public static List<IDomainEntity> vratiSve(IDomainEntity ide) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.VRATI_SVE);
        request.setData(ide);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (List<IDomainEntity>) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }

    public static IDomainEntity sacuvaj(IDomainEntity ide) throws Exception{
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.SACUVAJ);
        request.setData(ide);
        Socket socket = Session.getInstance().getSocket();
        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(request);
        out.flush();
        
        //Sacekaj odgovor
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        ResponseObject response = (ResponseObject) in.readObject();
        int code = response.getCode();
        if(code == IStatus.OK){
            return (IDomainEntity) response.getData();
        }else{
            throw new Exception("Greska u komunikaciji!");
        }
    }

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
            throw new Exception("Error in communication!");
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
        request.setOperation(IOperation.IZMENI);
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
            throw new Exception("Error in communication!");
        }
    }
     public static ProizvodEntity izmeniProizvod(ProizvodEntity proizvod) throws Exception {
        RequestObject request = new RequestObject();
        request.setOperation(IOperation.IZMENI);
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
            throw new Exception("Error in communication!");
        }
    }

}
