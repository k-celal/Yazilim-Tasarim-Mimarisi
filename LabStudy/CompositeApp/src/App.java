public class App {
    public static void main(String[] args) throws Exception {
        Gelistiriciler gel1 = new Gelistiriciler("Ali", "Gelistirici");
        Tasarimcilar tas1 = new Tasarimcilar("Veli", "Tasarimci");
        Yoneticiler yon1 = new Yoneticiler("Ahmet", "Yonetici");
        InsanKaynaklari ik1 = new InsanKaynaklari("Mehmet", "Insan Kaynaklari");
        ik1.calisanEkle(gel1);
        ik1.calisanEkle(tas1);
        ik1.calisanEkle(yon1);
        ik1.Goster();
    }
}
