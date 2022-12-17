import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();
        list.add(new Book("Eylül",304,"Mehmet RAUF",2010));
        list.add(new Book("Bedel",150,"Ann WINTON",2015));
        list.add(new Book("Kızıl",65,"Stefan ZWEIG",2018));
        list.add(new Book("İnsan Ne İle Yaşar",96,"TOLSTOY",2020));
        list.add(new Book("Bir İdam Mahkumunun Son Günü",90,"Victor HUGO",2019));
        list.add(new Book("Milenaya Mektuplar",300,"Franz KAFKA",2015));
        list.add(new Book("Ölü Canlar",400,"GOGOL",2012));
        list.add(new Book("Sefiller",400,"Victor HUGO",2018));
        list.add(new Book("Bir Delinin Hatıra Defteri",125,"Nikolay GOGOL",2022));
        list.add(new Book("Bilinmeyen Bir Kadının Mektubu",62,"Stefan ZWEIG",2020));

        Map<String,String>kitapMap=new HashMap<>();
        list.stream().forEach(kitap->kitapMap.put(kitap.getKitapAdi(),kitap.getYazarAdi()));
        for (String k: kitapMap.keySet()) {
            System.out.println(k+"\t-\t"+kitapMap.get(k));
        }
        System.out.println(".......................................");
        System.out.println("sayfa sayısı 100den fazla olan kitaplar");
        list.stream().filter(sayfaSayisi->sayfaSayisi.getSayfaSayisi()>100).forEach(s-> System.out.println(s.getKitapAdi()));
    }
}