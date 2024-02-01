public class App {
    public static void main(String[] args) throws Exception {

        KanalListesi kanalListesi = new KanalListesi();
        kanalListesi.kanalEkle(new Kanal("MXTV", "MXTV.player"));
        kanalListesi.kanalEkle(new Kanal("CKTV", "CKTV.player"));
        kanalListesi.kanalEkle(new Kanal("CeloRadio", "CeloRadio.player"));
        MedyaOynaticiArayuz mediaOynatici = new MedyaOynaticiArayuz();
        kanalListesi.kanalSec(mediaOynatici);
    }
}