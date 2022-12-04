import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Urun {


    Main main = new Main();
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Notebook> notebooks = new ArrayList<>();

    private static int idd=1;

    public Notebook(String name, Marka marka, int fiyat, int stok, double indirimOrani, int ram, int ekranBoyutu, int hafiza) {
        super(idd, name, marka, fiyat, stok, indirimOrani, ram, ekranBoyutu, hafiza);
        idd++;
    }

    public Notebook() {

    }

    public void print(ArrayList<Notebook> notebookArrayList) {
        if(notebookArrayList==null) notebookArrayList=this.notebooks;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                  | Fiyatı          | Markası         | Stoğu        | İndirim Oranı      | RAM    | Ekran Boyutu      | Hafızası   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n:notebookArrayList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getFiyat(),n.getMarka().getName(),n.getStok(),
                    n.getIndirimOrani(),n.getRam(),n.getEkranBoyutu(),n.getHafiza());
        }
    }

    @Override
    public void addItem() {
        System.out.print("Notebook\nismi : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Fiyatı : ");
        int fiyat= scanner.nextInt();
        System.out.print("Stoğu : ");
        int stok= scanner.nextInt();
        System.out.print("İndirim Oranı : ");
        double indirimOrani=scanner.nextDouble();
        System.out.print("RAM : ");
        int ram= scanner.nextInt();
        System.out.print("Ekran Boyutu : ");
        int ekranBoyutu= scanner.nextInt();
        System.out.print("Hafızası : ");
        int hafiza= scanner.nextInt();
        System.out.println("Marka seçin ");
        Marka.markalariEkranaYaz();
        Marka marka=Marka.getMarka(scanner.nextInt());

        System.out.println();
        Notebook notebook=new Notebook( name, marka, fiyat, stok, indirimOrani, ram, ekranBoyutu, hafiza);
        this.notebooks.add(notebook);

        System.out.println("ID : "+notebook.getId());
    }

    @Override
    public void getProducts() {
        print(null);
    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.print("silinecek olan ürünün id si : ");
        int sid= scanner.nextInt();
        notebooks.remove(sid-1);
        getProducts();
    }

    public void markafiltrele(){
        scanner.nextLine();
        Marka.markalariEkranaYaz();
        System.out.print("filtrelenecek marka : ");
        String filtre= scanner.nextLine();
        ArrayList<Notebook> filtrele=new ArrayList<>();
        for(Notebook n:notebooks){
            if(filtre.equals(n.getMarka().getName())){
                filtrele.add(n);
            }
        }
        print(filtrele);
    }


    public void menu() {
        System.out.print(
                "1- Yeni Notebook ekle\n" +
                        "2- Notebook listesini görüntüle\n" +
                        "3- Notebook sil\n" +
                        "4- Notebookları id numaralarına göre sırala\n" +
                        "5- Notebookları markaya göre filtrele\n" +
                        "Yapmak istediğiniz işlemi seçiniz : "
        );
        int secim = scanner.nextInt();
        main.duzcizgi();
        if (secim==1) addItem();
        if (secim == 5) markafiltrele();
        if (secim == 2 ||secim==4) getProducts();
        if (secim==3) deleteItem();
    }
}
