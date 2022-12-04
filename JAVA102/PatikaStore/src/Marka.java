import java.util.Comparator;
import java.util.TreeSet;

public class Marka {
    static Main main=new Main();
    private int id;
    private String name;

    public Marka(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Marka getMarka(int id) {
        for(Marka m:markaListesi){
            if(id==m.getId()){
                return m;
            }
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static TreeSet<Marka> markaListesi = new TreeSet<>(new Comparator<Marka>() {
        @Override //sıralama
        public int compare(Marka o1, Marka o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });

    static {
        markaolustur();
       // markalariEkranaYaz();
    }

    public static void markaolustur() {
        markaListesi.add(new Marka(1, "Samsung"));
        markaListesi.add(new Marka(2, "Lenovo"));
        markaListesi.add(new Marka(3, "Apple"));
        markaListesi.add(new Marka(4, "Huawei"));
        markaListesi.add(new Marka(5, "Casper"));
        markaListesi.add(new Marka(6, "Asus"));
        markaListesi.add(new Marka(7, "HP"));
        markaListesi.add(new Marka(8, "Xiaomi"));
        markaListesi.add(new Marka(9, "Monster"));
    }
    public static void markalariEkranaYaz(){
        System.out.println("Markalar");
        for(Marka markayaz:markaListesi){
            System.out.println(markayaz.getId()+" - "+markayaz.getName());
        }
        main.duzcizgi();
    }
}
