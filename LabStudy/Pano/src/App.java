import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Kare kare1=new Kare(10);
        Dikdortgen dk1= new Dikdortgen(10, 15);
        Daire d1= new Daire(20);
        Ucgen u1 = new Ucgen(5, 10);
        
        ArrayList<Sekil> liste = new ArrayList<>();
        liste.add(kare1);
        liste.add(dk1);
        liste.add(d1);
        liste.add(u1);

        AlanPano aPano = new AlanPano();
        CevrePano cPano= new CevrePano();

        System.out.println(aPano.Hesapla(liste));
        System.out.println(cPano.Hesapla(liste));
    }
}


        
