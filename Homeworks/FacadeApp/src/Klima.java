public class Klima {
    private int sicaklik;
    public Klima() {
    }
    public void ac() {
        sicaklik = 20;
        System.out.println("Klima açıldı.");
    }
    public void kapat() {
        System.out.println("Klima kapatıldı.");
    }
    public void guncelle(int sicaklik) {
        this.sicaklik = sicaklik;
        System.out.println("Sıcaklık güncellendi: " + sicaklik);
    }
}
