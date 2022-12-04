import java.util.ArrayList;
import java.util.Scanner;

public class CepTelefon extends Urun{

    Scanner scanner=new Scanner(System.in);
    private static ArrayList<CepTelefon> cepTelefons=new ArrayList<>();
    private static int id2=1;
    public CepTelefon( String name, Marka marka, int fiyat, int stok, double indirimOrani, int ram, int ekranBoyutu, int hafiza) {
        super(id2, name, marka, fiyat, stok, indirimOrani, ram, ekranBoyutu, hafiza);
        id2++;
    }

    public CepTelefon() {
    }
    @Override
    public void menu() {
        System.out.print(
                "1- Yeni cep telefonu ekle\n" +
                "2- cep telefonu listesini görüntüle\n" +
                "3- cep telefonu sil\n" +
                "4- cep telefonlarını id numaralarına göre sırala\n" +
                "5- cep telefonlarını markaya göre filtrele\n" +
                "Yapmak istediğiniz işlemi seçiniz : "
        );
        int secim= scanner.nextInt();
        if(secim==1)addItem();
        if (secim==2||secim==4)getProducts();
        if (secim==3)deleteItem();
        if(secim==5)markafiltrele();
    }


    public void print(ArrayList<CepTelefon> cepTelefons1) {
        if (cepTelefons1 == null) {
            cepTelefons1 = this.cepTelefons;
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (CepTelefon n : cepTelefons1) {
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(), n.getName(), n.getFiyat(), n.getMarka().getName(), n.getStok(),
                    n.getIndirimOrani(), n.getRam(), n.getEkranBoyutu(), n.getHafiza());
        }

    }

    @Override
    public void markafiltrele() {
        scanner.nextLine();
        System.out.print("Filtrelemek istediğiniz marka : ");
        String filtre= scanner.nextLine();
        ArrayList<CepTelefon>cepTelefons1=new ArrayList<>();
        for(CepTelefon c:cepTelefons){
            if(filtre.equals(c.getMarka().getName())){
                cepTelefons1.add(c);
            }
        }
        print(cepTelefons1);
    }

    @Override
    public void addItem() {
        System.out.print("CEP TELEFONU\nAdı : ");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.print("Fiyatı : ");
        int fiyat= scanner.nextInt();
        Marka.markalariEkranaYaz();
        System.out.print("Marka : ");
        Marka marka=Marka.getMarka(scanner.nextInt());
        System.out.print("Stok : ");
        int stok=scanner.nextInt();
        System.out.print("İndirim Oranı : ");
        double indirimOrani=scanner.nextDouble();
        System.out.print("RAM : ");
        int ram= scanner.nextInt();
        System.out.print("Ekran Boyutu : ");
        int ekranBoyutu= scanner.nextInt();
        System.out.print("Hafızası : ");
        int hafiza= scanner.nextInt();
        CepTelefon cepTelefon=new CepTelefon(name,marka,fiyat,stok,indirimOrani,ram,ekranBoyutu,hafiza);
        this.cepTelefons.add(cepTelefon);
        System.out.println("id : "+cepTelefon.getId());
    }

    @Override
    public void getProducts() {
        print(null);
    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.print("silinecek ürünün idsi : ");
        int id = scanner.nextInt();
        cepTelefons.remove(id - 1);
        getProducts();
    }


}
