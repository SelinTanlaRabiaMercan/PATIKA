import java.util.Scanner;

public class PatikaStore {
    Main main=new Main();
    public void  run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            main.duzcizgi();
            System.out.print(
                    "PATİKA STORE ÜRÜN YÖNETİM PANELİ\n" +
                            "1 - Notebook İşlemleri\n" +
                            "2 - Cep Telefonu İşlemleri\n" +
                            "3 - Marka Listele\n" +
                            "4 - Çıkış Yap\n" +
                            "Yapmak işlediğiniz işlem : "
            );
            int secim = scanner.nextInt();
            main.duzcizgi();
            switch (secim) {
                case 1:
                    Notebook notebook=new Notebook();
                    notebook.menu();
                    break;
                case 2:
                    CepTelefon cepTelefon=new CepTelefon();
                    cepTelefon.menu();
                    break;
                case 3:
                    Marka.markalariEkranaYaz();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Geçersiz işlem");
            }
        }
    }

}
