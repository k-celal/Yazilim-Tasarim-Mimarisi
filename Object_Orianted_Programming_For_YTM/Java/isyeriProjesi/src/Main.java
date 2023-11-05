public class Main {
    public static void main(String[] args) {
        Kullanici m1 = new Musteri("74185296");
        Musteri m2 = new Musteri("74185963");

        m1.giris();
        m2.giris();
        
        ((Musteri)m1).urunGoruntule();
        ((Musteri)m2).urunGoruntule();

    }

}
