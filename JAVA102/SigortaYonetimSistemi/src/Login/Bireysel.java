package Login;

import Sigorta.*;

public class Bireysel extends Account {
    private final String Bireysel="Bireysel";
    Sigorta sigorta;
    Login login=new Login();
    public Bireysel(User user){
        super(user);
    }


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
        int secim=login.scanner.nextInt();
        switch (secim){
            case 1:
                getUser().setSigorta(new ozelSaglikSigortasi(Bireysel));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
            case 2:
                getUser().setSigorta(new konutSigortasi(Bireysel));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
            case 3:
                getUser().setSigorta(new seyahatSigortasi(Bireysel));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;
            case 4:
                getUser().setSigorta(new ArabaSigortasi(Bireysel));
                getUser().setSigortaArrayList(getUser().getSigorta());
                System.out.println("Sigorta oluşturuldu");
                getUser().getSigorta().hesapla(Bireysel);
                System.out.println(getUser().getSigorta().getSigortaUcreti()+" lira");
                break;



        }
    }
}
