package Login;

import java.util.TreeSet;

public class AccountManager {
    TreeSet<Account> kullanicilar = new TreeSet<>();

    public void kullacilarEkle() {
        Adres adres1 = new evAdresi("Düzce", "Türkiye", "11220", "elmalık", "merkez", 27);
        User user1 = new User(1, "Selin", "Tanla", "tanla@gmail.com", "lala", "dev", 22, adres1);
        Account account = new Bireysel(user1);

        kullanicilar.add(account);

        Adres adres2 = new isAdresi("İstanbul", "Türkiye", "11220", "asd", "lkjh", 1);
        User user2 = new User(2, "Rabia", "Mercan", "t@gmail.com", "lala", "boş işler müdürü", 15, adres2);
        Account account1 = new Kurumsal(user2);

        kullanicilar.add(account1);

    }

    public Account login(String email, String sifre) {
        kullacilarEkle();
        try {
            for (Account u : kullanicilar) {
                if (u.getUser().getEmail().equals(email) && u.getUser().getSifre().equals(sifre)) {
                    u.login(email, sifre, u);
                    return  u;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
