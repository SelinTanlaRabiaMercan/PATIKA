public abstract class Urun {
    private int id;
    private String name;
    private Marka marka;
    private int fiyat;
    private int stok;
    private double indirimOrani;
    private int ram;
    private int ekranBoyutu;
    private int hafiza;

    public Urun(int id, String name, Marka marka, int fiyat, int stok, double indirimOrani, int ram, int ekranBoyutu, int hafiza) {
        this.id = id;
        this.name = name;
        this.marka = marka;
        this.fiyat = fiyat;
        this.stok = stok;
        this.indirimOrani = indirimOrani;
        this.ram = ram;
        this.ekranBoyutu = ekranBoyutu;
        this.hafiza = hafiza;
    }
    public  Urun(){

    }

    public abstract void menu();

    public abstract void addItem();

    public abstract void getProducts();

    public abstract void deleteItem();
    public abstract void markafiltrele();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(double indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(int ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getHafiza() {
        return hafiza;
    }

    public void setHafiza(int hafiza) {
        this.hafiza = hafiza;
    }
}
