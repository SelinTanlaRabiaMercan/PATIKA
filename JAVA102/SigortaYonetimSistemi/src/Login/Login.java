package Login;

import java.util.Scanner;

public class Login {
    public Scanner scanner = new Scanner(System.in);

    Adres adres;
    AccountManager accountManager=new AccountManager();
    public void login() {
        duzcizgi();
        System.out.print("GİRİŞ İŞLEMİ\n\nEmail : ");
        String email=scanner.nextLine();
        System.out.print("Şifre : ");
        String sifre= scanner.nextLine();
        Account giris=accountManager.login(email,sifre);
        if(giris!=null){
            giris.bilgileriGoster();
            run(giris);
        }
        else {
            System.out.println("Hatalı Giriş");
        }

    }
    public void run(Account account) {
        duzcizgi();
        System.out.print(
                "İŞLEM LİSTESİ\n\n" +
                        "1- Kullanıcı bilgilerini göster\n" +
                        "2- Kullanıcıya yeni poliçe yap\n" +
                        "3- Kullanıcıya yeni adres ekle\n" +
                        "4- Kullanıcı adresi sil\n" +
                        "5-Kullanıcı Adres detaylarını göster\n" +
                        "9- Programdan çıkış yap.\n" +
                        "\n"
        );

        while (true) {
            duzcizgi();
            System.out.print("Seçiminiz : ");
            int secim = scanner.nextInt();
            if (secim == 1) {
                account.bilgileriGoster();
            }
            if (secim == 2) {
                account.yenipolice();
            }
            if (secim == 3) {
                account.adresEkle();
            }
            if (secim == 4) {
                account.adresSil();
            }
            if (secim == 5) {
                account.adresyaz();
            }
            if (secim == 9) {
                System.exit(0);
            }
        }
    }

    public void duzcizgi() {
        System.out.println("...............................................");
    }

}
