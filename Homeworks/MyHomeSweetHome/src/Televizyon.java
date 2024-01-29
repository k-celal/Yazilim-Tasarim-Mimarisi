public class Televizyon {
    private int sesSeviyesi;
    private int kanal;
    public Televizyon() {
    }
    public void ac() {
        sesSeviyesi = 0;
        kanal = 1;
        System.out.println("Televizyon açıldı.");
    }
    public void kapat() {
        System.out.println("Televizyon kapatıldı.");
    }
    public void sesArtir() {
        sesSeviyesi++;
        System.out.println("Ses açıldı.");
    }
    public void sesAzalt() {
        sesSeviyesi--;
        System.out.println("Ses kapatıldı.");
    }
    public void kanalDegistir(int kanal) {
        System.out.println("Kanal değiştirildi: " + kanal);
    }
    public void kanalArtir() {
        kanal++;
        System.out.println("Kanal artırıldı.");
    }
    public void kanalAzalt() {
        kanal--;
        System.out.println("Kanal azaltıldı.");
    }
}
