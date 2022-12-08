package Login;


import java.util.Scanner;

public class AdresManager {
    static Account account;

    static Adres yeniadres;
    static Login login=new Login();
  static Scanner scanner= new Scanner(System.in);
    public static void adresEkle(User user) {
        login.duzcizgi();
        System.out.print("Adres Ekleme İşlemi\n\nÜlke : ");
        String Ulke=scanner.nextLine();
        System.out.print("Şehir : ");
        String Sehir=scanner.nextLine();
        System.out.print("İlçe : ");
        String ilce=scanner.nextLine();
        System.out.print("Mahalle : ");
        String mahalle=scanner.nextLine();
        System.out.print("Sokak : ");
        String sokak=scanner.nextLine();
        System.out.print("Ev Numarası : ");
        int evNumarasi=scanner.nextInt();
        System.out.print("1-Ev Adresi\n2-İş Adresi\nAdres Tipi : ");
        int secim=scanner.nextInt();
        if (secim==1) {
            yeniadres = new evAdresi(Sehir,Ulke,sokak,mahalle,ilce,evNumarasi);
        }
        if(secim==2){
            yeniadres=new isAdresi(Sehir,Ulke,sokak,mahalle,ilce,evNumarasi);
        }
        user.setAdreslist(yeniadres);
        System.out.println("Adres Eklendi");
        user.setAdreslist(yeniadres);

    }

    public static void adresSil(User user) {
        System.out.println("Adres Silme İşlemi\n");
        login.duzcizgi();
        user.getAdreslist().clear();
        System.out.println("silindi");

    }
}
