import java.util.ArrayList;

public class Sepet {
    private ArrayList<Urun> urunler;

    public Sepet() {
        urunler= new ArrayList<>();
    }
    public void urunEkle(Urun urun){
        urunler.add(urun);
    }
    public void urunCikar(Urun urun){
        urunler.remove(urun);
    }
    public ArrayList<Urun> getUrunler() {
        return urunler;
    }
    


}