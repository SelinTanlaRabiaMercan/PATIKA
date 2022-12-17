public class Book {
    private String kitapAdi;
    private int sayfaSayisi;
    private String yazarAdi;
    private int yayinTarihi;

    public Book(String kitapAdi, int sayfaSayisi, String yazarAdi, int yayinTarihi) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarAdi = yazarAdi;
        this.yayinTarihi = yayinTarihi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinTarihi() {
        return yayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        this.yayinTarihi = yayinTarihi;
    }
}
