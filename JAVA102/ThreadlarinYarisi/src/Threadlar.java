import java.util.ArrayList;
import java.util.List;

public class Threadlar implements Runnable {
    private List<Integer> tumlist=new ArrayList<>();
    private static final List<Integer> teklist = new ArrayList<>();
    private static final List<Integer> ciftlist = new ArrayList<>();

    public Threadlar(List<Integer> listee){
       this.tumlist=listee;
    }
    public void Threadlar() {
        for (Integer i : tumlist) {
            if (i % 2 == 0) {
                ciftlist.add(i);
            }
            if (i % 2 != 0) {
                teklist.add(i);
            }
        }

    }
    @Override
    public void run() {
        Threadlar();
    }
    public static List<Integer> teklist(){
        return teklist;
    }
    public static List<Integer> ciftlist(){
        return ciftlist;
    }
    public static void getListSize(){
        System.out.println("tek sayı boyutu: " + teklist.size());
        System.out.println("çift sayı boyutu: " + ciftlist.size());
    }
}
