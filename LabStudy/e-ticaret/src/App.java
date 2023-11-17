public class App {
    public static void main(String[] args) {
        Odeme odeme = new Odeme();

        // Örnek ürünlerin oluşturulması
        Urun urun1 = new Urun("Kalem", 5.99);
        Urun urun2 = new Urun("Defter", 9.99);
        Urun urun3 = new Urun("Kitap", 19.99);

        User user1 = new NormalUser();
        User user2 = new PremiumUser();
        user1.getSepet().urunEkle(urun3);
        user1.getSepet().urunEkle(urun2);
        user1.getSepet().urunEkle(urun1);
        user2.getSepet().urunEkle(urun3);
        user2.getSepet().urunEkle(urun2);
        user2.getSepet().urunEkle(urun1);

        odeme.odemeYap(user2);
        odeme.odemeYap(user1);

    }
}
