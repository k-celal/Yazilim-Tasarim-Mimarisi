import java.util.ArrayList;
import java.util.List;
public class InsanKaynaklari extends Calisanlar {

    private List<Calisanlar> calisanlar;

    public InsanKaynaklari(String ad, String pozisyon) {
        super(ad, pozisyon);
        calisanlar = new ArrayList<>();
    }

    public void calisanEkle(Calisanlar calisan) {
        calisanlar.add(calisan);
    }
    @Override
    public void Goster(){
        System.out.println("Ad: " + getAd() + " Pozisyon: " + getPozisyon());
        for (Calisanlar calisan : calisanlar) {
            calisan.Goster();
        }
    }   
    

}