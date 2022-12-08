package Sigorta;

import java.util.Date;

public abstract class Sigorta {
    private String sigortaIsmi;
    private double sigortaUcreti;
    private Date sigortaBaslangic;
    private Date sigortaBitis;

    public abstract void hesapla(String sigortaTipi);
    public Sigorta(String sigortaIsmi) {
        this.sigortaIsmi = sigortaIsmi;
        this.sigortaUcreti = sigortaUcreti;
        this.sigortaBaslangic = sigortaBaslangic;
        this.sigortaBitis = sigortaBitis;
    }

    public String getSigortaIsmi() {
        return sigortaIsmi;
    }

    public void setSigortaIsmi(String sigortaIsmi) {
        this.sigortaIsmi = sigortaIsmi;
    }

    public double getSigortaUcreti() {
        return sigortaUcreti;
    }

    public void setSigortaUcreti(double sigortaUcreti) {
        this.sigortaUcreti = sigortaUcreti;
    }

    public Date getSigortaBaslangic() {
        return sigortaBaslangic;
    }

    public void setSigortaBaslangic(Date sigortaBaslangic) {
        this.sigortaBaslangic = sigortaBaslangic;
    }

    public Date getSigortaBitis() {
        return sigortaBitis;
    }

    public void setSigortaBitis(Date sigortaBitis) {
        this.sigortaBitis = sigortaBitis;
    }
}
