import java.util.ArrayList;
import java.util.Scanner;
public class KanalListesi implements Arayuzler {
    private ArrayList<Kanal> kanalListesi;
    Scanner scanner = new Scanner(System.in);
    public KanalListesi() {
        kanalListesi = new ArrayList<>();
    }

    public void kanalEkle(Kanal kanal) {
        kanalListesi.add(kanal);
    }

    public void kanallariGoster() {
        for (Kanal kanal : kanalListesi) {
            System.out.println(kanal.getKanalAdi());
        }
    }

    public void kanalSec(MedyaOynaticiArayuz mediaOynatici) {
        kanallariGoster();
        System.out.print("Kanal seçiniz: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < kanalListesi.size()) {
            Kanal secilenKanal = kanalListesi.get(index);
            mediaOynatici.MedyaOynatArayuz(secilenKanal, this);
        } else {
            System.out.println("Geçersiz kanal seçimi!");
        }
    }
}

