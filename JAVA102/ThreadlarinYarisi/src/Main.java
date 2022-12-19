import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args)  {
        List<Integer> onbinliste=new ArrayList<>();
        List<Integer> tekliste=new ArrayList<>();
        List<Integer> ciftliste=new ArrayList<>();
        for (int i = 0; i <=10000 ; i++) {
            onbinliste.add(i);
            System.out.println(onbinliste.get(i));
        }/*
        List<Integer>altliste1=onbinliste.subList(0,2500);
        List<Integer>altliste2=onbinliste.subList(2500,5000);
        List<Integer>altliste3=onbinliste.subList(5000,7500);
        List<Integer>altliste4=onbinliste.subList(7500,10000);
        *//*
        for (int i = 0; i < 2500; i++) {
            System.out.println(altliste3.get(i));
        }*/
        Threadlar threadlar=new Threadlar(onbinliste);
        //4 eşit parçaya bölme şeysi
        ExecutorService pool= Executors.newFixedThreadPool(4);
        //threadlar.Threadlar();
        for (int i = 0; i <4 ; i++) {
            int x=i*2500;
            int y=x+2500;
            pool.execute(new Threadlar(onbinliste.subList(x,y)));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        pool.shutdown();
        
        System.out.println("Tek sayılar " + Threadlar.teklist());
        System.out.println("çift sayılar : " + Threadlar.ciftlist());
        Threadlar.getListSize();

    }
}