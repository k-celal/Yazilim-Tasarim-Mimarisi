import java.util.ArrayList;

interface Pano{
    public double Hesapla(ArrayList<Sekil> sekiller);
}
class AlanPano implements Pano{
    public double Hesapla(ArrayList<Sekil> sekiller){
        double toplam = 0;
        for(Sekil sekil : sekiller){
            if(sekil instanceof IAlan){
                toplam += ((IAlan)sekil).alanHesapla();
            }
        }
        return toplam;
    }
}
class CevrePano implements Pano{
    public double Hesapla(ArrayList<Sekil> sekiller){
        double toplam = 0;
        for(Sekil sekil : sekiller){
            if(sekil instanceof ICevre){
                toplam += ((ICevre)sekil).cevreHesapla();
            }
        }
        return toplam;
    }
}
