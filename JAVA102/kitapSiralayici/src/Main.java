import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> kitap=new TreeSet<>(new kitapSiralayici<>());
        TreeSet<Book> kitap2=new TreeSet<>(new sayfasayisi<>());

        kitap.add(new Book("SEFİLLER",384,"Victor HUGO",2014));
        kitap.add(new Book("ŞATO",377,"Franz KAFKA",2016));
        kitap.add(new Book("KIZIL",66,"Stefan ZWEIG",2018));
        kitap.add(new Book("EYLÜL",304,"Mehmet Rauf",2017));
        kitap.add(new Book("BİLİNMEYEN BİR KADININ MEKTUBU",
                62,"Stefan ZWEIG",2012));
        kitap.add(new Book("MEMLEKETİMDEN İNSAN MANZARALARI",
                535,"Nazım HIKMET",202));
        kitap.add(new Book("KÜRK MANTOLU MODANNA",
                160,"Sabahattin ALİ",1943));
        kitap.add(new Book("İNSAN NE İLE YAŞAR",96,
                "TOLSTOY",2012));
        kitap.add(new Book("SHERLOCK HOLMES PANİK",350,
                "Arthur CONAN",2012));
        kitap.add(new Book("BİR DELİNİN HATIRA DEFTERİ",127,
                "Nikolay GOGOL",2020));
        kitap.add(new Book("DON KİŞOT",488,"Miguel De cervantes",2016));

        kitap2.addAll(kitap);

        System.out.println("KİTAP İSMİNE GÖRE ALFABETİK SIRALAMA\n");
        for(Book sirala:kitap){
            System.out.println(sirala.getBookName());
        }
        System.out.println("-------------");
        System.out.println("SAYFA SAYISINA GÖRE ALFABETİK SIRALAMA\n");
        for(Book sirala2:kitap2){
            System.out.println(sirala2.getNumberOfPages()+" - "+ sirala2.getBookName());
        }




    }

}