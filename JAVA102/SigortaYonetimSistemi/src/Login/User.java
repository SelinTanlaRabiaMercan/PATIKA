package Login;

import Sigorta.*;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private int id;
    private String isim;
    private String soyisim;
    private String email;
    private String sifre;
    private String meslek;
    private int yas;
    private Adres adres;

    private ArrayList<Adres> adreslist=new ArrayList<>();
    private Date sonGirisTarihi;
    private Sigorta sigorta;
    private ArrayList<Sigorta> sigortaArrayList=new ArrayList<>();

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

   // public void setAdreslist(Adres adreslist) {this.adreslist = adreslist;}
    public void setAdreslist(Adres addressList) {
        this.adreslist.add(addressList);
    }

    public Sigorta getSigorta() {
        return sigorta;
    }

    public void setSigorta(Sigorta sigorta) {
        this.sigorta = sigorta;
    }

    public ArrayList<Sigorta> getSigortaArrayList() {
        return sigortaArrayList;
    }

    public void setSigortaArrayList(Sigorta sigortaArrayList) {
        this.sigortaArrayList.add(sigorta);
    }

    public User(int id, String isim, String soyisim, String email, String sifre, String meslek, int yas, Adres adres) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;
        this.adres = adres;
        this.adreslist.add(adres);
        this.sonGirisTarihi = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Adres getAdres() {
        return adres;
    }



    public ArrayList<Adres> getAdreslist() {
        return adreslist;
    }



    public Date getSonGirisTarihi() {
        return sonGirisTarihi;
    }

    public void setSonGirisTarihi(Date sonGirisTarihi) {
        this.sonGirisTarihi = sonGirisTarihi;
    }


}
