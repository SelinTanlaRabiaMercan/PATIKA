package Login;

import sun.rmi.runtime.Log;

public class evAdresi implements Adres {
    private String adresId;
    private String sehir;
    private String ulke;
    private String sokak;
    private String mahalle;
    private String ilce;
    private int evnumarasi;

    public evAdresi(String sehir, String ulke, String sokak, String mahalle, String ilce, int evnumarasi) {
        this.adresId = adresId;
        this.sehir = sehir;
        this.ulke = ulke;
        this.sokak = sokak;
        this.mahalle = mahalle;
        this.ilce = ilce;
        this.evnumarasi = evnumarasi;
    }

    public int getEvnumarasi() {
        return evnumarasi;
    }

    public void setEvnumarasi(int evnumarasi) {
        this.evnumarasi = evnumarasi;
    }

    public String getAdresId() {
        return adresId;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
Login login=new Login();
    User user;
    @Override
    public void showadresInfo() {
        login.duzcizgi();
        System.out.println(
                "\nLogin.Adres Id    : " + this.getAdresId() +
                        "\nÜlke        : " + this.getUlke() +
                        "\nŞehir       : " + this.getSehir() +
                        "\nİlçe        : " + this.getIlce() +
                        "\nMahalle     : " + this.getMahalle() +
                        "\nSokak       : " + this.getSokak() +
                        "\nEv Numarası : " + this.getEvnumarasi()
        );
    }


}
