package Login;

import Sigorta.ArabaSigortasi;
import Sigorta.konutSigortasi;
import Sigorta.ozelSaglikSigortasi;
import Sigorta.seyahatSigortasi;

public class Kurumsal extends Account {
    private final String Kurumsal = "Kurumsal";

    Kurumsal(User user) {
        super(user);
    }

    Login login = new Login();

    @Override
    public void yenipolice() {
        login.duzcizgi();
        System.out.println("Yeni Poliçe\n");
        System.out.print(
                "Sigorta Çeşitleri\n\n" +
                        "1- Sağlık Sigortası\n" +
                        "2- Konut Sigortası\n" +
                        "3- Seyahat Sigortası\n" +
                        "4- Araba Sigortası\n\n" +
                        "Yapmak istediğiniz sigorta çeşidinin numarasını giriniz : "
        );
        int secim = login.scanner.nextInt();
        switch (secim) {
            case 1:
                getUser().setSigorta(new ozelSaglikSigortasi(Kurumsal));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
            case 2:
                getUser().setSigorta(new konutSigortasi(Kurumsal));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
            case 3:
                getUser().setSigorta(new seyahatSigortasi(Kurumsal));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
            case 4:
                getUser().setSigorta(new ArabaSigortasi(Kurumsal));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                getUser().getSigorta().hesapla(Kurumsal);
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
        }
    }
}
