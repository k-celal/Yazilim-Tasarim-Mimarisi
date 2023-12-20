public class Isik {
    private boolean durum[];
    public Isik() {
        durum = new boolean[3];
    }
    public void ac(int isik) {
        durum[isik] = true;
        System.out.println("Işık açıldı.");
    }
    public void kapat(int isik) {
        durum[isik] = false;
        System.out.println("Işık kapatıldı.");
    }
    
}
