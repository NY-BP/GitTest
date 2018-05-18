/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.io.Serializable;

/**
 *
 * @author Safi
 */
public class Konyv implements Serializable {
    private int id;
    private String iroKolto;
    private String cim;
    private String hollet;

    public Konyv(String iroKolto, String cim, String hollet) {
        this.iroKolto = iroKolto;
        this.cim = cim;
        this.hollet = hollet;
    }

    public Konyv(int id, String iroKolto, String cim, String hollet) {
        this.id = id;
        this.iroKolto = iroKolto;
        this.cim = cim;
        this.hollet = hollet;
    }

    public Konyv() {
    }

    public String getIroKolto() {
        return iroKolto;
    }

    public void setIroKolto(String iroKolto) {
        this.iroKolto = iroKolto;
    }

    @Override
    public String toString() {
        return iroKolto+" || " + cim +" || "+hollet;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getHollet() {
        return hollet;
    }

    public void setHollet(String hollet) {
        this.hollet = hollet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
    