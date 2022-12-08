package Sigorta;

import java.util.Date;

public class seyahatSigortasi extends  Sigorta{


    @Override
    public void hesapla(String sigortaTipi) {
        double fiyat = 2000;
        if(sigortaTipi.equals("Bireysel")){
            setSigortaUcreti(fiyat);
        }if (sigortaTipi.equals("Kurumsal")){
            setSigortaUcreti(fiyat*0.02);
        }

    }

    public seyahatSigortasi(String sigortaTipi ) {
        super("seyahat Sigortası");
        hesapla(sigortaTipi);
    }
}
