package Sigorta;

import java.util.Date;

public class ozelSaglikSigortasi extends Sigorta{

    @Override
    public void hesapla(String sigortaTipi) {
        double fiyat = 2000;
        if(sigortaTipi.equals("Bireysel")){
            setSigortaUcreti(fiyat);
        }if (sigortaTipi.equals("Kurumsal")){
            setSigortaUcreti(fiyat*0.02);
        }

    }

    public ozelSaglikSigortasi(String sigortaTipi ) {
        super("sağlık Sigortası");
        hesapla(sigortaTipi);
    }
}
